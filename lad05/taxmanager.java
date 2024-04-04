package lad05;

public class taxmanager {
    private static final int MAX = 100;
    private taxpayer [] list = new taxpayer[MAX];
    private int count = 0;

    public boolean addtaxpayer (taxpayer taxpayer){
        if (count >= MAX) {
            return false;
        }
        list[count++] = taxpayer;
        return true;
    }

    public int getCount() {
        return count;
    }

    public double gettax(){
        double sum = 0;
        for (int i=0; i<count; i++){
            //method pay is polymorphic because we do not (phương thức trả lương có tính đa hình vì chúng tôi không)
            // know exact object is instance of which class (biết chính xác đối tượng là thể hiện của lớp nào)
            sum += list[i].pay();
        }
        return sum;
    }
}
