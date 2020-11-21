package ManyToMany;

import com.sun.org.apache.xpath.internal.operations.Or;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class Items {
    @Id
    private int itemCode;
    private String description;

    @ManyToMany
    private List<Orders> ordersList =new ArrayList<>();
    public Items() {
    }

    public Items(int itemCode, String description) {
        this.itemCode = itemCode;
        this.description = description;
    }

    public int getItemCode() {
        return itemCode;
    }

    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
