package DSA.Pepcoding.Stack;

class TwoStacks{
    int top1,top2,cap;
    int arr[];

    TwoStacks(int c){
        cap=c;
        top1=-1;
        top2=c;
        arr=new int[c];
    }

    void push1(int i){
        if(top1<top2-1){
            top1++;
            arr[top1]=i;
        }else{
            System.out.println("Overflow ! "+"for stack1 "+i);
        }
    }

    void push2(int i){
        if(top1<top2-1){
            top2--;
            arr[top2]=i;
        }else{
            System.out.println("Overflow ! for stack 2 "+i);
        }
    }

    void pop1(){
        if(top1>=0){
            System.out.println(arr[top1]);
            top1--;
        }else{
            System.out.println("Underflow for stack 1 ");
        }
    }

    void pop2(){
        if(top2<cap){
            System.out.println(arr[top2]);
            top2++;
        }else{
            System.out.println("Underflow for stack 2 ");
        }
    }

    public String toString(){
        StringBuilder s = new StringBuilder();
        s.append('[');
        for(int i = 0; i <= top1; i++){
            s.append(arr[i]);
            if(i < top1) {
                s.append(',');
            }
        }
        s.append(" | ");
        for(int i = cap - 1; i >= top2; i--){
            s.append(arr[i]);
            if(i > top2) {
                s.append(',');
            }
        }
        s.append(']');
        return s.toString();
    }
}
public class EfficientTwoStack {
    public static void main(String[] args) {
        TwoStacks s=  new TwoStacks(6);
        s.push1(10);
        s.push1(20);
        s.push1(30);

        s.push1(50);
        s.push2(60);
        s.push2(70);
        s.push1(80);
        System.out.println(s);
    }
}
