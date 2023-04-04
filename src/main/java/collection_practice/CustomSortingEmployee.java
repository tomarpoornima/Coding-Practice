package collection_practice;
import java.util.*;

public class CustomSortingEmployee{

    public static void main(String[] args) {
        Address a1 = new Address("Gahal", "Harda");
        Address a2 = new Address("HSR Layout", "Bangalore");
        Address a3 = new Address("Pardesipura", "Indore");
        Address a4 = new Address("Vaishali Nagar", "Bhopal");

        Employee emp = new Employee("Poornima",26, a1);
        Employee emp1 = new Employee("Rakshendra", 30, a2);
        Employee emp2 = new Employee("Renuka", 22, a3);
        Employee emp3 = new Employee("Lokesh", 24, a4);


        List<Employee> values = new ArrayList<>();
        values.add(emp);
        values.add(emp1);
        values.add(emp2);
        values.add(emp3);


       /* System.out.println("Sorting by age by java 8 feature");
        Comparator<Employee> cm1 = Comparator.comparing(Employee::getAge);
        Collections.sort(values, cm1);
        for(Employee e : values){
            System.out.println(e.name+" "+e.age);
        }*/

        System.out.println();
        System.out.println("sorting age by class comparator");

        Collections.sort(values, new AgeComparator());
        System.out.println(values);
        /*Iterator<Employee> itr = values.iterator();
        while (itr.hasNext()){
            Employee employee = itr.next();
            System.out.println(employee.getName()+" "+employee.getAge());
        }*/
        System.out.println();


       /* System.out.println("Sorting by name by java 8 feature");
        Comparator<Employee> cm2 = Comparator.comparing(Employee::getName);
        Collections.sort(values, cm2);
        for (Employee e : values){
            System.out.println(e.name+" "+e.age);
        }*/

        System.out.println();
        System.out.println("sorting Name by class comparator");

       Collections.sort(values, new NameComparator());
        System.out.println(values);
       /*Iterator<Employee> itr2 = values.iterator();
       while (itr2.hasNext()){
           Employee employee1 =  itr2.next();
           System.out.println(employee1.getName()+" "+employee1.getAge());

       }*/
        System.out.println();
        System.out.println("Sorting by city by class comparator");

        Collections.sort(values, new AddressComparator());
        System.out.println(values);
        /*Collections.reverse(values);
        System.out.println(values);*/
        Collections.sort(values, new AddressComparator().reversed());
        System.out.println(values);
        /*Iterator<Employee> itr3 = values.iterator();
        while (itr3.hasNext()){
            Employee address1 = itr3.next();
            System.out.println(address1.getAddress().getStreet()+" "+address1.getAddress().getCity());
        }*/


     }

    static class AgeComparator implements Comparator<Employee>{

        public int compare(Employee e1, Employee e2) {

            if(e1.getAge() == e2.getAge()){
                return 0;
            }else if(e1.getAge() > e2.getAge()){
                return 1;
            }else{
                return -1;
            }
        }
    }
    static class NameComparator implements Comparator<Employee>{

        public int compare(Employee e1, Employee e2){
            return e1.getName().compareTo(e2.getName());
        }
    }

    static class AddressComparator implements Comparator<Employee>{

        public int compare(Employee a1, Employee a2){
            return a1.getAddress().getCity().compareTo(a2.getAddress().getCity());
        }
    }



    /*public static  List<Employee> sortEmployeeAge(List<Employee> employees){
        List<Employee> res = new ArrayList<>();

        int len = employees.size();

        for(int i=0; i<len; i++){
            Employee employee = employees.get(i);
            for(int j=1; j<len; j++){
                Employee employee1 = employees.get(j);
                if(employee.getAge() < employee1.getAge()){
                    res.add(employee);
                }else{
                    res.add(employee1);
                }
            }

        }
        return res;
    }

    public static  List<Employee> sortEmployeeName(List<Employee> employees){
        List<Employee> res = new ArrayList<>();

        int len = employees.size();

        for(int i=0; i<len; i++){
            Employee employee = employees.get(i);
            for(int j=1; j<len; j++){
                Employee employee1 = employees.get(j);
                if(employee.getAge() < employee1.getAge()){
                    res.add(employee);
                }else{
                    res.add(employee1);
                }
            }

        }
        return res;
    }
    public static  List<Employee> sortEmployeeCity(List<Employee> employees){
        List<Employee> res = new ArrayList<>();

        int len = employees.size();

        for(int i=0; i<len; i++){
            Employee employee = employees.get(i);
            for(int j=1; j<len; j++){
                Employee employee1 = employees.get(j);
                if(employee.getAddress().getCity().equals(employee1.getAddress().getCity())){
                    res.add(employee);
                }else{
                    res.add(employee1);
                }
            }

        }
        return res;
    }*/
}