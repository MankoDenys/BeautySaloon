import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class User {
    private final String id = UUID.randomUUID().toString();
    private final String name;
    private final Account account;
    private final List<Order> orders = new ArrayList<>();
    private Order order = new Order();

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public boolean payForOrder() {
        long price = order.getPrice();
        boolean success = account.withdraw(price);

        if (!success) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", account=" + account +
                ", orders=" + orders +
                ", order=" + order +
                '}';
    }
}
