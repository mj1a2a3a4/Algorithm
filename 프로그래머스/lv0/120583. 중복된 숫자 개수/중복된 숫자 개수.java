class Solution {
    public int solution(int[] array, int n) {
        int same = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]==n){
                same+=1;
            }
        }
        int answer = same;
        
        return answer;
    }
}