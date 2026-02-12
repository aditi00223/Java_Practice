public class Sort102 {
    
        public static void sort012(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length -1;
        while(mid <= high){
            if (arr[mid] == 0) {
                // swap low and mid
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                // swap mid and high
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    } 
    
 
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 0, 1, 2};
        Sort102.sort012(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
