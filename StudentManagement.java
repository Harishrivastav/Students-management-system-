import java.lang.Error;
import java.util.*;

interface StudentService {
    void performService();
}

class Student {
    private String rollNumber;
    private String name;
    private String branch;

    public Student(String rollNumber, String name, String branch) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public void displayInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Branch: " + branch);
    }
}

class UploadMarksService implements StudentService {
    private Student student;
    private int marks;

    public UploadMarksService(Student student, int marks) {
        this.student = student;
        this.marks = marks;
    }

    @Override
    public void performService() {
        System.out.println("Uploading marks for student:");
        student.displayInfo();
        System.out.println("Marks: " + marks);
    }
}

class UploadSyllabusService implements StudentService {
    private Student student;
    private String syllabus;

    public UploadSyllabusService(Student student, String syllabus) {
        this.student = student;
        this.syllabus = syllabus;
    }

    @Override
    public void performService() {
        System.out.println("Uploading syllabus for student:");
        student.displayInfo();
        System.out.println("Syllabus: " + syllabus);
    }
}

class UploadNotesService implements StudentService {
    private Student student;
    private String notes;

    public UploadNotesService(Student student, String notes) {
        this.student = student;
        this.notes = notes;
    }

    @Override
    public void performService() {
        System.out.println("Uploading notes for student:");
        student.displayInfo();
        System.out.println("Notes: " + notes);
    }
}

class UploadScheduleService implements StudentService {
    private Student student;
    private String schedule;

    public UploadScheduleService(Student student, String schedule) {
        this.student = student;
        this.schedule = schedule;
    }

    @Override
    public void performService() {
        System.out.println("Uploading schedule for student:");
        student.displayInfo();
        System.out.println("Schedule: " + schedule);
    }
}

public class StudentManagement {

    public static void main(String[] args) {
        Student student1 = new Student("101", "Alice", "CSE");
        Student student2 = new Student("102", "Bob", "ECE");

        StudentService uploadMarksService = new UploadMarksService(student1, 85);
        uploadMarksService.performService();

        StudentService uploadSyllabusService = new UploadSyllabusService(student2, "ECE Syllabus 2024");
        uploadSyllabusService.performService();

        StudentService uploadNotesService = new UploadNotesService(student1, "CSE Notes");
        uploadNotesService.performService();

        StudentService uploadScheduleService = new UploadScheduleService(student2, "ECE Class Schedule");
        uploadScheduleService.performService();
    }
}

