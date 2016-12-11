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
    
    public static void SelectionSort(int[] arr){
        for(int i = 0;i<arr.length; i++){
            int min = i;
            for(int j= i; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    
    public static int Partition(int[] arr, int p, int last){
        int i, j, pivot, temp;
        pivot = arr[p];
        i = p;
        j = last;
      
        while(true){
            //System.out.println("PivotVal: " + pivot + " arr[i]: " + arr[i] + " arr[j]: " + arr[j]);
            while(arr[i]< pivot && arr[i] != pivot){
                i++;
                //System.out.println("i increments: "+ i);
            }
            while(arr[j] > pivot && arr[j] != pivot){
                j--;
                //System.out.println("j decrements: " +j);
            }
            if(i<j){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            else
                return j;
        }
    }
    
    public static void QuickSort(int[] arr, int pivot, int last){
        
        if(pivot<last){
            int q;
            q = Partition(arr, pivot, last);
            QuickSort(arr, pivot, q);
            QuickSort(arr, q+1, last);
            
        }
    }
    
    public static void Merge(int a[], int p, int q, int r){
        
        int[] b = new int[r+1];
        int i,j,k;
        k = 0;
        i = p;
        j = q+1;
        
        while(i<=q && j <=r){
            if(a[i] <a[j]){
                b[k++] = a[i++];
            }
            else{
                b[k++] = a[j++];
            }
        }
        while(i<=q){
            b[k++] = a[i++];
        }
        while(j<=r){
            b[k++] = a[j++];
        }
        
        for(i=r; i>=p; i--){
            a[i] = b[--k];
        }
        
    }
    
    public static void MergeSort(int[] arr, int p, int r){
        int q;
        if(p<r){
            q = (p+r)/2;
            MergeSort(arr,p,q);
            MergeSort(arr,q+1,r);
            Merge(arr,p,q,r);
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {25,52,37,63,14,17,8,6};
      
        System.out.println("Before sorting: ");
        DisplayArray(arr);
        
        //BubbleSort(arr);
        //InsertionSort(arr);
        //SelectionSort(arr);               //O(n^2)
        
        int pivot = 0;
        int lastIndex = arr.length - 1;
        //QuickSort(arr, pivot, lastIndex);         //O(nlogn)
        MergeSort(arr, pivot, lastIndex);           //O(nlogn)
        
        System.out.println("After sorting: ");
        DisplayArray(arr);
    }
}
