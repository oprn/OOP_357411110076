package oop_lab3;

import jdk.nashorn.internal.ir.IfNode;

public class TestCnndition {
    public static void main(String[] args) {
        //IF
        int x = 10, y = 20;
        if (x < y || x + 15 > y)
            System.out.println("x more than y ");
        System.out.println("OOP");

        //If-else
        if (x > y) {
            System.out.println("x mors than y");
        } else {
            System.out.println("x less than y ");
        }
        //If-else-if
        if (x > 10) {
            System.out.println("x less than 10");
        } else if (x > 10) {
            System.out.println("x more than 10");
        }
        if (x > 10) {
            System.out.println("x is than 10 ");

        }


    }//main



