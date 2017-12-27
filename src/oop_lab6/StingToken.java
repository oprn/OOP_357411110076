package oop_lab6;

import java.util.StringTokenizer;

public class StingToken {
    public static  void main (String) [] args {


String msg = " Hello , RMUTSV Puriwat Lertkrai";


StringTokenizer myToken = new StringTokenizer (msg);
System.out.print(myToken.countTokens());

while ( myToken.hasMoreTokens()){


    StringBuffer  = new StingToken(myToken.nextToken());
    System.out.print(myBuf.reverse()+" ");




}//While
    }//main
}//class



