package SearchingAlgorithms;

public class BinarySearch {

    //iT CAN BE WRITEN EITHER WITH A WHILE LOOP OR BY RECURSION!
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6,7,8,9,11};
        int target=7;
        int index= searchByBinarySearch(arr,target);
        int index2= searchByBinarySearchAnotherWay(arr,target);
        System.out.println(index+","+index2);
        
    }
    private static int searchByBinarySearchAnotherWay(int[] arr, int target) {
        int first=0;
        int last=arr.length-1;

         while(first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==target)return mid;
            else if (target<arr[mid])last=mid-1;
            else first=mid+1;
         }        
         return -1;
    }

    private static int searchByBinarySearch(int[] arr, int target) {
        int first=0;
        int last=arr.length;
        return binarySearch(first,last,arr,target);
        
    }

    private static int binarySearch(int first, int last, int[] arr, int target) {
        if(first>=last)return -1;
         int mid = (first+last)/2;
       if(arr[mid]==target)return mid;
       else if(target<arr[mid])return binarySearch(first, mid-1, arr, target);
       else return binarySearch(mid+1, last, arr, target);
    }
}
