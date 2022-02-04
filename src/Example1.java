import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) throws FileNotFoundException {
     File file = new File("C:\\Users\\LNV\\Desktop\\numbers.txt");
        Scanner reader = new Scanner(file);

        int a = Integer.parseInt(reader.nextLine());
        int b = Integer.parseInt(reader.nextLine());
        int c = Integer.parseInt(reader.nextLine());

        BigInteger big1 = new BigInteger(reader.nextLine());
        BigInteger big2 = new BigInteger(reader.nextLine());

        int sum = a+b+c;
        BigInteger result = big1.add(big2);
        System.out.println(sum);
        System.out.println(result);
    }
}
