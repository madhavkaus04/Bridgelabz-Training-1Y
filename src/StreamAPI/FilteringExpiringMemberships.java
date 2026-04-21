package StreamAPI;
import java.util.*;
import java.time.*;

class Member{
    String name;
    LocalDate expiry;
    Member(String name,LocalDate expiry){
        this.name=name;
        this.expiry=expiry;
    }
}

public class FilteringExpiringMemberships{
    public static void main(String[] args){
        List<Member> list=new ArrayList<>();
        list.add(new Member("A",LocalDate.now().plusDays(10)));
        list.add(new Member("B",LocalDate.now().plusDays(40)));
        list.add(new Member("C",LocalDate.now().plusDays(25)));

        LocalDate today=LocalDate.now();
        LocalDate limit=today.plusDays(30);

        list.stream()
                .filter(m->!m.expiry.isBefore(today)&&!m.expiry.isAfter(limit))
                .forEach(m->System.out.println(m.name+" "+m.expiry));
    }
}