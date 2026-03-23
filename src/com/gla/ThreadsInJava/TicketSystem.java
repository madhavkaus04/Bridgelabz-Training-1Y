package com.gla.ThreadsInJava;
class Ticket extends Thread{
    String type;
    Ticket(String type){
        this.type=type;
    }
    public void run(){
        try{
            System.out.println(type+" processing by "+Thread.currentThread().getName());
            Thread.sleep((int)(Math.random()*5000));
            System.out.println(type+" completed");
        }catch(Exception e){}
    }
}
public class TicketSystem{
    public static void main(String[] args){
        Ticket t1=new Ticket("Critical");
        Ticket t2=new Ticket("Feature");
        Ticket t3=new Ticket("Query");
        Ticket t4=new Ticket("Feedback");
        t1.setPriority(10);
        t2.setPriority(4);
        t3.setPriority(2);
        t4.setPriority(1);
        t1.start(); t2.start(); t3.start(); t4.start();
    }
}
