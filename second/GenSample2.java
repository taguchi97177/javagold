package second;

public class GenSample2<T extends Number> {
    public T value;
    public void setValue(T val){
        this.value = val;
    }
    public T getValue(){
        return this.value;
    }

    public static void main(String[] args){
/*
        GenSample2<String> gen = new GenSample2();
        gen.setValue("AAA");
        System.out.println(gen.getValue());
*/
        GenSample2<Double> gen = new GenSample2();
        gen.setValue(10.0);
        System.out.println(gen.getValue());

        GenSample2<Integer> gen2 = new GenSample2();
        gen2.setValue(10);
        System.out.println(gen2.getValue());


    }
}
