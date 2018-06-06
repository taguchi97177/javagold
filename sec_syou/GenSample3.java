package sec_syou;

public class GenSample3<AAA,BBB,CCC> {
    public AAA value1;
    public BBB value2;
    public CCC value3;

    public void setAAA(AAA value){
        this.value1 = value;
    }
    public void setBBB(BBB value){
        this.value2 = value;
    }
    public void setCCC(CCC value){
        this.value3 = value;
    }

    public String getValue(){
        return value1 + ":" + value2 + ":" + value3;
    }

    public static void main(String[] args){

        GenSample3<Integer, Double, String> gen = new GenSample3<>();
        gen.setAAA(10);
        gen.setBBB(20.0);
        gen.setCCC("30");
        System.out.println(gen.getValue());

    }
}
