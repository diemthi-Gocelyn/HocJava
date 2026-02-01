package Bai2_TinhDongGoi;

public class LoginTest {

    static void main() {
        TinhDongGoi tinhDongGoi = new TinhDongGoi();
        tinhDongGoi.setBrowser("Edge");

        System.out.println(tinhDongGoi.getBrowser());
        System.out.println(tinhDongGoi.getUrl());
        System.out.println(tinhDongGoi.getEmail());
        System.out.println(tinhDongGoi.getPassword());
    }


}
