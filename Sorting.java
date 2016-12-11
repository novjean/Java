package bubblesort;

/**
 *
 * @author Novjean
 */
public class BubbleSort {

    public static void DisplayArray(int[] arr){
        for(int i: arr)    
            System.out.println(i);
    }
    
    public static void BubbleSort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int flag = 0;
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }
    
    public static void InsertionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int key = arr[i];                               
            int j=i-1;                                      
            while(j>=0 && key < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {5,1,6,2,4,3,52,32,1,2,42,6,7,5,32,9,60,7,54};
      
        System.out.println("Before sorting: ");
        DisplayArray(arr);
        
        //BubbleSort(arr);
        InsertionSort(arr);
        
        System.out.println("After sorting: ");
        DisplayArray(arr);
    }
}
