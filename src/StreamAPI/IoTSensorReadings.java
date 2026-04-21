package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class IoTSensorReadings{
    public static void main(String[] args){
        List<Double> list=Arrays.asList(20.5,35.2,15.8,40.0,28.3);
        double threshold=25.0;
        list.stream()
                .filter(r->r>threshold)
                .forEach(r->System.out.println(r));
    }
}