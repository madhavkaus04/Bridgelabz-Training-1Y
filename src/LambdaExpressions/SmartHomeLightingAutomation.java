package LambdaExpressions;

interface LightAction{
    void run();
}

public class SmartHomeLightingAutomation{
    public static void main(String[] args){
        LightAction motion=()->System.out.println("Lights ON - Motion detected");
        LightAction night=()->System.out.println("Dim Lights - Night mode");
        LightAction voice=()->System.out.println("Lights ON - Voice command");
        motion.run();
        night.run();
        voice.run();
    }
}