public class Main {
    public static void main(String[] args) {

        // Zadanie 1
        Dog dog = new Dog();
        dog.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();

        // Zadanie 2
        TestMyComparator testMyComparator = new TestMyComparator();
        System.out.println(testMyComparator.compare(1, 2));

        // Zadanie 3
        UserAuthentication userAuthentication = new UserAuthentication("login", "haslo");
        System.out.println(userAuthentication.login("test", "haslo"));
        userAuthentication.logout();

        AdminAuthentication adminAuthentication = new AdminAuthentication("login", "haslo");
        System.out.println(adminAuthentication.resetPassword("login", "haslo", "nowe"));
        System.out.println(adminAuthentication.login("login", "nowe"));
        System.out.println(adminAuthentication.login("login", "haslo"));
        adminAuthentication.logout();

        // Zadanie 4
        SensorTest.Test();

        // Zadanie 5
        TextProcessor textProcessor = new TextProcessor();
        System.out.println(textProcessor.isValid("dajisj"));
        System.out.println(textProcessor.processData("mars"));

        NumberProcessor numberProcessor = new NumberProcessor();
        System.out.println(numberProcessor.isValid("1234590"));
        System.out.println(numberProcessor.isValid("1234590a"));
        System.out.println(numberProcessor.processData("12345"));
    }
}