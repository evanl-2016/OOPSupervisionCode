public class LinkedList {
    private int value;
    private LinkedList tail;
    private boolean Final;

    public LinkedList(int value,LinkedList tail,boolean Final){
        this.value = value;
        this.tail=tail;
        this.Final=Final;
    }

    public int getHead(){
        return value;
    }
    public void addValue(int newVal){
        tail = this;
        value = newVal;
    }
    public LinkedList remove(int index){
        if(index == 0||Final==true){
            return tail;
        }
        else{
            return tail.remove(index-1);
        }
    }
    public int getIndex (int n){
        if(n==0){
            return value;
        }
        else{
            return tail.getIndex(n-1);
        }
    }
    public int getLength(){
        if(Final == true){return 0;}
        else{
            return 1+tail.getLength();
        }
    }
    public boolean isCyclical(){

        return false;
    }
    private boolean innerCyclical(LinkedList[] visited,LinkedList list){
        for (LinkedList i:
             visited) {
            if(i==list){
                return true;
            }
        }
        LinkedList[] newVisited = new LinkedList[visited.length+1];
        System.arraycopy(visited,0,newVisited,0,visited.length);
        newVisited[visited.length] = list;
        return innerCyclical(newVisited,list.tail);
    }
}
