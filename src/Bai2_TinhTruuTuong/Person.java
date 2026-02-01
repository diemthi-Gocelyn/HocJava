package Bai2_TinhTruuTuong;

abstract class Person {
    public String name ="Anh Tester";

    public String getName(){
        return name;
    }

    abstract public void getInfor();
    abstract public void clickElement();
    abstract public void setText();

}
