import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Challenge3 {
    public static String reverse(String s) {
        if(s==null) return s;

        char[] str = s.toCharArray();
        int left = 0;
        int right = str.length-1;
        while(left < right) {
            char temp = str[left];
            str[left++] = str[right];
            str[right--] = temp;
        }
        return String.valueOf(str);
    }

    public static String reverseAndReplaceSpace(String s) {
        if(s==null) return s;

        String replacedString = s.replaceAll("\\s+", "-");
        return reverse(replacedString);
    }

    public static void main(String[] args) {
        String fileName = (args.length>0)? args[0] : "";
        if(!fileName.isEmpty()) {
            try {
                File file = new File(fileName);
                Scanner reader = new Scanner(file);
                while(reader.hasNextLine()) {
                    String s = reader.nextLine();
                    if(!s.isEmpty()) {
                        String res = Challenge3.reverseAndReplaceSpace(s);
                        System.out.println("\"" + s + "\" -> \"" + res + "\"");
                    }
                }
            }
            catch(FileNotFoundException e) {
                System.out.println("Fail to open file " + fileName);
                e.printStackTrace();
            }
        }
        else {
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("Please enter a string to replace spaces and reverse:");
                String s = scanner.nextLine();
                if(s.isEmpty()) break;
                else System.out.println(reverseAndReplaceSpace(s));
            }
        }
    }
}
