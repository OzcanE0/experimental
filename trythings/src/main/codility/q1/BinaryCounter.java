package q1;

import java.util.*;
import java.util.stream.Collectors;

// https://app.codility.com/programmers/lessons/1-iterations/binary_gap/ ADHD Extended edition binary max 0lı boşluk için kullanırsın keye takrar edem max 0 sayısını koysan sonra değeri çekeringo


public class BinaryCounter {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Personality mfEveryWhere=new Personality("75","100","infinity");
        Personality standartiziedTirreeek=new Personality("0","0","0");
        personList.add(mfEveryWhere);
        personList.add(standartiziedTirreeek);
        personList.add(new Person("Alice", 25, "New York"));
        personList.add(new Person("Bob", 30, "San Francisco"));
        personList.add(new Person("Charlie", 28, "Los Angeles"));
        personList.add(new Person("David", 28, "Chicago"));
        personList.add(new Person("Eva", 28, "Seattle"));
        personList.add(new Person("Alaaddin Keyybbbuuii",28));
        personList.add(new Person());
        Map<Integer,List<Person>> mappedList = personList.stream().collect(Collectors.groupingBy(Person::getAge));
       Set<Integer> keySet= mappedList.keySet();
       List<Person> choosenMFList= mappedList.get(Collections.max(keySet));
        System.out.printf("%s %d %s%n", choosenMFList.get(0).getName(), choosenMFList.get(0).getAge(), choosenMFList.get(0).getCity());
    }
}