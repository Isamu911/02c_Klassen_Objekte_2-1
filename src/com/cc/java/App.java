package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29); // Klasse --> Objekt / Instanz
        
<<<<<<< HEAD
       
        output("Name: " + cat1.getStringAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringAttributes("#color"));
        
=======
        output("Name: " + cat1.getStringAttributes("#name"));
        output("Fellfarbe: " + cat1.getStringAttributes("#color"));

>>>>>>> 6a56a243f0bc684a0c76246c368e875f9491446d
        output("Alter: " + cat1.getAge());

        output("------------------------");

        Cat cat2 = new Cat("Alonzo", "black", 35); // Klasse --> Objekt / Instanz
<<<<<<< HEAD
        
        output("Name: " + cat2.getStringAttributes("#name"));
        output("Fellfarbe: " + cat2.getStringAttributes("#color"));
        
        output("Alter: " + cat2.getAge());


        
=======
   
        output("Name: " + cat2.getStringAttributes("#name"));
        output("Fellfarbe: " + cat2.getStringAttributes("#color"));
        
        output("Alter: " + cat2.getAge());

>>>>>>> 6a56a243f0bc684a0c76246c368e875f9491446d
    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}
