package bai2_object.packed1;

import bai2_object.packed2.PhamVITruyCap_Automation;

// dùng extends để kế thừ proteced bên PhamVITruyCap_Automation
public class Playwright extends PhamVITruyCap_Automation{
// khóa super từ khóa lớp cha super.phone
    // gọi dùng thăng chứ không cần thông qua
    public void getInforAutomation(){
        System.out.println(phone);
        getCustomerList();
        infor("Name");
        showInfor();


    }
    static void main() {
        PhamVITruyCap_Automation automation = new PhamVITruyCap_Automation("An","Lành");
        Playwright pl = new Playwright();
        pl.getInforAutomation();

    }
}
