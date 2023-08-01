public class Flower {
    String fname;
    int  frechness;
    int price;

    public Flower (String fname, int frechness, int price){
        this.fname=fname;
        this.frechness=frechness;
        this.price=price;
    }
    public static Flower flowerMethod (Flower[] flowers){
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].price<flower.price){
                flower=flowers[i];
            }
        }
        return flower;
    }
    public  static Flower flowerSvezhest (Flower[] flowers){
        Flower flower = flowers[0];
        for (int i = 0; i < flowers.length; i++) {
            if (flowers[i].frechness<flower.price){
                flower=flowers[i];
            }
        }
        return flower;
    }
}
