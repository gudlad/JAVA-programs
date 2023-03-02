import java.util.Arrays;
class Array_copy{
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9};
        int[] copy = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(copy));
    }
}