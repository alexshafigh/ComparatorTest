package com.Assignments.Example2;

public class AgeComparator implements HumanComparator<Human>  {

    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getAge() > o2.getAge()) {return +1;}
        else if (o1.getAge() == o2.getAge()) return  0;
            else return -1;
    }
}
