package aRepl_Practice;

public class Person_Action {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);
        System.out.println(person);
        Person person1 = new Person("Fatima", "Lee", 22);
        System.out.println(person1);
    }
}
