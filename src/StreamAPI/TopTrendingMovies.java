package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Movie{
    String name;
    int rating;
    int year;
    Movie(String name,int rating,int year){
        this.name=name;
        this.rating=rating;
        this.year=year;
    }
}

public class TopTrendingMovies{
    public static void main(String[] args){
        List<Movie> list=new ArrayList<>();
        list.add(new Movie("A",5,2023));
        list.add(new Movie("B",4,2022));
        list.add(new Movie("C",5,2024));
        list.add(new Movie("D",3,2021));
        list.add(new Movie("E",4,2023));
        list.add(new Movie("F",5,2022));

        list.stream()
                .filter(m->m.rating>=4)
                .sorted((a,b)->{
                    if(b.rating!=a.rating)return b.rating-a.rating;
                    else return b.year-a.year;
                })
                .limit(5)
                .forEach(m->System.out.println(m.name+" "+m.rating+" "+m.year));
    }
}