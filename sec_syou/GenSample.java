package sec_syou;

public class GenSample<T> {
    public T value;
    public void setValue(T val){
        this.value = val;
    }
    public T getValue(){
        return this.value;
    }

    public static void main(String[] args){
        GenSample<String> gen = new GenSample<>();
        gen.setValue("AAA");
        System.out.println(gen.getValue());

        GenSample<Integer> gen2 = new GenSample<>();
        gen2.setValue(10);
        System.out.println(gen2.getValue());

        GenSample<? extends Number> gen3;
        gen3 = gen2;
        System.out.println(gen3.getValue());
    }
}
