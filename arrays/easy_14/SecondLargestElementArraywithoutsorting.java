package arrays.easy_14;

/**
 * SecondLargestElementArraywithoutsorting
 */
public class SecondLargestElementArraywithoutsorting {

    public static void main(String[] args) {
        int[]  arr = {2,4,1,3,5,0};

        secondLargestElement(arr);
        secondSmallestElement(arr);
    }

    private static void secondLargestElement(int[] arr) {
      int largestnum=arr[0];
      int secondLargestnum=arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]>secondLargestnum){
            secondLargestnum=arr[i];
            if(arr[i]>largestnum){
                secondLargestnum=largestnum;
                largestnum=arr[i];
            }
          }
      }
      System.out.println("second largest num is:"+secondLargestnum+" and largest num is "+largestnum);

    }
    private static void secondSmallestElement(int[] arr) {
        int smallestNum=arr[0];
        int secondSmallestNum=arr[0];
        for(int i=1;i<arr.length;i++){
         if(arr[i]<secondSmallestNum){
            secondSmallestNum=arr[i];
            if(arr[i]<smallestNum){
                secondSmallestNum=smallestNum;
                smallestNum=arr[i];
            }
         }
        }
        System.out.println("second smallest num is:"+secondSmallestNum+" and smallest num is "+smallestNum);
  
      }
  
}