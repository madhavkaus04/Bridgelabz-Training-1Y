package com.gla.ThreadsInJava;
class User implements Runnable {
    String name;
    int priority;
    User(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println(name+" checking balance, priority: "+Thread.currentThread().getPriority());
            try{ Thread.sleep(2000);} catch(Exception e){}
        }
    }
}
public class BankSimulation {
    public static void main(String[] args) {
        Thread t1 = new Thread(new User("Premium User",10));
        Thread t2 = new Thread(new User("Regular User",5));
        Thread t3 = new Thread(new User("Basic User",1));
        t1.setPriority(10);
        t2.setPriority(5);
        t3.setPriority(1);
        t1.start(); t2.start(); t3.start();
    }
}
