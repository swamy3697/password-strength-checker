package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        Checker checker=new Checker();
        System.out.println("");
        System.out.println("\t\t\t------- -- -------- -------- -------");
        System.out.println("\t\t\tWELCOME TO PASSWORD STRENGTH CHECKER");
        System.out.println("\t\t\t------- -- -------- -------- -------");
        boolean isNotDone=true;
        System.out.println("");
        System.out.println("password Strength levels");
        System.out.println("\t\t\t\t\t Very Very Weak \t Very Weak \t Weak \t Medium \t Strong \t Very Strong");
        while(isNotDone)
        {
            System.out.println("");
            System.out.println("Enter Password To check or if you want to exit enter exit");

            String password =scanner.nextLine();
            System.out.println("");
            checker.check(password);

            if(password.equals("exit"))
            {
                isNotDone=false;
            }
        }

    }
}
