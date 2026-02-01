package Bai2_TinhTruuTuong;

public interface Information {
    void click(String locator);
    void enterText(String locator, String text);
    String getText(String locator);
}
