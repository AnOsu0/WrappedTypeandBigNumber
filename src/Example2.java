import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj zdanie w którym są litery i cyfry");
        String line = sc.nextLine();
        int length = line.length() - 1;
        int numberOfDigits = 0;
        int numberOfLetters = 0;
        int maxNumber = 0;

        for (int i = 0; i <= length; i++) {
            if (Character.isDigit(line.charAt(i))) {
                numberOfDigits += 1;
                int c = Character.getNumericValue(line.charAt(i));
                if (c > maxNumber) {
                    maxNumber = c;
                }
            }
            if (Character.isLetter(line.charAt(i))) {
                numberOfLetters += 1;
            }
        }
        System.out.println("liczba cyfr w zdaniu to: " + numberOfDigits);
        System.out.println("liczba liter w zdaniu to: " + numberOfLetters);
        System.out.println("Największa cyfra w zdaniu to: " + maxNumber);

    }


}
