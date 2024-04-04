package session2;
//Luôn viết hoa ký tự đầu tiên
//Luôn viết chữ thường
public class Student {
    //Field: Trường: Property: Thuộc tính: Attribute
    //Định nghĩa lên đối tượng
    //Chứa giá trị
    //Thường là private: Để đẩm bảo an toàn dữ liệu
    // Giá trị gán (Write) thì sử dụng là Setter
    // Giá trị đọc (Read) thì sử dụng là Getter
    private String name;
    private Integer bornYear;
    private String placeOfBirth;

    // Constructor: Hàm khởi tạo
    // sử dụng để tạo ra đối tượng có các đặc tính ban đầu
    // có thể có đối số hoặc không
    // tên trùng với tên class và ko có dữ liệu trả về
    public Student(String name, Integer bornYear, String placeOfBirth){
        //This: Đối tượng hiện tại, sử dụng trong chính class đó
        this.name = name;
        this.bornYear = bornYear;
        this.placeOfBirth = placeOfBirth;
    }
// Read
    public String getName() {
        return name;
    }
// Write
    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }
}
