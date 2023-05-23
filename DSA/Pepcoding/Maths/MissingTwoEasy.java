package DSA.Pepcoding.Maths;

public class MissingTwoEasy {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,0,0};
        boolean mark[] = new boolean[6];
        for(int i=0; i<6; i++){
            if(arr[i]!=0){
                mark[arr[i]]=true;
            }
        }

        for(int i=0; i<6; i++){
            if(!mark[arr[i]]) System.out.println(i+1);
        }
    }
}
