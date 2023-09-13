import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Employee> employees = Worker.getEmployees(3);

        for (Employee employee: employees) {
            System.out.println(employee);
        }


        System.out.println();

        List<Freelancer> freelancers = Freelancer.getFreelancers(3);
        for (Freelancer freelance: freelancers) {
            System.out.println(freelance);
        }
        


//        Collections.sort(employees, new EmployeeNameComparator());
//        System.out.println();
//
//        for (Employee employee: employees) {
//            System.out.println(employee);
//        }

        }

}
