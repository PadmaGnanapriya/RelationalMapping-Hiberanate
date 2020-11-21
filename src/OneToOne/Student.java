package OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class Student {
    @Column(name = "Student_Id")
    private String name;
    @Id
    @Column(name="Student_Name")
    private int id;

    @OneToOne(mappedBy = "student")
    private LapTop lapTop;

    public Student() {
    }

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

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
        return "OneToOne.Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
