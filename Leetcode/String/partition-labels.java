// Ques:https://leetcode.com/problems/partition-labels/description/

class Solution {
    public List<Integer> partitionLabels(String s) {
        int []lastIndex=new int[26];
        for(int i=0;i<s.length();i++){
    lastIndex[s.charAt(i)-'a']=i;
        }
        List<Integer>li=new ArrayList<>();
        int i=0;
        while(i<s.length()){
int j=i;
int end=lastIndex[s.charAt(i)-'a'];
String ans="";
while(end<s.length()&&j<=end){
ans+=s.charAt(j);
end=Math.max(end,lastIndex[s.charAt(j)-'a']);
j++;
}
li.add(ans.length());
ans="";
i=j;
        }
    return li;
    }
}
