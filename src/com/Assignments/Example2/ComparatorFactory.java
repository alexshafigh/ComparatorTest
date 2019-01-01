package com.Assignments.Example2;


import com.sun.org.apache.bcel.internal.generic.RET;

import java.util.Comparator;

public class ComparatorFactory {
    private  static HumanComparator<Human> humanComparator;
//
//    public ComparatorFactory(Comparator humanComparator) {
//        this.humanComparator = humanComparator ;
//    }

    public HumanComparator getComparatorByTypeString(String comparatorType) {
        switch (comparatorType) {
            case "Age": {
                return new AgeComparator();
            }
            case "Name": {
                return new NameComparator();
            }
            case "Height": {
                return new HeightComparator();
            }
            default:
                return null;
        }
    }

    public Comparator getComparator() {
        return humanComparator;
    }
}
