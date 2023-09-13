import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO: ƒоработать в рамках домашней работы
 */
public class Freelancer extends Employee{

    private boolean hasComputer;
    private boolean hasDistractionsAtHome;
    private boolean hasOtherWork;

    protected Freelancer(String surName, String name, double salary) {
        super(surName, name, salary);
    }
    public static Freelancer getInstance(){
        return new Freelancer(
                surNames[random.nextInt(surNames.length)],
                names[random.nextInt(surNames.length)],
                ThreadLocalRandom.current().nextInt(500, 3000));
    }

    public static List<Freelancer> getFreelancers(int count){
        List<Freelancer> freelancers = new ArrayList<>();
        for (int i = 0; i < count; i++)
            freelancers.add(getInstance());
        return freelancers;
    }

    @Override
    public double calculateSalary() {
        return 20.8 * 8 * salary;
    }
    @Override
    public String toString() {
        return String.format("%s %s; ‘рилансер; —реднемес€чна€ заработна€ плата (почасова€ мес€чна€ оплата): %.2f (руб.)",
                surName, name, salary);
    }
}
