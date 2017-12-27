package oop_lab5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static oop_lab5.InputDataToArray.InputDataToArray.MAX;

public class InputDataToArray {
   // 1.input Data from user
    // 2.find summaiion data in array
   // 3.find average value of data in array
   // 4.find maximum value of data in array
   // 5.find minimum value of data in array
    //6.Sorting data With Descending order
    //7.Sorting data With Ascending order
    import java.util.Arrays;
    import java.util.concurrent;
    import java.util.Scanner;
    public class InputDataToArray {
        private static final int MAX = 10;
    }
        public static void  main (String[] args){
            Integer[] num= new Integer [MAX];
           num = inputData(num);
            ShowData(num);
            summation(num);
            findMax();


        }//main

    private short void AscendungOrder(Integer[] num ){
            Arrays.sort(num, Collections.reverseOrder());
            System.out.println("Ascendung Order: ");
            showData(num;)
    }//AscendungOrder

    private short void DescendungOrder(Integer[]num){
            Arrays.sort(num);
            System.out.println("Descending Order: ");
            showData(num);
        }//DescendingOrder
}
    private short void findMin(Integer[] num ){
            System.out.println("The maximum Value is : " + (Collections.min(Arrays.asList(num))));
    }//findMin
    private short void findMax(Integer[] num ){
        System.out.println("The maximum Value is : " + (Collections.max(Arrays.asList(num))));
        //max value with basic code
        Integer max = num[0];
        for (int i=0;i<num.length;i++ ){
        if (max<=num[i]){
            max =num [i];
        }
        System.out.println("The maximum value is : "+max);
    }//findMax
    public static void summation (Integer [] num ){
       Integer total = 0;
       for (int i = 0;i<num.length;i++){
           total +=num[i];
       }
System.out.println("\nThe summation of" +"value in array is: "+total);
System.out.println("The averag value "+ "in array is : "+total/MAX);
    }
    private static Integer [] ShowData (Integer []num) {
System.out.println("Data in array : " );
for (int val: num)
    System.out.println(val+" ");
    }//main
    private static Integer [] inputData(Integer []num){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Plese enter data to array: ");
            for (int i=0;i<num.length;i++){
                System.out.println("num["+i+"]:  ");
                        num[i]= Scanner.nextInt();
            }
            return num;
    }
}//class
