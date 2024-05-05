package org.example;

public class Main {
    public static class MathTable {
        private void displayTable(int n) {
            System.out.println("This is table for: " + n);
            for(int i = 1; i <= 10; ++i) {
                System.out.println(i * n);
            }
        }
    }
    public static void main(String[] args) {
        MathTable mt = new MathTable();
        mt.displayTable(15);
    }
}