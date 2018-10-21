import java.util.ArrayList;
import java.util.List;

public class Service {
    private String name;
    private long price;
    private String leadTime;
    private String description;

    public Service(String name, long price, String leadTime, String description) {
        this.name = name;
        this.price = price;
        this.leadTime = leadTime;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public String getLeadTime() {
        return leadTime;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", leadTime='" + leadTime + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
