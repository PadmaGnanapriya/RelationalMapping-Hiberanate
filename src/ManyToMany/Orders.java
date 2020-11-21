package ManyToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class Orders {
    @Id
    private int order_id;
    private String date;

    @ManyToMany
    private List<Items> itemsList = new ArrayList();

    public Orders() {
    }

    public Orders(int order_id, String date) {
        this.order_id = order_id;
        this.date = date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "order_id=" + order_id +
                ", date='" + date + '\'' +
                '}';
    }
}
