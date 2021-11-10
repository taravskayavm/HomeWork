package com.geekbrains.homework;

public class FirstHomeWork {
    public static void main(String[] args) {

        byte bt = 100;
        short sh = 4563;
        int in = 102030;
        long lg = 8754143987586L;
        float fl = 6.5f;
        double db = 8.75;
        char ch = 'O';

        System.out.println("Типы данных:");
        System.out.println("byte bt = " + bt + ";");
        System.out.println("short sh = " + sh + ";");
        System.out.println("int in = " + in + ";");
        System.out.println("long lg = " + lg + ";");
        System.out.println("float fl = " + fl + ";");
        System.out.println("double db = " + db + ";");
        System.out.println("char ch = " + ch + ";");

    }

    public static float Third (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public boolean task10and20 (int a, int b) {
        int n = a + b;
        if (10 <= n && n <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public void posOrNeg (int a) {
        if (a < 0 ) {
            System.out.println("Положительное число");
        }    else {
                System.out.println("Отрицательное число");
            }
        }


    public boolean pos (int a) {
        if (a >= 0) {
            return true;
        } else {
            return false;
        }
    }
        public static void personeName() {
            System.out.println("Привет, " + "personeName" + "!");
        }

    }
