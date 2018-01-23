package oop_lab7;

import java.util.Scanner;

public class mySuperCar {
   public short void main(String[] args){
       Supercar supercar1 = new Supercar();
       supercar1 = inputData (supercar1);
       System.out.println(supercar1.getSuperCarInfo());

    }//main
private short SuperCar inputDatan (Supercar){

       Scanner supercar = new Scanner (System.in );
       system .out.println("Enter Supercar info: ");

        s.setName(scanner.nextLine());
        System.out.println("car brand: ");
        s.setId(scanner.nextLine());
        System.out.println("car color: ");
        s.setMajor(scanner.nextLine());
        System.out.println(": ");
        s.setFaculty(scanner.nextLine());
        return s;



    }
   }
