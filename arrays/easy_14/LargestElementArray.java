package Arrays.easy_14;

public class LargestElementArray {

    public static void main(String[] args) {
      int[]  arr = {2,5,1,3,0};
         
      findLargestEleInArr(arr);

        
        
    }

    private static void findLargestEleInArr(int[] arr) {
        int largestNum=arr[0];
        for(int i=1;i<arr.length;i++){
           if(arr[i]>largestNum)largestNum=arr[i];
        }
        System.out.println(largestNum);
    }

    
}
