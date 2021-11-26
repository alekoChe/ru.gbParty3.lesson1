package homeWork;
/** b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
*/

 import java.util.ArrayList;
import java.util.List;

public class Box <T extends Fruit> {  //<T>, <T extends Fruit>

    private int volume;
    protected final List<T> cargo;

    public Box(int volume) {
        this.volume = volume;
        this.cargo = new ArrayList<>();
    }

    public  void loading(T fruit) { // List<T> cargo
        cargo.add(fruit);
        System.out.println("В коробку положили " + fruit.getClass().getName());
    }
    public float getWeight() {
        /** Сделать метод getWeight(), который высчитывает вес коробки,
         * зная вес одного фрукта и их количество: вес яблока – 1.0f,
         * апельсина – 1.5f (единицы измерения не важны);
         */
        float weight = 0.0f;
        for (T item : this.cargo) {
            weight += item.getWeight();
        }
        return weight;
    }
    public boolean compare(Box box) {
        return Math.abs(getWeight() - box.getWeight()) < 0.001;
    }
    public void pouringFruitFromOneBoxToAnother(Box<T> fromBox, Box<T> intoBox) { // intoBox
        for (T fruit : fromBox.cargo) {
            intoBox.cargo.add(fruit);
        }
        fromBox.cargo.clear();
    }
}
