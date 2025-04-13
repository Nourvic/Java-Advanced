import java.util.*;

public class Person implements Comparable<Person> {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;

    }

    @Override
    public int compareTo(Person p2) {
        return Integer.compare(this.getAge(), p2.getAge());
    }


    @Override
    public String toString() {
        Formatter fo = new Formatter();
        fo.format("Name: %s Age %d ", name, age);
        // return "Name: " + name + " Age: " + age;
        return fo.toString();
    }

    // Methode, um die Details der Person anzuzeigen

    public static void main(String[] args) {
        Person p1 = new Person("Zlice", 35);
        Person p2 = new Person("Bob", 30);
//        System.out.println(p1);
//        System.out.println(p2);

        List<Person> liste = new ArrayList();
        liste.add(p1);
        liste.add(p2);
        //Collections.sort(liste,(a,b)-> b.getName().compareTo(a.getName()));
        Collections.sort(liste,new Namenvergleich());
      //  liste.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
     //   Collections.sort(liste);
        Iterator it = liste.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

//        for (Person p : liste) {
//              System.out.println(p);
//        }


    }
}