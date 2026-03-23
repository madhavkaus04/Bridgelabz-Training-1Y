package com.gla.ThreadsInJava;
class Task implements Runnable{
    String name; int delay;
    Task(String name,int delay){
        this.name=name; this.delay=delay;
    }
    public void run(){
        try{
            Thread.sleep(delay);
            System.out.println(name+" started");
        }catch(Exception e){}
    }
}
public class ExamSystem{
    public static void main(String[] args){
        Thread t1=new Thread(new Task("Entry",0));
        Thread t2=new Thread(new Task("Question Paper",5000));
        Thread t3=new Thread(new Task("Attendance",10000));
        Thread t4=new Thread(new Task("Collection",15000));
        t1.setPriority(5);
        t2.setPriority(10);
        t3.setPriority(8);
        t4.setPriority(7);
        t1.start(); t2.start(); t3.start(); t4.start();
    }
}
