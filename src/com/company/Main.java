package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.UK);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double eps = 1e-5;
        if (x - 2 < eps && y - x < eps && x * x + y * y - 4 < eps && x > 0 && y > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
