package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int N = in.nextInt();
        if (N == 0) {
            System.out.print("Это число не является натуральным.Введите натуральное число: ");
            N = in.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    int sum = i * 100 + j * 10 + k;
                    int sumCubs = i * i * i + j * j * j + k * k * k;
                    if (sum == sumCubs && sum < N) {
                        System.out.print(i + j + k+" ");
                    }
                }
            }
        }
    }
}
