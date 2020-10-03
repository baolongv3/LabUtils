package edu.FPT;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    static Scanner sc = new Scanner(System.in);

    //Basic input
    public static String inputString(String msg){
        sc = new Scanner(System.in);
        
        System.out.print(msg);
        String output = sc.nextLine();
        return output;
       
    }

    public static Double inputDouble(String msg){
        sc = new Scanner(System.in);
            try{
                System.out.print(msg);
                Double output = sc.nextDouble();
                return output;

            }catch(InputMismatchException eInputMismatchException){
                System.err.println("Input must be a double!");
                return null;
            }
    }

    public static Integer inputInteger(String msg){
        sc = new Scanner(System.in);
        try{
            System.out.print(msg);
            Integer output = sc.nextInt();
            return output;

        }catch(InputMismatchException eInputMismatchException){
            System.err.println("Input must be an Integer!");
            return null;
        }
    }
}