package OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by Padma Gnanapiya (SE/2017/014)
 */

@Entity
public class Subject {
    @Id
    private int subject_id;
    private String subjectName;

    @ManyToOne
    private Teacher teacher;

    public Subject() {
    }

    public Subject(int subject_id, String subjectName) {
        this.subject_id = subject_id;
        this.subjectName = subjectName;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subject_id=" + subject_id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}
