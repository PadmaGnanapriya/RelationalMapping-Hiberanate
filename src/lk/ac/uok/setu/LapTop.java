package lk.ac.uok.setu;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class LapTop {
    private int lapTopId;
    private String brand;

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
        return "lk.ac.uok.setu.LapTop{" +
                "lapTopId=" + lapTopId +
                ", brand='" + brand + '\'' +
                '}';
    }
}
