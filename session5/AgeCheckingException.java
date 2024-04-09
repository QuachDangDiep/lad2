package session5;

public class AgeCheckingException extends Exception{
    // Đây là exception do người dùng (chúng ta )tự định
    public AgeCheckingException(String message){
        super(message);
    }

    @Override
    public String getMessage() {
        return "Loi nhap tuoi sai"+super.getMessage();
    }
}
