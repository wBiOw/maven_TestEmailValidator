package org.example;

public class EmailValidator {

    public static boolean checkEmail(String text) {
       String regex = "^[a-zA-Z]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"+"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$";
//      String regex = "^[a-zA-Z0-9]"+"(\\.[a-zA-Z0-9])*"+"@"+"[a-zA-Z0-9]"+"(\\.[a-zA-Z0-9])*"+"\\.[a-zA-Z]{2,}$";
        return text.matches(regex);
    }

}
