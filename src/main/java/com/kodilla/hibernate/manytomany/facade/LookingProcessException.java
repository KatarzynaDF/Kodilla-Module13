package com.kodilla.hibernate.manytomany.facade;

public class LookingProcessException extends Exception {

    public static String COMPANY_DOES_NOT_EXIST = "Company not found!";
    public static String EMPLOYEE_DOES_NOT_EXIST= "Employee not found";

    public LookingProcessException (String message){
        super(message);
    }
}
