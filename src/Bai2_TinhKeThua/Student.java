package Bai2_TinhKeThua;

public class Student extends Person{
    public Student(String name,int age,float height){
        super(name,age,height);
    }

    static void main() {
        Student student = new Student("Huong",18,165F);
        student.getInfor();
        System.out.println("Truy xuaats biens name:"+ student.name);
    }
}
