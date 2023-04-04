package collection_practice;

public class Employee {

    private String name;
    private int age;
    private Address address;


    public Employee(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public  Address getAddress() {
        return address;
    }

    @Override
    public String toString(){
        return name+" "+age+" "+address;
    }
}
