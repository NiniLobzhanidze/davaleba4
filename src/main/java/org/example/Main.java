package org.example;

public class Main {
    public static void main(String[] args) {
checkNumber(0);
    }

    static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("დადებითი");
        }
            if (number == 0){
                System.out.println("ნული");
        }
            if (number <0){
                System.out.println("უარყოფითი");
            }
    }
}