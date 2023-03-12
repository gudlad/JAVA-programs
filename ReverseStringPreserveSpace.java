public class ReverseStringPreserveSpace {

    public static char[] reservePreserveSpace(char[] source, char[] destination) {
        int j = destination.length - 1;

        // Transfer spaces from source to destination array
        for (int i = 0; i < source.length; i++) {
            if (source[i] == ' ') {
                destination[i] = source[i];
            }
        }
        // Transfer non-space characters in reverse order
        for (int i = 0; i < source.length; i++) {
            if (source[i] != ' ') {
               if(destination[j] == ' ') {
                j--;
            }
            destination[j] = source[i];
            j--;
        }}
        return destination;
    }

    public static void main(String[] args) {
        String str = "Hello Ram";
        char[] strArray = str.toCharArray();
        char[] duplStr = new char[strArray.length];

        // Reverse the string while preserving the position of spaces
        String reverse = new String(reservePreserveSpace(strArray, duplStr));

        System.out.println(reverse);
    }
}
