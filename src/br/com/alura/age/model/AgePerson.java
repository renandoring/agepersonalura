package br.com.alura.age.model;

import java.util.Scanner;

public class AgePerson {
    private String name = "Felipe Joselito";
    private int age;

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

    //Tchnique specifications
    public void specifications(){
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
    }

    //Age consultation
    public void compareAge(){

        System.out.println("Enter the age for know if the major or minor");

        Scanner input = new Scanner(System.in);
        int ageConsul = input.nextInt();

        if (ageConsul >= 18){
            System.out.println("He´s major.");
        } else {
            System.out.println("He´s minor.");
        }
        age = ageConsul;
    }
}
