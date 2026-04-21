package LambdaExpressions;
import java.util.*;
import java.util.function.Predicate;

class Alert{
    String message;
    String type;
    Alert(String message,String type){
        this.message=message;
        this.type=type;
    }
}

public class NotificationFiltering{
    public static void main(String[] args){
        List<Alert> list=new ArrayList<>();
        list.add(new Alert("High Fever","critical"));
        list.add(new Alert("Regular Checkup","normal"));
        list.add(new Alert("Low BP","critical"));

        Predicate<Alert> filter=a->a.type.equals("critical");

        for(Alert a:list){
            if(filter.test(a)){
                System.out.println(a.message+" "+a.type);
            }
        }
    }
}