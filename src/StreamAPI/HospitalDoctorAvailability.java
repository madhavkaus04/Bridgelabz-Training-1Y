package StreamAPI;
import java.util.*;
import java.util.stream.*;

class Doctor{
    String name;
    String specialty;
    boolean weekend;
    Doctor(String name,String specialty,boolean weekend){
        this.name=name;
        this.specialty=specialty;
        this.weekend=weekend;
    }
}

public class HospitalDoctorAvailability{
    public static void main(String[] args){
        List<Doctor> list=new ArrayList<>();
        list.add(new Doctor("A","Cardiology",true));
        list.add(new Doctor("B","Neurology",false));
        list.add(new Doctor("C","Dermatology",true));
        list.add(new Doctor("D","Orthopedic",true));

        list.stream()
                .filter(d->d.weekend)
                .sorted((a,b)->a.specialty.compareTo(b.specialty))
                .forEach(d->System.out.println(d.name+" "+d.specialty));
    }
}