package DSA.Pepcoding.Stack;
/*
Not a 100% correct avoid or inspect carefully look for to string method
and push1 and pop methods
 */
class TwoStack{
    int arr[];
    int top,top2,cap;
    TwoStack(int c){
        cap=c;
        top=c/2+1;
        top2=c/2;
        arr=new int[cap];
    }

    void push1(int i){
        if(top>0){
            top--;
            arr[top]=i;
        }else{
            System.out.println("StackOverFlow");
        }
    }

    void push2(int i){
        if(top2<cap-1){
            top++;
            arr[top]=i;
        }else{
            System.out.println("StackOverFlow");
        }
    }

    void pop1(){
        if(top<=cap/2){
            System.out.println(arr[top]);
            top--;
        }else {
            System.out.println("UnderFlow");
        }
    }

    void pop2(){
        if(top<=cap/2){
            System.out.println(arr[top]);
            top--;
        }else{
            System.out.println("Underflow");
        }
    }

    @Override
    public  String toString(){
        StringBuilder str1 = new StringBuilder();
        for(int i=top; i<=cap/2-1; i++){
            str1.append(arr[i]);
            if(i<cap/2-1){
                str1.append(",");
            }
        }
        return str1.toString();
    }
}
public class InefficientTwoArrStack {
    public static void main(String[] args) {
        TwoStack s = new TwoStack(6);
        s.push1(10);
        s.push1(20);
        s.push1(30);
        s.push1(40);
        System.out.println(s);
    }
}
