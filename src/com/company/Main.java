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
        for (int i = 1; i < N; i++) {
            int sWhile = i;
            int remain = 0;
            int sum = 0;
            while (sWhile != 0) {
                remain = sWhile % 10;
                sum += Math.pow(remain, 3);
                sWhile = (sWhile - remain) / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }

        }
    }
}
