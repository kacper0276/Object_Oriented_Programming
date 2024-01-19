package RecordPrzyklad;

public record ItemPickup(String itemName, int amount) {
    public ItemPickup {
        if(amount <= 0) {
            amount = 1;
        }
    }

    public ItemPickup(String itemName) {
        this(itemName, 1);
    }
}
