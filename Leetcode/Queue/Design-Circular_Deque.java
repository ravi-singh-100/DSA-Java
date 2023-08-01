// Ques:https://leetcode.com/problems/design-circular-deque/

class MyCircularDeque {
int []arr;
int size;
int front;
int rear;
    public MyCircularDeque(int k) {
        this.arr=new int[k];
        this.front=-1;
        this.rear=-1;
        this.size=0;
    }
    
    public boolean insertFront(int value) {
         if(size==arr.length)return false;
    if(rear==-1){
        front=0;
        rear=0;
    }
else if(front!=0){
    front--;
}
else{
    front=arr.length-1;
}
arr[front]=value;
size++;
System.out.println(size+"size");
return true;
    }
    
    public boolean insertLast(int value) {
        if(size==arr.length)return false;
        if(rear==-1){
            rear=0;
            front=0;
        }
      else  if(front!=0&&rear==arr.length-1){
            rear=0;
        }
        else{
            rear++;
        }
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(size==0)return false;
if(rear==front){
    rear=-1;
    front=-1;
}
else if(front==arr.length-1){
    front=0;
}
else{
    front++;
}
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(size==0)return false;
        if(front==0&&rear==0){
            rear=-1;
            front=-1;
        }
      else  if(rear==0){
          rear=arr.length-1;
        }
        else{
            rear--;
        }
        size--;
        return true;
    }
    
    public int getFront() {
        // System.out.println("front"+arr[front]+" "+front);
        if(size==0)return -1;
        return arr[front];
    }
    
    public int getRear() {
            // System.out.println("rear"+arr[rear]+" "+rear);
            if(size==0)return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
