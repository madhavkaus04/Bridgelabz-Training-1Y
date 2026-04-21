package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Claim{
    String type;
    double amount;
    Claim(String type,double amount){
        this.type=type;
        this.amount=amount;
    }
}

public class InsuranceClaimAnalysis{
    public static void main(String[] args){
        List<Claim> list=new ArrayList<>();
        list.add(new Claim("Health",2000));
        list.add(new Claim("Vehicle",5000));
        list.add(new Claim("Health",3000));
        list.add(new Claim("Vehicle",7000));
        list.add(new Claim("Life",10000));

        Map<String,Double> map=list.stream()
                .collect(Collectors.groupingBy(c->c.type,Collectors.averagingDouble(c->c.amount)));

        for(String k:map.keySet()){
            System.out.println(k+" "+map.get(k));
        }
    }
}