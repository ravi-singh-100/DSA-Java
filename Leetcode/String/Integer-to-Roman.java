// Ques:https://leetcode.com/problems/integer-to-roman/description/

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(50,"L");
        map.put(200,"CC");
        map.put(300,"CCC");
map.put(600,"DC");
map.put(700,"DCC");
map.put(2000,"MM");
map.put(3000,"MMM");
map.put(800,"DCCC");
        map.put(100,"C");
        map.put(500,"D");
        map.put(1000,"M");
        map.put(4,"IV");
        map.put(9,"IX");
        map.put(40,"XL");
        map.put(90,"XC");
        map.put(400,"CD");
        map.put(900,"CM");
        map.put(0,"");
        int mul=1;
        String ans="";
        while(num>0){
            int rem=num%10;
            rem=mul*rem;
            ans=map.get(rem)+ans;
            mul*=10;
            num/=10;
        }
        return ans;
    }
}
