package se.lexicon.service;

import se.lexicon.data_access.StudentDao;
import se.lexicon.util.UserInputService;
import se.lexicon.model.Student;

import java.util.List;

public class StudentManagementConsoleImpl implements StudentManagement {

    UserInputService scannerService;
    StudentDao studentDao;

    public StudentManagementConsoleImpl(UserInputService userInputService, StudentDao studentDao){
        this.scannerService = userInputService;
        this.studentDao = studentDao;
    }
    @Override
    public Student create() {
        String name = scannerService.getString();
        return new Student(name);
    }

    @Override
    public Student save(Student student) {
       return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.find(id);
    }

    @Override
    public Student remove(int id) {
        Student removedStudent = studentDao.find(id);
        if (removedStudent != null) {
            studentDao.delete(id);
        }
        return removedStudent;
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        studentDao.delete(student.getId());
        return studentDao.save(student);
    }
}
