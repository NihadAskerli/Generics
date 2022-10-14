package bean;

public class Person {
    private String name;
    private String surname;
    private int id;
    public Person(String name,String surname,int id){
        this.id=id;
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.getClass().getName() +" id="+id+" name="+name+" Surname="+surname;
    }
}
