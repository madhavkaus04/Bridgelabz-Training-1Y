package MethodReferences;
import java.util.*;
import java.util.stream.*;

public class NameUppercasing{
    public static void main(String[] args){
        List<String> list=Arrays.asList("ram","shyam","mohan");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}