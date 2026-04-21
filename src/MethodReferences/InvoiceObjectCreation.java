package MethodReferences;
import java.util.*;
import java.util.stream.*;

class Invoice{
    int id;
    Invoice(int id){
        this.id=id;
    }
}

public class InvoiceObjectCreation{
    public static void main(String[] args){
        List<Integer> list=Arrays.asList(1,2,3,4);
        list.stream().map(Invoice::new).forEach(i->System.out.println(i.id));
    }
}