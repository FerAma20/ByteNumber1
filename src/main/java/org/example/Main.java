package org.example;

public class Main {
    public static void main(String[] args) {
        int contador = 1;
        for (int i = 2; contador <=10; i++){
            if(asd(i)){
                contador ++;
                System.out.println("Numero: " + i);
            }
        }

    }


    public static boolean asd(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}