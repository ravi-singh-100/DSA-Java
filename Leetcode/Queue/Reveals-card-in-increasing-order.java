Ques:

class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Deque<Integer>dq=new ArrayDeque<>();
        int index=0;
        int flip=0;
        Arrays.sort(deck);
        int[]ans=new int[deck.length];
        for(int i=0;i<deck.length;i++){
            dq.addLast(i);
        }
        while(dq.size()>0){
            if(flip==0){
ans[dq.removeFirst()]=deck[index++];

            }
            else{
dq.addLast(dq.removeFirst());
            }
            flip^=1;
        }
        return ans;
    }
}
