public class stack {
    int size;
    int[] stackArr;
    int top;
    public stack(int size,int[] stackArr,int top){
        this.size = size;
        this.stackArr = stackArr;
        this.top=top;
    }
    public int peek(){
        return stackArr[top];
    }
    public int pop(){
        return stackArr[top--];
    }
    public void push(int value){
        stackArr[++top]=value;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return  top==size-1;
    }
}
