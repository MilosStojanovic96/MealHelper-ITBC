import java.util.ArrayList;
import java.util.List;

public class Fridge {
    List<Nutriment> nutriments;

    public Fridge() {
        this.nutriments = new ArrayList<>();
    }

    public void add(Nutriment n) {
        boolean isFound = false;
        for (Nutriment el : nutriments) {
            if (el.equals(n)) {
                isFound = true;
                el.weight += n.weight;
                break;
            }
        }
        if (isFound) {
            nutriments.add(n);
        }
    }

    public void remove(Nutriment n) {
        for (Nutriment el : nutriments) {
            if (el.equals(n)) {
                nutriments.remove(el);
                break;
            }
        }
    }

    public void remove(Nutriment n, double weight) {
        for (Nutriment el : nutriments) {
            if (el.equals(n)) {
                el.weight -= weight;
                break;
            }
        }
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }
}
