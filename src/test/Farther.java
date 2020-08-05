package test;

public abstract class Farther {

    public Person person;

    public Farther() {
        this.person = new Person(10,"person1");
    }

    public void printPerson(){
        System.out.println("farther");
    }
}
