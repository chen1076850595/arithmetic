package com.designModel;

import java.util.Observable;

/**
 * Created by machenike on 2017/7/4 0004.
 */
public class WeatherObsevable extends Observable{
    int data1,data2;
    public WeatherObsevable(){

    }
    public void dateChanged(){
        setChanged();
        notifyObservers();
    }
    public void  setDates(int date1,int date2){
        this.data1 = date1;
        this.data2 = date2;
        dateChanged();
    }
    public int getData1() {
        return data1;
    }
    public int getData2() {
        return data2;
    }


}
