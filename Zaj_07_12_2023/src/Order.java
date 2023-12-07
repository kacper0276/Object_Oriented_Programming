import java.time.LocalDate;
import java.util.Comparator;

public class Order {
    int id;
    String customerName;
    LocalDate orderDate;

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", orderDate=" + orderDate +
                '}';
    }

    public Order(int id, String customerName, LocalDate orderDate) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = orderDate;
    }
}

class CompareOrderDate implements Comparator<Order> {

    protected int compareDate(LocalDate d1, LocalDate d2) {
        int compareValue = d1.compareTo(d2);

        if (compareValue > 0) {
            return 1;
        } else if (compareValue < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public int compare(Order o1, Order o2) {
        return compareDate(o1.orderDate, o2.orderDate);
    }
}

class CompareOrderId implements Comparator<Order> {

    @Override
    public int compare(Order o1, Order o2) {
        return o1.id - o2.id;
    }
}
