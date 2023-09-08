import java.util.Arrays;
// sorting algorithms 2 properties 

/*1. whether it is in-place sorting
based whether it will create another array for sorting or sort the original array 
without creating a new array
*/

/* 2. whether it is stable or not
whether the order of elements in the original array is maintained 
after sorting the elements by the algorithm.
*/

// insertion sort O(n2)
// stable sorting
// in-place sorting
public class insertion_buble_selection_sort {

    // insertion sort
    // public static void sort(int[] arr)
    // {
    //     for(int i=0; i<arr.length-1; i++)
    //     {
    //         for(int j=i+1; j>0; j--)
    //         {
    //             if(arr[j]<arr[j-1])
    //                 swap(arr,j,j-1);
    //             else
    //                 break;
    //         }
    //     }
    // }

    // bubble sort
    // time complexity O(n2)
    // stable sorting
    // in-place sorting
    // public static void sort(int[] arr)
    // {

        // edge cases : 
        // if array is already sorted : 1,2,3,4,5,6,7,8,9
        // or partially sorted : 2,1,3,4,5,6,7,8,9
        
    //     boolean swapped;
    //     for(int i=0; i<arr.length; i++)
    //     {
    //         swapped=false;
    //         for(int j=1; j<arr.length-i; j++)
    //         {
    //             if(arr[j]<arr[j-1])
    //             {
    //                swap(arr, i, j);
    //                swapped=true;
    //             }
    //         }
    //         if(!swapped)
    //         {
    //             break;
    //         }
    //     }
    // }
    
    /* 
    for(int i=0;i<=size-1;i++)
    {
        for(int j=1;j<=size-i;j++)
        {
            if(arr[j]< arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            }
        }
    }*/

    // selection sort
    // time complexity O(n2)
    // not stable sorting
    // in-place sorting
    public static void sort(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            int last=arr.length-i-1;
            int max=findMaxIndex(arr,0,last);
            swap(arr,last,max);
        }
    }

    public static int findMaxIndex(int[] arr, int start, int end)
    {
        int maxIndex=start;
        for(int i=start;i<=end;i++)
        {
            if(arr[maxIndex]<arr[i])
            maxIndex=i;
        }
        return maxIndex;
    }
    public static void swap(int[] arr, int i, int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
public static void main(String[] args) {
    int[]  arr={1,2,3,4,5};
    sort(arr);
    System.out.println(Arrays.toString(arr));
}
}
