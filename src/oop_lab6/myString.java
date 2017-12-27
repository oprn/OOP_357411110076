package oop_lab6;

public class myString {
    public static  void main (String [] args ){
        char[]c={'H','e','l','o'};
             String str1 = new String(c);
             System.out.println(str1);
             String str2 = "Puriwat Lertkai";
        System.out.println(str2);


        //String conoatenation
        //type 1 (+)
        String str3 = str1 + " " +str2;
        System.out.println(str3);

        //type 2 (concat() method)
        String str4= str3.charAt("RMUTSV");
        System.out.println(str3);
        //String Methodes
        System.out.println(str4.length());
        System.out.println(str4.substring(10,20));
        System.out.println(str4.toUpperCase());
        System.out.println(str4.toLowerCase());
        str4.replace('r','t');
        str4.replace(str4.replace('r','t');


    }//main
}//class
