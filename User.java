package com.company;

public class User {
    private String name,surname,ID,username,password;
    private int year,month,number;
    public User(String name,String surname,String ID,int year,int month,int number,String username,String password){
        this.name=name;
        this.surname=surname;
        this.ID=ID;
        this.year=year;
        this.month=month;
        this.number=number;
        this.username=username;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getID() {
        return ID;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getNumber() {
        return number;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    void printInfo(){
        System.out.println(name+" "+surname+" "+ID+" "+year+" "+month+" "+number+" "+username+" "+password);
    }

}
