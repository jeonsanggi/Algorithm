import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        String LAST_TIME = "23:59";
        Map<String, String> car = new HashMap<>();
        Map<String, Integer> accumulateTime = new HashMap<>();

        for (String record : records) {
            String[] splitRecord = record.split(" ");
            String time = splitRecord[0];
            String carNumber = splitRecord[1];
            String type = splitRecord[2];

            if (type.equals("IN")) {
                car.put(carNumber, time);
            } else {
                calculateAccumulateTime(car, carNumber, time, accumulateTime);
            }
        }

        List<String> carNumbers = new ArrayList<>(car.keySet());
        for (String carNumber : carNumbers) {
            calculateAccumulateTime(car, carNumber, LAST_TIME, accumulateTime);
        }

        return calculateFee(accumulateTime, fees);
    }

    private void calculateAccumulateTime(Map<String, String> car, String carNumber, String time,
        Map<String, Integer> accumulateTime) {
        String inTime = car.remove(carNumber);
        int parkingTime = getParkingTime(inTime, time);
        int accumulate = accumulateTime.getOrDefault(carNumber, 0) + parkingTime;
        accumulateTime.put(carNumber, accumulate);
    }

    private int getParkingTime(String inTime, String outTime) {
        int in = convertToMinute(inTime);
        int out = convertToMinute(outTime);

        return out - in;
    }

    private int convertToMinute(String time) {
        String[] splitTime = time.split(":");
        return (Integer.parseInt(splitTime[0]) * 60) + Integer.parseInt(splitTime[1]);
    }

    private int[] calculateFee(Map<String, Integer> accumulateTime, int[] fees) {
        List<String> sortedKeys = new ArrayList<>(accumulateTime.keySet());
        Collections.sort(sortedKeys);

        int size = sortedKeys.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) {
            Integer accumulate = accumulateTime.get(sortedKeys.get(i));
            int fee = fees[1];

            if(accumulate - fees[0] > 0){
                fee += (int) Math.ceil((double) (accumulate - fees[0]) / fees[2]) * fees[3];
            }

            answer[i] = fee;
        }

        return answer;
    }
}