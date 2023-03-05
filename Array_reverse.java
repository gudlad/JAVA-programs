import java.util.Arrays;
// import java.util.Comparator;
import java.util.Collections;
public class Array_reverse {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5,6,7,8,9};  // only for objects not primitives
        Arrays.sort(array,Collections.reverseOrder());
        reverseArray(array);
        
    }

    public static void reverseArray(Integer[] array)
    {
        int start=0;
        int end=array.length-1;
        while(start<=end)
        {
            Integer temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(array));
    }

}
