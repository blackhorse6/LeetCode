package others;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * User          : zhouchenbin
 * Date          : 2020-09-23
 * ----      Title           ----
 * ----      Description     ----
 * ----      Example         ----
 */
public class EqualsAndHashCode {
    public static void main(String[] args) {
        //mock A
        List<Son> sonListA = new ArrayList<>();
        Son son1 = new Son("son1", 1);
        Son son2 = new Son("son2", 2);
        sonListA.add(son1);
        sonListA.add(son2);
        Parent parent = new Parent("parent1", 10, sonListA);

        //mock B
        List<Son> sonListB = new ArrayList<>();
        Son son3 = new Son("son1", 1);
        Son son4 = new Son("son2", 2);

        sonListA.add(son4);
        sonListA.add(son3);

        Parent parent1 = new Parent("parent1", 10, sonListB);

        System.out.println(parent.equals(parent1));

    }

}

class Parent {
    public Parent(String name, int age, List<Son> sonList) {
        this.name = name;
        this.age = age;
        this.sonList = sonList;
    }

    String name;
    int age;
    List<Son> sonList;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age &&
                Objects.equals(name, parent.name)
//                && Objects.equals(sonList, parent.sonList);
                && sonList.retainAll(parent.sonList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sonList);
    }
}

class Son {
    public Son(String sonName, int sonAge) {
        this.sonName = sonName;
        this.sonAge = sonAge;
    }

    String sonName;
    int sonAge;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Son son = (Son) o;
        return sonAge == son.sonAge &&
                Objects.equals(sonName, son.sonName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sonName, sonAge);
    }
}
