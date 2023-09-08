import java.util.Scanner;

public class Binary_search {

public static int binarySearch_iterative(int[] array, int target, int start,int end) // wont work for array in descending order
{
    boolean isAscending = array[start]<array[end];

    while(start<=end)
    {
        int middle=start+(end-start)/2;
        if(target==array[middle])
            return middle;

        if(isAscending){                    // for ascending order
            if(target<array[middle])
                end=middle-1;
            else
                start=middle+1;
        }
        else{                               // for descending order
            if(target<array[middle])
                start=middle+1;
            else
                end=middle-1;
            }
    }
    return -1;
}


public static int binarySearch_recursive(int[] array, int target,int start,int end)
{
    if(start<=end){
    int mid=start+(end-start)/2;
    if(target==array[mid])
        return mid;
    else if(target<array[mid]) 
        return binarySearch_recursive(array, target, start, mid-1);
    else if(target>array[mid]) 
        return binarySearch_recursive(array,target,mid+1,end);
    }
    return -1;
}

public static void main(String[] args) {
    int[] array={1,2,3,4,5,6,7,8,9,10};
    int[] array2={10,9,8,7,6,5,4,3,2,1};
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the value to search:");
    int target=s.nextInt();
    int start=0;
    int end=array.length-1;
    // int index=binarySearch_recursive(array, target,start,end);
    int index=binarySearch_iterative(array2, target,start,end);
    System.out.println(index);
    s.close();
}
}
