package session4;

public interface CanMove {
    // cac phuong thuc trong interface deu la: abstract va public
    public abstract void run();
    // Ngay cả khi ko khai báo là abstract và public thì nó luôn mặc định là như vậy
    void back();
}
