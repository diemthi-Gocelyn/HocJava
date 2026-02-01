package Bai2_TinhKeThua;

public class Person {
    public String name;
    public int age;
    public float height;

    public Person(String a, int b, float c){
        this.name=a;
        this.age = b;
        this.height =c;

    }
    public void getInfor(){
        System.out.println("Name:"+this.name);
        System.out.println("Age:"+this.age);
        System.out.println("Height:"+this.height);
    }

}
