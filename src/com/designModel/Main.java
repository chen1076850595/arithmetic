package com.designModel;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;


/**
 * Created by machenike on 2017/7/4 0004.
 */
public class Main {
    public static void main(String args[]){
        WeatherObsevable weatherObsevable = new WeatherObsevable();
        oneDisplay oneDisplay = new oneDisplay(weatherObsevable);
        twoDisplay twoDisplay = new twoDisplay(weatherObsevable);
        oneDisplay.observable.deleteObserver(oneDisplay);
        weatherObsevable.setDates(2,3);
        HashMap map = new HashMap();
        map.put("aaa","123");
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put("aaa","123");
        testClass test1 = new testClass();
        testClass test2 = new testClass();
        test1.setNum1(1);
        test1.setNum2(1);
        test2.setNum1(2);
        test2.setNum2(2);
        System.out.println(test1.getNum1());
        System.out.println(new Random().nextInt(6));

    }
}
