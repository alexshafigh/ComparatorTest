package com.Assignments.Example2;

import java.util.Arrays;
import java.util.Comparator;

public  class StrategyContext {
    private Comparator comparator;

    public StrategyContext() {
        comparator = new AgeComparator();
    }

    public  void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    public <T> void sortByStrategy(T[] inputArray){
        Arrays.asList(inputArray).sort(this.comparator);
    }


}
