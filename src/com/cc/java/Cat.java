package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }

    public String getStringAttributes(String flag){
<<<<<<< HEAD
        switch (flag){
=======
        switch (flag) {
>>>>>>> 6a56a243f0bc684a0c76246c368e875f9491446d
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!?";
<<<<<<< HEAD

        }
    }

  
=======
        }  
    }
>>>>>>> 6a56a243f0bc684a0c76246c368e875f9491446d

    public int getAge() {
        return age;
    }

  
    


}
