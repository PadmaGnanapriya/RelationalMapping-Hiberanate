package lk.ac.uok.setu;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */


public class Student {
    private String name;;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "lk.ac.uok.setu.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
