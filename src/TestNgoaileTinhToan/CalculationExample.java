package TestNgoaileTinhToan;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao x: ");
        int x = sc.nextInt();
        System.out.println("Nhap vao y: ");
        int y = sc.nextInt();
        CalculationExample cal = new CalculationExample();
        cal.calculation(x,y);
    }

    private void calculation(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } catch (Exception e) {
            System.out.println("Xay ra ngoai le" + e.getMessage());

        }
    }
}
