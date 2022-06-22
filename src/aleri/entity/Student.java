package aleri.entity;

public class Student {
    private String name;

    private int age;

    private String sex;

    private String idNo;

    public Student() {
    }

    public Student(String name, int age, String sex, String idNo) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.idNo = idNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", idNo='" + idNo + '\'' +
                '}';
    }
}
