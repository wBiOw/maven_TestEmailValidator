package org.example;

import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        String email= sc.nextLine();
 //       EmailValidator emailValidator = new EmailValidator();
        System.out.println( "a = " + email );
        if (EmailValidator.checkEmail(email)) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
//        System.out.println( "check = " + EmailValidator.checkEmail(mail));
    }
}
