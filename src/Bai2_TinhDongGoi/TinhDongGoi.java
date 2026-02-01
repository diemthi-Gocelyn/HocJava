package Bai2_TinhDongGoi;

public class TinhDongGoi {

    private String browser;
    private String url="http... defaul";
    private String email="email default";
    private String password="pass default";

    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browserName){
        browserName=browserName.toLowerCase();
        browser=browserName;
    }

    public String getUrl(){
        return url;
    }
    public void setUrl(String urlName){// neu ten trung thi dung tu khoa this de phan biet trong ngoai
        url=urlName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
