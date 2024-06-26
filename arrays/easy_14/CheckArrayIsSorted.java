package arrays.easy_14;

public class CheckArrayIsSorted {
    
    public static void main(String[] args) {
        int[]  arr = {2,4,5,6,8,9};

        checkArrSorted(arr);
    }

    private static void checkArrSorted(int[] arr) {
        // TODO Auto-generated method stub
        if(arr.length<2){
            System.out.println("True");
            return;
           };
        for(int i=1;i<arr.length;i++){
           if(arr[i-1]>arr[i]){
            System.out.println("False");
            return;
           }
        }
        System.out.println("True");

    }

   
}
