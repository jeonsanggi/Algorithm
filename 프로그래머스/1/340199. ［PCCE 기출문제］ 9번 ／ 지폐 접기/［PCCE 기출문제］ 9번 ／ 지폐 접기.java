
class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        while(isContinue(wallet, bill)) {
            if(bill[0] > bill[1]) {
                bill[0] = bill[0]/2;
            } else {
                bill[1] = bill[1]/2;
            }
            answer += 1;
        }
        
        return answer;
    }
    
    private boolean isContinue(int[] wallet, int[] bill) {
        int billMinValue = Math.min(bill[0], bill[1]);
        int walletMinValue = Math.min(wallet[0], wallet[1]);
        int billMaxValue = Math.max(bill[0], bill[1]);
        int walletMaxValue = Math.max(wallet[0], wallet[1]);
        
        return billMinValue > walletMinValue || billMaxValue > walletMaxValue;
    }
}