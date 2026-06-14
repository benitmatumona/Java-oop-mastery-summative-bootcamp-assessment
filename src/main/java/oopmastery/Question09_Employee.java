package oopmastery;

public abstract class Question09_Employee {

    protected String name;

    public Question09_Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateBonus();
}