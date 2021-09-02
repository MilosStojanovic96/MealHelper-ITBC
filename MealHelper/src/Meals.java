import java.util.ArrayList;
import java.util.List;

public class Meals {
    List<Meal> meals;

    public List<Meal> getMeals() {
        return meals;
    }

    public void add (Meal m) {
        boolean isFound = false;
        for (Meal el : meals){
            if(el.equals(m)){
                isFound = true;
                break;
            }
        }
        if(isFound){
            meals.add(m);
        }
    }

    public void remove (Meal m) {
        for (Meal el : meals){
            if(el.equals(m)){
                meals.remove(el);
                break;
            }
        }
    }

    public List<Meal> search (String s){
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals){
            if(el.name.contains(s)){
                list.add(el);
            }
        }
        return  list;
    }

    public List<Meal> search(List<Nutriment>nutriment){
        List<Meal> list = new ArrayList<>();
        for (Meal el : meals){
            if(el.contains(nutriment)){
                list.add(el);
            }
        }
        return  list;
    }

}
