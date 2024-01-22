package tourism;

public class TestHotel {
    public static void main(String[] args){
        Hotel originalHotel1 = new Hotel("Hotel A", 100);
        Hotel originalHotel2 = new Hotel("Hotel B", 150);

        System.out.println("Oryginalne hotele:");
        System.out.println("Hotel 1: " + originalHotel1);
        System.out.println("Hotel 2: " + originalHotel2);

        try {
            Hotel clonedHotel1 = (Hotel) originalHotel1.clone();
            Hotel clonedHotel2 = (Hotel) originalHotel2.clone();

            originalHotel1.setName("Nowy Hotel A");

            System.out.println("\nPo zmianie nazwy oryginału:");
            System.out.println("Oryginalny Hotel 1: " + originalHotel1);
            System.out.println("Oryginalny Hotel 2: " + originalHotel2);

            System.out.println("\nSklonowane hotele:");
            System.out.println("Hotel 1 (klon): " + clonedHotel1);
            System.out.println("Hotel 2 (klon): " + clonedHotel2);
        } catch (CloneNotSupportedException e) {
            System.out.println("Klonowanie nie jest obsługiwane.");
        }
    }
}
