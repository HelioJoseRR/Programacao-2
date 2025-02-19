public class Individual extends Cliente{
    private double healthExpenditures;

    public Individual(String name, double anualIncome, char typeOfClient, double healthExpenditures) {
        super(name, anualIncome, typeOfClient);
        this.healthExpenditures = healthExpenditures;
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public double tax(){
        double tax = 0;

        if (this.getAnualIncome() < 20000){
            tax = this.getAnualIncome() * 0.15;
        }

        if (this.getAnualIncome() >= 20000) {
            tax = this.getAnualIncome() * 0.25;
        }

        if (this.getHealthExpenditures() > 0){
            tax = tax - (this.getHealthExpenditures() * 0.5);
        }

        return tax;
    }
}
