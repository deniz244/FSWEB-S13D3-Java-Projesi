package com.workintech.oop;

public class Wall {
    //fields
    double width;
    double height;

    //constructor
    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    //methods
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setWidth(double param){
        if(param < 0){
            width = 0;
        }else {
            width = param;
        }
    }
    public void setHeight(double param){
        if(param < 0){
            height = 0;
        }else {
            height = param;
        }
    }

    public double getArea(){
        return width*height;
    }



}
