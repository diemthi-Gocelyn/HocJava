package Bai2_TinhTruuTuong;

public class SinhVien extends Person {
    @Override
    public void getInfor(){
        System.out.println("Getinfor trong Class SinhVIen");
    }

    @Override
    public void clickElement() {
        System.out.println("Lam noi dung ham click element");
    }

    @Override
    public void setText() {
        System.out.println("Lam noi dung ham set text");
    }

    static void main() {
        SinhVien sinhVien = new SinhVien();
        sinhVien.getInfor();
        System.out.println(sinhVien.getName());
        System.out.println(sinhVien.name);
        sinhVien.clickElement();
        sinhVien.setText();

    }

}
