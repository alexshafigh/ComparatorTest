package com.Assignments.Example2;

public class Human  {
    private String name;
    private int age;
    private double height;

    public Human() {
    }

    public Human(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    @Override
    public String toString(){
//        System.out.printf(" Name ------------- Age --------------- Height");
        return " " + this.getName() + "," + this.getAge() + "," + this.getHeight() ;
    }



//     public <T> int compareByType(Human o1, Human o2 ,T compareFactory){
//        if (compareFactory instanceof String) //sort By name
//        {
//            compare(o1.name , o2.name);
//        }
//        if (compareFactory instanceof  Integer) // sort by age
//        {
//
//        }
//        if (compareFactory instanceof Double) // sort by height
//        {
//
//        }
//
//     }
}
