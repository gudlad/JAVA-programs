
//https://youtu.be/iKGAgWdgoRk?t=1990

import java.util.Arrays;

// merge sort
// time complexity : O(n logn)
// not in place sorting
// stable sorting

public class merge_sort_inplace {

public static void main(String[] args) {
    int[]  arr={5,4,3,2,1};
    sort(arr,0,arr.length);
    System.out.println(Arrays.toString(arr));
}


public static void sort(int[] arr, int start, int end) {
        if(end-start==1)
            return;
        int mid=(start+end)/2;
        sort(arr, start, mid);
        sort(arr, mid, end);
        merge(arr,start,mid,end);
        
    }

private static void merge(int[] arr, int start, int mid, int end) {
    int[] mix=new int[end-start];
    int i=start;
    int j=mid;
    int k=0;
    while(i<mid && j<end) {
        if(arr[i]<arr[j])
        {
            mix[k]=arr[i];
            i++;
        }else{
            mix[k]=arr[j];
            j++;
        }
        k++;
    }
    // cleanup add remaining
    while(i<mid)
    {
        mix[k]=arr[i];
        i++;
        k++;
    }
    while(j<end)
    {
        mix[k]=arr[j];
        j++;
        k++;
    }
    for(int l=0;l<mix.length;l++)
    arr[start+l]=mix[l];
    
}

}




