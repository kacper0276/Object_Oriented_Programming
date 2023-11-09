public class Person {
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

}

class Employee extends Person {

    public Employee(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public void test() {
        System.out.println(this.lastName);
//        System.out.println(this.firstName); <- pole prywatne dostępne tylko w tej klasie
    }

    public void displayData() {
        System.out.println("firstName " + getFirstName() + " lastName " + getLastName());
    }


}