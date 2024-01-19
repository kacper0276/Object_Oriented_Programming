package RecordPrzyklad;

public class TestItemPickup {
    public static void main(String[] args) {
        ItemPickup itemPickup = new ItemPickup("Imie");
        System.out.println(itemPickup.itemName() + " " + itemPickup.amount());
        ItemPickup itemPickup1 = new ItemPickup("Imie1", -5);
        System.out.println(itemPickup1.itemName() + " " + itemPickup1.amount());
    }
}
