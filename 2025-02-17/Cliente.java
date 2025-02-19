public abstract class Cliente {
    private String name;
    private double anualIncome;
    private char typeOfClient;

    public Cliente(String name, double anualIncome, char typeOfClient) {
        this.name = name;
        this.anualIncome = anualIncome;
        this.typeOfClient = typeOfClient;
    }

    public char getTypeOfClient() {
        return typeOfClient;
    }

    public void setTypeOfClient(char typeOfClient) {
        this.typeOfClient = typeOfClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnualIncome() {
        return anualIncome;
    }

    public void setAnualIncome(double anualIncome) {
        this.anualIncome = anualIncome;
    }

    public abstract double tax();

    public double returnTaxPaid(){
        return this.tax();
    }

    @Override
    public String toString() {
        return this.getName()
                + ": $ "
                + String.format("%.2f", this.returnTaxPaid());
    }
}
