package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int counter = 0;
        for (int i = 1; i < 10; i++) {
            counter = i + 2;
            System.out.println(i + "+" + "2" + "=" + counter);


            Scanner scan1 = new Scanner(System.in);
            int y = scan1.nextInt();
            int chet = 0;
            for (int j = 1; j <= 10; j++) {
                chet = j * 5;
                System.out.println(j + "*" + y + "=" + chet);


            }
        }

        System.out.println("konsoldon bir jakwy korgon tamagyndy jaz");
        Scanner scan = new Scanner(System.in);
        String tamak = scan.nextLine();

        switch(tamak) {
            case "alma":
                System.out.println(70);
                break;
            case "kurut":
                System.out.println(150);
                break;
            case "sahar":
                System.out.println(80);
                break;
            case "shokolad":
                System.out.println(225);
                break;
            case "sandwich":
                System.out.println(65);
                break;
            case "suu":
                System.out.println(25);
                break;
            default:
                System.out.println("Mynday tamak jok");


        }



        System.out.println("Eki san beriniz");
	Scanner scan= new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
        String c=(a>b) ? "En chon san"+ a: "En chon san: "+b;
        System.out.println(c);

        System.out.println("Dagy eki san jaz");
        int d = scan.nextInt();
        int f = scan.nextInt();





