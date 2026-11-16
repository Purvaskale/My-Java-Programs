import java.util.*;

class Employee {
    int id;
    String name, dept;

    Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public String toString() {
        return id + " " + name + " " + dept;
    }
}

public class EmployeeDirectory {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Aditi", "IT"));
        list.add(new Employee(102, "Vedika", "HR"));
        list.add(new Employee(103, "Poonam", "IT"));

        HashSet<String> dept = new HashSet<>();
        dept.add("IT");
        dept.add("HR");

        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Aditi");
        map.put(102, "Vedika");
        map.put(103, "Poonam");

        Iterator<Employee> itr = list.iterator();

        System.out.println("Employees:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Departments: " + dept);
        System.out.println("Employee Map: " + map);

        System.out.println("Search: " + map.get(102));
    }
}
