package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) throws NameException, SurnameException, IDException, YearException, MonthException, NumberException, UsernameException, PasswordException {
	// write your code here
        Scanner sc=new Scanner(System.in);
        String name=sc.next(),surname=sc.next(),ID=sc.next();
        int year=sc.nextInt(),month= sc.nextInt(),number=sc.nextInt();
        String username=sc.next(),password=sc.next();
        int k=0;
        if (name.length()<2){
            k++;
            throw new NameException("Name is too short");
        }
        if (surname.length()<3){
            k++;
            throw new SurnameException("Surname is too short");
        }
        if (ID.length()!=11){
            k++;
            throw new IDException("Wrong ID");
        }
        if (year>2020){
            k++;
            throw new YearException("Wrong Year");
        }
        if (month>12 || month<1){
            k++;
            throw new MonthException("Wrong Month");
        }
        if (number>31 || number<1 || (month==2 && (number<1 || number>29))){
            k++;
            throw new NumberException("Wrong Month Number");
        }
        if (username.length()<4){
            k++;
            throw new UsernameException("Username is too short");
        }
        if (password.length()>15 || password.length()<8){
            k++;
            throw new PasswordException("Password length must be from 8 to 15");
        }
        if (k==0){
            User user=new User(name,surname,ID,year,month,number,username,password);
            user.printInfo();
        }


    }
}
