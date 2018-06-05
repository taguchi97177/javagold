public class Rei7 {
    public static void main(String[] args){
        Product p1 = new Product(1,"ABC");
        Product p2 = new Product(1, "ABC");
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
    }
}
