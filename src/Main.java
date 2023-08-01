
public class Main {
    public static void main(String[] args) {

        Flower flower1 = new Flower("гортензия",1,40);
        Flower flower2 = new Flower("гвоздика ",3,20);
        Flower flower3 = new Flower("орхидея",2,30);
        Flower flower4 = new Flower("ландыш",4,50);

        Flower[] flowers = new Flower []{flower1, flower2, flower3, flower4};
        Flower expensive =  Flower.flowerMethod(flowers);
        Flower fresh = Flower.flowerSvezhest(flowers);
        System.out.println("Самые дорогие цветы: " + expensive.fname+" цена: "+expensive.price);
        System.out.println("Самые свежие цветы: "+ fresh.fname+" цена: "+fresh.price);
    }
}