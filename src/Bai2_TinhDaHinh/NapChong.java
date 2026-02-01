package Bai2_TinhDaHinh;

public class NapChong {
    public void clickElement(){
        System.out.println("Click element");
    }
    public void clickElement(String elementName){
        System.out.println("Click element+elementName");
    }
    public void clickElement(String elementName,int timeout){
        System.out.println("Click element+elementName+ timout");
    }
    public void clickElement(String elementName,double timeout){
        System.out.println("Click element+elementName+ timoutdouble");
    }

    static void main() {
        NapChong napchong =new NapChong();
        napchong.clickElement("Login Button");
        napchong.clickElement("Login Button",30);
        napchong.clickElement("Login Button",30F);
    }
}
