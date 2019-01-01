package com.Assignments.Example2;

import java.util.Comparator;

public class NameComparator implements HumanComparator<Human> {

    @Override
    public int compare(Human o1, Human o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
