
import java.util.ArrayList;
import java.util.Collections;

public class Main {


    public static void printData(Iterable<Person> persons) {
        for (Person person : persons) {
            String position = "";
            double amount = person.getPaymentAmount();

            if (person instanceof Employee) {
                position = "Employee";
            } else if (person instanceof Student) {
                position = "Student";
            }

            System.out.printf("%s: %s earns %.2f tenge%n",
                    position, person.toString(), amount);
        }
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee("John", "Lennon", "Manager", 27045.78);
        Employee employee2 = new Employee("George", "Harrison", "Developer", 50000.00);
        Employee employee3 = new Employee("Bob", "Dylan", "Analyst", 35000.00);


        Student student1 = new Student("Ringo", "Starr", 2.5);   // GPA <= 2.67 - не получает стипендию
        Student student2 = new Student("Paul", "McCartney", 3.8); // GPA > 2.67 - получает стипендию
        Student student3 = new Student("Mick", "Jagger", 2.67);   // GPA = 2.67 - не получает стипендию
        Student student4 = new Student("Freddie", "Mercury", 3.5); // GPA > 2.67 - получает стипендию


        ArrayList<Person> persons = new ArrayList<>();
        persons.add(employee1);
        persons.add(employee2);
        persons.add(employee3);
        persons.add(student1);
        persons.add(student2);
        persons.add(student3);
        persons.add(student4);

        System.out.println("Before sorting:");
        System.out.println("---------------");
        printData(persons);


        Collections.sort(persons);

        System.out.println("\nAfter sorting by payment amount:");
        System.out.println("---------------------------------");
        printData(persons);
    }
}