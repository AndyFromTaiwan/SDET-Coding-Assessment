public class Challenge1 {
    public static String encodeNumber(int num) {
        boolean isMultiplesOf3 = num % 3 == 0;
        boolean isMultiplesOf5 = num % 5 == 0;

        if(isMultiplesOf3 && isMultiplesOf5) return "PlanitTesting";
        else if(isMultiplesOf3) return "Planit";
        else if(isMultiplesOf5) return "Testing";
        return Integer.toString(num);
    }

    public static void printPlanitTesting() {
        for(int i=1; i<=100; i++) {
            String message = encodeNumber(i);
            System.out.print(message+" ");
        }
        System.out.println();
    }
}
