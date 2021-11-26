package homeWork;

public abstract class Fruit {
    private String kind;
    private float weight;

    public Fruit(String kind, float weight) {
        this.kind = kind;
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public float getWeight() {
        return weight;
    }
}

