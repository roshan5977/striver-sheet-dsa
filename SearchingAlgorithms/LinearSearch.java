package SearchingAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {
        int [] arr ={2,3,6,4,5,6,3,6,8,4,1,8};
        int target=1;
        int index= searchByLinearSearch(arr,target);
        System.out.println(index);
    }
//Time Complexity is O(n)
    private static int searchByLinearSearch(int[] arr, int target) {
        for(int i=0; i<=arr.length;i++){
            if(arr[i]==target)return i;
        }
        return -1;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
