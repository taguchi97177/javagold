public class MutableClass {
    private int x;
    private int[] array = {1,2,3,4};

    public MutableClass(int x){
        this.x = x;
    }
    public void setX(int x){
        this.x = x;
    }
    public MutableClass getInstance(){
        return this;
    }
}
