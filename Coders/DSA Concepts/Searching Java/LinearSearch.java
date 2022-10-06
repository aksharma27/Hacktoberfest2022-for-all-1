public class LinearSearch{
    public static void main(String[] args){
        int arr[] = {2,45,7,10,18};
        int target = 7;
        int ans = linearSearch(arr, target);
        System.out.println(target + " is at index: " + ans)
    }

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }    
        }
    }
}