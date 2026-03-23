package com.gla.ThreadsInJava;
class Order implements Runnable{
    String name; int time;
    Order(String name,int time){
        this.name=name; this.time=time;
    }
    public void run(){
        try{
            System.out.println(name+" Picked");
            Thread.sleep(time);
            System.out.println(name+" Delivered");
        }catch(Exception e){}
    }
}
public class FoodDelivery{
    public static void main(String[] args){
        Thread t1=new Thread(new Order("Express",2000));
        Thread t2=new Thread(new Order("Standard",4000));
        Thread t3=new Thread(new Order("Economy",5000));
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(3);
        t1.start(); t2.start(); t3.start();
    }
}