import java.util.Random;

public abstract class Employee implements Comparable<Employee> {

    //region Public Methods

    /**
     * ������ �������������� ���������� �����
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        return Double.compare(calculateSalary(), o.calculateSalary());
        //return calculateSalary() == o.calculateSalary() ? 0 :
        //        calculateSalary() > o.calculateSalary() ? 1 : -1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", salary=" + salary +
                '}';
    }

    //endregion

    //region Constructors And Initializers

    {
        //System.out.println("Initialize - Employee");
        id = ++counter;
    }

    private Employee(){
        this("#Surnane#", "#Name#");
    }

    private Employee(String surName, String name){
        this(surName, name, 1000);
    }

    protected Employee(String surName, String name, double salary){
        //System.out.println("Constructor - Employee");
        if (salary < 500){
            throw new RuntimeException("������ ���������� ����� ������ ���� �� ����� 500");
        }
        this.surName = surName;
        this.name = name;
        this.salary = salary;
    }

    //endregion

    //region Getters and Setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 30000){
            throw new RuntimeException("������� ���������� ����� ������ ���� �� ����� 30000");
        }
        this.salary = salary;
    }

    //endregion

    //region Fields

    private int id;

    /**
     * ���
     */
    protected String name;

    /**
     * �������
     */
    protected String surName;

    /**
     * ������ ���������� �����
     */
    protected double salary;

    //endregion

    //region Static Fields

    protected static String[] names = new String[] { "��������", "����", "����", "������", "������", "�������", "����", "���������", "�����", "������" };
    protected static String[] surNames = new String[] { "���������", "�����", "��������", "������", "�����", "�������", "�������", "��������", "������", "�������" };
    protected static Random random = new Random();
    private static int counter = 1000;

    //endregion

}
