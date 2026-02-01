package bai2_object.packed2;

import java.util.ArrayList;
import java.util.List;

public class PhamVITruyCap_Automation {

    //private: private String name = "Hương"; chỉ sử dụng trong nội bộ class
    //default: String name = "Hương" (không có từ khóa phía trước khai báo); trong class và trong package
    // protected: trong class và trong package & ngoài packed bởi lớp con ( tính kế thừa khóa extends thông qua hàm xây dựng )
    // public: trong class và trong package & ngoài packed

    String name = "Hương";
    String address = "HCM";
    protected String phone = "0123456";

    // hàm xây dựng trùng vs tên class
    public PhamVITruyCap_Automation(String name, String address){
        System.out.println(this.name = name);
        System.out.println(this.address = address);
    }

    // hàm xây dựng không tham số
    public PhamVITruyCap_Automation(){


        }
    protected void getCustomerList(){
        System.out.println("Get customer list");


    }
    // hàm get phone


    // hàm infor
    public void infor(String name){
        System.out.println(name);
        System.out.println(this.name);
    }
    // hàm showinfor
    public void showInfor(){
        System.out.println(name);
    }


    static void main() {
        String phone = "0123456";

        List<String> list = new ArrayList<>();

        PhamVITruyCap_Automation at = new PhamVITruyCap_Automation("Phát","HCM");
        PhamVITruyCap_Automation at2 = new PhamVITruyCap_Automation("Hồng","Hà Nội");

        System.out.println(phone);
    }

}
