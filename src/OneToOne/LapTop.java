package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class LapTop {
    @Id
    @Column(name = "lap_id")
    private int lapTopId;
    @Column(name = "student_Name")
    private String brand;

    @OneToOne
    private Student student;

    public LapTop() {
    }

    public LapTop(int lapTopId, String brand) {
        this.lapTopId = lapTopId;
        this.brand = brand;
    }

    public int getLapTopId() {
        return lapTopId;
    }

    public void setLapTopId(int lapTopId) {
        this.lapTopId = lapTopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "OneToOne.LapTop{" +
                "lapTopId=" + lapTopId +
                ", brand='" + brand + '\'' +
                '}';
    }
}
