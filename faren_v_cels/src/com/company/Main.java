package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
	int temp, res;
    float res_1, res_2;

        System.out.print("Enter degrees in celsius: ");
        temp = num.nextInt();
        res = temp - 32;
        res_1 = 0.555555555f;
        res_2 = res_1*res;
        System.out.print(res_2);


    }
}
