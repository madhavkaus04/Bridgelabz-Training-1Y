package StreamAPI;
import java.util.*;

public class StockPriceLogger{
    public static void main(String[] args){
        List<Double> list=Arrays.asList(120.5,121.3,119.8,122.0);
        list.forEach(p->System.out.println(p));
    }
}