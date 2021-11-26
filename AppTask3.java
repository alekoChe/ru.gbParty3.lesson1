package homeWork;

public class AppTask3 {
    public static void main(String[] args) {
        Apple apple1 = new Apple("GrannySmith", 0.12f);
        Apple apple2 = new Apple("GrannySmith", 0.11f);
        Apple apple3 = new Apple("GrannySmith", 0.09f);
        Apple apple4 = new Apple("GrannySmith", 0.11f);
        Apple apple5 = new Apple("GrannySmith", 0.10f);
        Apple apple6 = new Apple("GrannySmith", 0.13f);

        Orange orange1 = new Orange("Marocco", 0.17f);
        Orange orange2 = new Orange("Marocco", 0.15f);
        Orange orange3 = new Orange("Marocco", 0.16f);
        //Orange orange4 = new Orange("Marocco", 0.16f);
        Box<Apple>  box1 = new Box(10);
        Box<Apple>  box11 = new Box(10);
        Box<Orange> box2 = new Box(10);

        box1.loading(apple1);
        box1.loading(apple2);
        box1.loading(apple3);

        box11.loading(apple1);
        box11.loading(apple2);
        box11.loading(apple3);
        System.out.println(box1.cargo);
        System.out.println(box1.getWeight(box1));

        box2.loading(orange1);
        box2.loading(orange2);
        box2.loading(orange3);
        System.out.println(box2.cargo);
        System.out.println(box2.getWeight(box2));
        //System.out.println(box1.compare(box1, box2));
        System.out.println(box1.compare(box2));
        System.out.println(box1.compare(box11));

        Box<Apple>  box3 = new Box(10);
        box3.loading(apple4);
        box3.loading(apple5);
        box3.loading(apple6);
        System.out.println(box3.getWeight(box3));
        box3.pouringFruitFromOneBoxToAnother(box1, box3);
        System.out.println(box3.getWeight(box3));
        System.out.println(box1.getWeight(box1));
    }
}
