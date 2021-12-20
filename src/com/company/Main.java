package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 7;
    int b = 3;
    int x = 5;
    int y = 4;
    int e = 6;
    int w = 9;

        //number1 = x+y-a/2*(x+w)
        double number1 = x+y-a/2*(x+w);
        System.out.println("number1 = " + number1);

        //number2 = a*(x+x)/y-a*3
        double number2 = a*(x+x)/y-a*3;
        System.out.println("number2 = " + number2);

        //number3 = a+b/x-y
        double number3 = a+b/x-y;
        System.out.println("number3 = " + number3);

        //number4 = X-e/2%e+1
        double number4 = x-e/2%e+1;
        System.out.println("number4 = " + number4);
    }
}
