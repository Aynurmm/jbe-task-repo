package az.academy.turing;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
//
//    int num1=12;
//    int num2=4;
//    int cem=num1+num2;
//    System.out.println(cem);
//    int ferg=num1-num2;
//        System.out.println(ferg);
//    int bolme=num1/num2;
//        System.out.println(bolme);
//    int vurma=num1*num2;
//        System.out.println(vurma);
//    int qaliq=num1%num2;
//        System.out.println(qaliq);


        int a=36;
        int b=5;
        float f=(float)a/b;
//        System.out.printf("%f\n", f );
//        System.out.println(f);


        Scanner sc=new Scanner(System.in);
        System.out.println("eded daxil edin");
        int number= sc.nextInt();
        String result = (number % 2 == 0) ? "Sayı cutdur." : "Sayı tekdir.";
        System.out.println(result);
    }
}

