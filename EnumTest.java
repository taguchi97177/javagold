public class EnumTest {
    public enum Fruit{
        Orange,
        Apple,
        Melon,
        Banana
    }

    public enum Fruit2{
        Orange(1),
        Apple(2),
        Melon(3),
        Banana(4);
        private int id;
        private Fruit2(int id){
            this.id = id;
        }
    }
    public static void main(String[] args){
        for(Fruit kudamono : Fruit.values()){
            System.out.println(kudamono.toString());
            System.out.println(kudamono.name());
        }
        System.out.println("***************");
        System.out.println(Fruit.valueOf("Banana").toString());
//        System.out.println(Fruit.valueOf("BananaAAA").toString());

        System.out.println("###########################");
        for(Fruit2 kudamono : Fruit2.values()){
            System.out.println(kudamono.toString());
            System.out.println(kudamono.name());
        }
        System.out.println("***************");
        System.out.println(Fruit2.valueOf("Banana").toString());
    }
}