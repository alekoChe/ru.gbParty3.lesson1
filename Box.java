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
}
