public class kodnest_string_substring {
     public static void main(String[] args) {
        String str = "abcd";

for (int i = 0; i < str.length(); i++) {
    for (int j = i; j < str.length(); j++) {
        System.out.print(str.substring(i, j + 1) + " ");
    }
    System.out.println();
}
    }
}

//  a ab abc abcd
//  b bc bcd    
//  c cd    
//  d
