import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giai PT bac 2: ");
        double a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập số b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập số c: ");
        c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);

        if (quadraticEquation.getDiscriminant()<0)
            System.out.println("PT vo nghiem");
        else if (quadraticEquation.getDiscriminant() == 0)
            System.out.println("PT co 1 nghiem: " + quadraticEquation.getConStan1());
        else {
            System.out.println("PT co 2 nghiem la: ");
            System.out.println("Nghiem thu nhat: " + quadraticEquation.getConStan1());
            System.out.println("Nghiem thu 2: " + quadraticEquation.getConStan2());
        }
    }
}
