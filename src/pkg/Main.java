package pkg;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.toLowerCase().split("");
        boolean flag=true;
        System.out.println(s);
        
        for(String x : str) {
            answer += flag ? x.toUpperCase() : x;
            flag = x.equals(" ") ? true : false;
        }
         
        return answer;
    }
}