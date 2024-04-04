package lad05;

public abstract class taxpayer {
    private String id;
    public String getId(){
        return id;
    }
    public abstract double pay();
}
