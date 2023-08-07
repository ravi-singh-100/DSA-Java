// QUes:https://leetcode.com/problems/restore-ip-addresses/

class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<Integer>li=new ArrayList<>();
        List<String>ans=new ArrayList<>();
        helper(s,li,0,ans);
        return ans;
    }
    public void helper(String s,List<Integer>li,int index,List<String>ans){
        if(li.size()==4&&index!=s.length()) return ;
        if(index==s.length()&&li.size()==4){
            StringBuilder sb=new StringBuilder();
            int i;
for(i=0;i<li.size()-1;i++){
    sb.append(li.get(i)+".");
    // System.out.println(li.get(i)+".");
}
sb.append(li.get(i));
ans.add(sb.toString());
return ;
        }
        int num=0;
        for(int i=index;i<s.length();i++){
num=num*10+(s.charAt(i)-'0');
if(num>=0&&num<256&&li.size()<5){
    li.add(num);
    helper(s,li,i+1,ans);
    li.remove(li.size()-1);
}
if(index==i&&s.charAt(i)=='0') return;
        }
        return;
    }
}
