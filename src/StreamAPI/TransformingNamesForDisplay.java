package StreamAPI;
import java.util.*;
import java.util.stream.*;

public class TransformingNamesForDisplay{
    public static void main(String[] args){
        List<String> list=Arrays.asList("ram","shyam","mohan","amit");
        list.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}