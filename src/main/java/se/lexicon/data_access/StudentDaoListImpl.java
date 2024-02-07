package se.lexicon.data_access;
import se.lexicon.model.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class StudentDaoListImpl implements StudentDao {
    List<Student> students;

    public StudentDaoListImpl(){students =new ArrayList<>();}
    @Override
    public Student find(int id) {
        for(Student student: students){ if(student.getId() == id) return student; }
        return null;
    }

    @Override
    public Student save(Student student) {
        if(student == null) throw new IllegalArgumentException("Student was null");
        student.setId(Student.GenerateUniqueID());
        students.add(student);
        return student;
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(students);
    }

    @Override
    public void delete(int id) {
        students.removeIf(student -> student.getId() == id);
    }
}
