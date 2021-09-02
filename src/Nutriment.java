public abstract class Nutriment extends Grocery{
 double weight;
 double kcal;
 double proteins;
 double carbohydrates;
 double fats;
 double fiber;

    public Nutriment(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }
    public Nutriment update(String company, String name, Double weight, Double kcal,Double proteins, Double carbohydrates, Double fats, Double fiber){
       if (company != null){

       }
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    @Override
    public double getKcal() {
        return kcal * (weight / 100);
    }
     public double getTotalProteins(){
        return proteins * (weight / 100);
     }

     public double getTotalCarbohydrates(){
        return carbohydrates * (weight / 100);

     }

     public double getTotalFats(){
        return fats * (weight / 100);

     }

     public double getTotalFiber(){
        return fiber * (weight / 100);

     }

    @Override
    public String toString() {
        String rez = "";
        rez = "Company: " + company + "\n"
                + "Name: " + name +"\n"
                + "Weight: " + weight + "g" + "\n"
                + "Kcal: " + getKcal() + "\n"
                + "Proteins: " + ((getTotalProteins()/weight) * 100) +"%" + "\n"
                + "Carbohydrates: " + ((getTotalCarbohydrates()/weight) * 100) +"%" + "\n"
                + "Fats: " + ((getTotalFats()/weight) * 100) + "\n"
                + "Fiber: " + ((getTotalFiber()/weight) * 100) + "\n";
        return rez;
    }

    public String totalNutrientTable(){
        String rez = "";
        rez = "Company: " + company + "\n"
                + "Name: " + name +"\n"
                + "Weight: " + weight + "g" + "\n"
                + "Kcal: " + getKcal() + "\n"
                + "Proteins: " + getTotalProteins() + "\n"
                + "Carbohydrates: " + getTotalCarbohydrates() + "\n"
                + "Fats: " + getTotalFats() + "\n"
                + "Fiber: " + getTotalFiber() + "\n";
        return rez;

    }
}
