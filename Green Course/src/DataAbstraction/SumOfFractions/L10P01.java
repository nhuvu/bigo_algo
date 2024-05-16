package DataAbstraction.SumOfFractions;

import java.util.Scanner;

public class L10P01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Fraction fac1 = new Fraction(x,y);
        x = scanner.nextInt();
        y = scanner.nextInt();
        Fraction fac2 = new Fraction(x,y);
        Fraction result = fac1.sumFraction(fac2);
        System.out.println(result);
    }
}
