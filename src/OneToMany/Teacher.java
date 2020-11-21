package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class Teacher {
    @Id
    private int teacher_Id;
    private String name;

    @OneToMany(mappedBy = "teacher")
    private List<Subject> subjects = new ArrayList();

    public Teacher() {
    }

    public Teacher(int teacher_Id, String name) {
        this.setTeacher_Id(teacher_Id);
        this.setName(name);
    }

    public int getTeacher_Id() {
        return teacher_Id;
    }

    public void setTeacher_Id(int teacher_Id) {
        this.teacher_Id = teacher_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacher_Id=" + teacher_Id +
                ", name='" + name + '\'' +
                '}';
    }
}
