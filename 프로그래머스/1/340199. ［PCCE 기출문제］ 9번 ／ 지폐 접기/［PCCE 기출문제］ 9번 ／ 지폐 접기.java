
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(max(wallet) < max(bill) || min(wallet) < min(bill)) {
            if(bill[0] > bill[1]) {
                bill[0] = bill[0]/2;
            } else {
                bill[1] = bill[1]/2;
            }
            answer += 1;
        }
        
        return answer;
    }
    
    private int max(int[] arr) {
        return Math.max(arr[0], arr[1]);
    }

    private int min(int[] arr) {
        return Math.min(arr[0], arr[1]);
    }
}