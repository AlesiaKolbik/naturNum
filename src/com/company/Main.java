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
        for (int i=10; i < N;i++) {
           int remain=0;
           int sum=0;
            while(i!=0) {
                remain=i%10;
                sum+=Math.pow(remain,3);
                i=(i-remain)/10;
                }

            }
        }
    }
