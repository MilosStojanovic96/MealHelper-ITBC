import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Nutriment n1 = new Nutriment("Dynazzy" , "Cleaner - Lime  Away" , 78.25 , 770.09 , 18.23 , 10.04 , 7.74 , 6.3){};
        Nutriment n2 = new Nutriment("Aivee" , "Shiratamako  -  Rice  Flour" , 492.31 , 490.32 , 16.48 , 19.15 , 23.68 , 3.34){};
        Nutriment n3 = new Nutriment("Camimbo" , "Soup  -  Campbells  Mushroom" , 427.68 , 578.32 , 9.02 , 8.88 , 19.25 , 24.91){};
        Nutriment n4 = new Nutriment("Vinder" , "Tart  Shells  -  Barquettes,  Savory" , 73.54 , 495.52 , 6.62 , 21.45 , 13.24 , 18.82 ){};
        Nutriment n5 = new Nutriment( "Thoughtbeat" , "Lamb  -  Sausage  Casings" , 552.21 , 1448.35 , 3.31 , 9.06 , 18.95 , 21.31 ){};
        Nutriment n6 = new Nutriment("Skaboo" , "Plasticspoonblack" , 880.37 , 849.41 , 13.29 , 22.78 , 2.31 , 22.23){};
        Nutriment n7 = new Nutriment("Topicblab" , "Coffee  Guatemala  Dark" , 824.7 , 563.19 , 1.39 , 14.41 , 24.72 , 13.01 ){};
        Nutriment n8 = new Nutriment( "Ailane" , "Goat  -  Leg" , 57.3 , 829.47 , 4.04 , 24.75 , 14.02 , 22.18 ){};
        Nutriment n9 = new Nutriment(  "Zoomzone" , "Wine  -  Kwv  Chenin  Blanc  South" , 659.8 , 726.16 , 14.5 , 16.52 , 21.58 , 15.95 ){};
        Nutriment n10 = new Nutriment( "Edgewire" , "Bread  -  Wheat  Baguette" , 758.41 , 312.07 , 18.66 , 6.48 , 11.99 , 4.16 ){};
        Nutriment n11 = new Nutriment("Janyx" , "Soup  -  Beef  Conomme,  Dry" , 377.33 , 1412.19 , 7.4 , 19.07 , 2.0 , 13.58 ){};
        Nutriment n12 = new Nutriment("Gigaclub" , "Bread  Base  -  Toscano" , 570.76 , 1364.35 , 19.75 , 23.34 , 14.0 , 22.06 ){};

        ArrayList<Nutriment> nutriments1 = new ArrayList<>();
        ArrayList<Nutriment> nutriments2 = new ArrayList<>();

        nutriments1.add(n1);
        nutriments1.add(n2);
        nutriments1.add(n3);
        nutriments1.add(n4);
        nutriments1.add(n5);
        nutriments1.add(n6);
        nutriments2.add(n7);
        nutriments2.add(n8);
        nutriments2.add(n9);
        nutriments2.add(n10);
        nutriments2.add(n11);
        nutriments2.add(n12);

        Meal m1 = new Meal(nutriments1, "Beans");
        Meal m2 = new Meal(nutriments2, "Peas");
        Meals a = new Meals();
        a.add(m1);
        a.add(m2);



        Fridge f = new Fridge();
        f.add(n1);
        f.add(n2);
        f.add(n3);
        f.add(n4);
        f.add(n5);
        f.add(n6);
        f.add(n7);
        f.add(n8);
        f.add(n9);
        f.add(n10);
        f.add(n11);
        f.add(n12);

        f.remove(n9);
        f.remove(n6, 64.5);
        System.out.println(f);


        System.out.println( a.getMeals());
        System.out.println(a.toString());
        System.out.println(a.search("Beans"));
        System.out.println( a.search(nutriments2));
        System.out.println(a.search(56.1));










    }

}
