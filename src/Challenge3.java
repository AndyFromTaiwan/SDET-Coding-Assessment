public class Challenge3 {
    public static String reverse(String s) {
        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        while(left<right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return String.valueOf(str);
    }

    public static String reverseAndReplaceSpace(String s) {
        String replacedString = s.replaceAll("\\s+", "-");
        return reverse(replacedString);
    }
}
