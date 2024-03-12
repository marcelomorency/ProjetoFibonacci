package org.example;




public class Main{

    public  static int fibonacci(int n) {

        if(n==0){
            return 0;
        }

        if(n==1){
            return 1;
        }

        return fibonacci(n-1)+ fibonacci(n-2);

        for( int i = 0; i < 2; i++) {
            System.out.print(fibonacci(n) + "calls =" + i + "=" + n);
        }
    }

    public static void main(String[] args){
        System.out.print(Main.fibonacci(2));
    }
}