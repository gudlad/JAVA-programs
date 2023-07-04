public class timeConversion {
    public static void main(String[] args) {
        String str = "12:01:00AM";
        System.out.println(convert(str));
    }

    // 12 hour format to 24 hour format
    public static String convert(String str) {
        String result = "";
        int start = Integer.parseInt(str.substring(0, 2));
        String end = str.substring(8, str.length());
        String mid=str.substring(2,8);
        if (end.equals("AM")) {
            if (start == 12)
                result+="00" + mid;
            else
                result+=str.substring(0, 8);
        } else {
            if (start == 12)
                result+=str.substring(0, 8);
            else {
                start += 12;
                result+=String.valueOf(start) + mid;
            }
        }
        return result;
    }
}

// ##string methodos in java
