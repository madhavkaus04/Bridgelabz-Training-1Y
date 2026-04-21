package MethodReferences;
import java.util.*;

public class HospitalPatientIDPrinting{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(101,102,103,104);
        list.forEach(System.out::println);
    }
}