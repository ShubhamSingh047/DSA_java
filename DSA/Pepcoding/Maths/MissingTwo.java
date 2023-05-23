package DSA.Pepcoding.Maths;

/*
we have to finding the missing two number form array in big O(n) and big O(1)space;
*/

public class MissingTwo {
    public static void main(String[] args) {

        int n=6;
        int arr[]= {1,3,5,6,0,0};

        //first we will find sum of n natural number
        int sumN= 6*(6+1)/2;

        //find the sum of all the number nub existing in array;
        int sumArr=0;
        for(int i=0; i<n; i++){
            sumArr+=arr[i];
        }

        //find the avg of missing number
        int avg = (sumN-sumArr)/2;

        //find the smallest number missing in reference to missing number and largest number.
        int small=0;
        int large=0;
        for (int i=0; i<n-2; i++){
            if(arr[i]<=avg){
                small+=arr[i];
            }else{
                large+=arr[i];
            }
        }

        //find the total smaller half;
        int totalSmallhalf = avg*(avg+1)/2;

        System.out.println("two missing numbers are :-");
        System.out.println(totalSmallhalf-small);
        System.out.println(sumN-totalSmallhalf-large);
    }
}
