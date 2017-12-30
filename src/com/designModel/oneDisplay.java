package com.designModel;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by machenike on 2017/7/4 0004.
 */
public class oneDisplay implements Observer {
    Observable observable;
    private int data1;
    private int data2;
    public oneDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obs, Object arg) {
            if(obs instanceof WeatherObsevable){
                //拉取的方式
                WeatherObsevable weatherObsevable =(WeatherObsevable) obs;
                this.data1 = weatherObsevable.getData1();
                this.data2 = weatherObsevable.getData2();
                display();
            }
    }
    public void display(){
        System.out.println("我是观察者1，当前的数据分别为："+data1+"，"+data2);
    }
}
