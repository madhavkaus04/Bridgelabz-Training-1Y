package LambdaExpressions;
import java.util.*;

class Product{
    String name;
    int price;
    int rating;
    int discount;
    Product(String name,int price,int rating,int discount){
        this.name=name;
        this.price=price;
        this.rating=rating;
        this.discount=discount;
    }
}

public class CustomSortingECommerce{
    public static void main(String[] args){
        List<Product> list=new ArrayList<>();
        list.add(new Product("Phone",20000,4,10));
        list.add(new Product("Laptop",50000,5,15));
        list.add(new Product("Tablet",15000,3,20));

        Collections.sort(list,(a,b)->a.price-b.price);
        for(Product p:list)System.out.println(p.name+" "+p.price);

        Collections.sort(list,(a,b)->b.rating-a.rating);
        for(Product p:list)System.out.println(p.name+" "+p.rating);

        Collections.sort(list,(a,b)->b.discount-a.discount);
        for(Product p:list)System.out.println(p.name+" "+p.discount);
    }
}