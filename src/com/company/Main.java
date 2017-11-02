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
        for (int i =10; i < N;i++) {
            int Per=-1;
            int sumCubs = 0;
            while (Per != 0) {
                Per=i;
                int a = (Per % 10);
                if(a==0){
                 i/10;
                }
                sumCubs=sumCubs+ (int)Math.pow(Per, 3);
                Per = (i - a) / 10;
            }
            if (sumCubs == i) {
                System.out.print(i + " ");
            }
        }
    }
}
