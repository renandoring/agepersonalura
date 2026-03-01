package br.com.alura.age.model;

import java.util.Scanner;

public class AgePerson {
    private String name;
    private int age = 0;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AgePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Tchnique specifications
    public void specifications(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }

    //Age consultation
    public void compareAge(){

        System.out.println("Enter the age for know if the major or minor");

        //Scanner input = new Scanner(System.in);
        //int ageConsul = input.nextInt();

        if (getAge() >= 18){
            System.out.println("He´s major.");
        } else {
            System.out.println("He´s minor.");
        }
        age = getAge();
    }

    @Override
    public String toString() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\n";
    }
}
