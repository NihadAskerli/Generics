import java.util.Objects;

public class Person {
    private int age;
    private String name;
    private String surname;
public Person(int age,String name,String surname){
    this.age=age;
    this.surname=surname;
    this.name=name;
}
    public String getSurname() {
        return surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return age == person.age && name.equals(person.name) && surname.equals(person.surname);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name, surname);
//    }
}
