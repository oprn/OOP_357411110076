package oop_lab5;

import java.util.Scanner;

import static oop_lab5.InputDataToArray.InputDataToArray.MAX;

public class InputDataToArray {

   // 1.input Data from user
    // 2.find summaiion data in array
   // 3.find average value of data in array
   // 4.find maximum value of data in array
   // 5.find minimum value of data in array

    public class InputDataToArray{
        private static final int MAX = 10;
    }
        public static void  main (String[] args){
            int num[]= new int [MAX];
           num = inputData(num);
            ShowData(num);
            summation();


        }//main


    public static void summation (int [] num ){
       int total = 0;
       for ()


    }



    private static int [] ShowData (int[]num) {
System.out.println("Data in array : " );
for (int val: num)
    System.out.println(val+" ");

    }//main


    private static int [] inputData(int []num){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Plese enter data to array: ");
            for (int i=0;i<num.length;i++){
                System.out.println("num["+i+"]:  ");
                        num[i]= Scanner.nextInt();

            }
            return num;
    }


}//class
