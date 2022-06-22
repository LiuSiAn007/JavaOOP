package aleri.test;

import aleri.entity.Student;


public class StudentDomainTest {
    public static void main(String[] args) {
        Student student = new Student("zhangsan", 18, "male", "4396");
        System.out.println(student);
    }
}
