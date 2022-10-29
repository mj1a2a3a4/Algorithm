class Solution {
    public int[] solution(int[] num_list) {
      
        int 짝수개수=0;
        int 홀수개수=0;
        for(int i=0; i<num_list.length ; i++){
            if(num_list[i]%2==0)
                짝수개수++;
            else
                홀수개수++;
            
        }

        return new int[] {짝수개수, 홀수개수};
    }
}