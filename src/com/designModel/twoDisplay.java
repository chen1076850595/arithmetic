package com.designModel;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by machenike on 2017/7/4 0004.
 */
public class twoDisplay implements Observer{
    Observable observable;
    int data1;


    public twoDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherObsevable){
            WeatherObsevable weatherObsevable = (WeatherObsevable) o;
            data1 = weatherObsevable.getData1();
            display();
        }
    }
    public void display(){
        System.out.println("我是观察者2，我只需要数据1："+data1);
    }}
