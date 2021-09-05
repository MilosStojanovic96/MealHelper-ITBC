import java.util.ArrayList;
import java.util.List;

public class Meals {
    List<Meal> meals;

    public Meals() {
        this.meals = new ArrayList<>();
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public void add(Meal m) {
        boolean isFound = false;
        for (Meal el : meals) {
            if (el.equals(m)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            meals.add(m);
        }
    }

    public void remove(Meal m) {
        for (Meal el : meals) {
            if (el.equals(m)) {
                meals.remove(el);
                break;
            }
        }
    }

    public List<Meal> search(String s) {
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals) {
            if (el.name.contains(s)) {
                list.add(el);
            }
        }
        return list;
    }

    public List<Meal> search(List<Nutriment> nutriment) {
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals) {
            if (el.nutriments.contains(nutriment)) {
                list.add(el);
            }
        }
        return list;
    }

    public List<Meal> search(double kcal) {
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals) {
            if (el.getKcal() < kcal) {
                list.add(el);
            }
        }
        return list;
    }

    @Override
    public String toString() {
        String rez = "";
        for (Meal el : meals) {
            rez += el.id + " | Name: " + el.name + "\n";
        }
        return rez;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Meal x = (Meal) obj;
        for (Meal el : meals) {
            if (el.getId().equals(x.getId())) {
                return true;
            }
        }
        return false;
    }
}
