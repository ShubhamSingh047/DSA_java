package DSA.Pepcoding.Stack;

public class CoustomeStack {
    int arr[];
    int top;
    int cap;

    CoustomeStack(int c){
        top=-1;
        cap=c;
        arr=new int[c+1];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=top; i++){
            sb.append(arr[i]);
            if(i<top){
                sb.append(",");
            }
        }
        return sb.toString();
    }

     void push(int i){
        if(top==cap-1){
            System.out.println("Stack is filled and thus cannot be filled Further !");
        }else {
            top++;
            arr[top] = i;
        }
    }

    void pop(){
        if(top==-1){
            System.out.println("stack is already empty !");
        }else {
            int res = arr[top];
            top--;
            System.out.println(res+" Poped !");
        }
    }

    void size(){
        System.out.println(top+1+" Current size of Stack out of "+cap);
    }

    boolean isEmpty(){
        return top==-1;
    }
}
