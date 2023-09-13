
public class FixedPaymentEmployee extends Employee{
    protected FixedPaymentEmployee(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
