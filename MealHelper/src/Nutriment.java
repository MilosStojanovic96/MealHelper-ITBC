public abstract class Nutriment extends Grocery {
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

    public void update(String company, String name, Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        if (company != null) {
            this.company = company;
        }
        if (name != null) {
            this.name = name;
        }
        if (weight != null) {
            this.weight = weight;
        }
        if (kcal != null) {
            this.kcal = kcal;
        }
        if (proteins != null) {
            this.proteins = proteins;
        }
        if (carbohydrates != null) {
            this.carbohydrates = carbohydrates;
        }
        if (fats != null) {
            this.fats = fats;
        }
        if (fiber != null) {
            this.fiber = fiber;
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

    public double getTotalProteins() {
        return proteins * (weight / 100);
    }

    public double getTotalCarbohydrates() {
        return carbohydrates * (weight / 100);

    }

    public double getTotalFats() {
        return fats * (weight / 100);

    }

    public double getTotalFiber() {
        return fiber * (weight / 100);

    }

    @Override
    public String toString() {
        String rez = "";
        rez = "\t" + "Company: " + company + "\n"
                + "\t" + "Name: " + name + "\n"
                + "\t" + "Weight: " + 100 + "g" + "\n"
                + "\t" + "Kcal: " + kcal + "\n"
                + "\t"  + "Proteins: " + proteins + "%" + "\n"
                + "\t" + "Carbohydrates: " + carbohydrates + "%" + "\n"
                + "\t"  + "Fats: " + fats + "%" + "\n"
                + "\t"  + "Fiber: " + fiber + "%" + "\n"+ "\n";
        return rez;
    }

    public String totalNutrientTable() {
        String rez = "";
        rez =  "\t" + "Company: " + company + "\n"
                + "\t" + "Name: " + name + "\n"
                + "\t" + "Weight: " + weight + "g" + "\n"
                + "\t" + "Kcal: " + getKcal() + "\n"
                + "\t" + "Proteins: " + getTotalProteins() + "\n"
                + "\t" + "Carbohydrates: " + getTotalCarbohydrates() + "\n"
                + "\t" + "Fats: " + getTotalFats() + "\n"
                + "\t" + "Fiber: " + getTotalFiber() + "\n" + "\n";
        return rez;

    }


}
