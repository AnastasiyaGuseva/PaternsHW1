package org.example;

import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        int s = 0;
        for (int i : source) {
            if (i > treshold) {
                logger.log("Элемент подходит");
                result.add(i);
                s++;
            } else logger.log("Элемент не подходит");
        }
        logger.log("Элемент из источника прошёл фильтр");
        return result;
    }
}