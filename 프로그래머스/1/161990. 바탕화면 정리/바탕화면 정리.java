class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {50, 50, 0, 0};
        
        int l = 0;
        int r = 0;
        for (int i=0; i < wallpaper.length; i++){
            l = wallpaper[i].indexOf("#");
            r = wallpaper[i].lastIndexOf("#");
            if(l > -1) {
                if(i < answer[0]) {
                    answer[0] = i;    
                }
                if(l < answer[1]) {
                    answer[1] = l; 
                }
            }
            
            if(r > -1) {
                if(i > answer[2] -1) {
                    answer[2] = i + 1;
                }
                
                if(r > answer[3] -1) {
                    answer[3] = r + 1;
                }
            }
        }
        
        return answer;
    }
}