package com.workintech.oop;

public class Person {

    //instance variables/fields

    String firstName;
    String lastName;
    int age;
    String gender;
    String address;
    String phoneNum;

    //Constructor1
    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;

    }

    //Constructor2
    public Person(String gender,String address,String phoneNum,String firstName, String lastName, int age){
        //constructor chaining
        this(firstName,lastName,age);
        this.gender=gender;
        this.address=address;
        this.phoneNum=phoneNum;
    }

    //Methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        return age >= 13 && age <= 19;
    }





}
