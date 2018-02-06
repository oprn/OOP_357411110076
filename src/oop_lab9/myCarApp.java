package oop_lab9;

public class myCarApp {
    private static void maun (String []args){
        //engine
        Engine engine = new Engine("1500 cc","V-TEC V4");
        //car
        car car = new car ("Honda","Black",engine);

        System .out.println(car.toString());
        car car1 = new car ("Honda","Red",engine);
        System.out.print(car1.toString());





    }//main
}//class
