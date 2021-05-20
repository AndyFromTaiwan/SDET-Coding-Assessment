public class Main {
    public static void main(String[] args) {
        // Challenge1
        System.out.println("[ Demo for Challenge 1 ]");
        Challenge1.printPlanitTesting();
        System.out.println();

        // Challenge3
        System.out.println("[ Demo for Challenge 3 ]");
        String[] demos = { "reverse order", "string   reverse order", "string   reverse   order" };
        for(String demo : demos) {
            String res = Challenge3.reverseAndReplaceSpace(demo);
            System.out.println("\"" + demo + "\" -> \""+ res + "\"");
        }
        System.out.println();
    }
}
