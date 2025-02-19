public class Company extends Cliente{
    private int numberOfEmployees;

    public Company(String name, double anualIncome, char typeOfClient, int numberOfEmployees) {
        super(name, anualIncome, typeOfClient);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double tax(){
        double tax = 0;

        if (this.getNumberOfEmployees() <= 10){
            tax = this.getAnualIncome() * 0.16;
        }

        if (this.getNumberOfEmployees() > 10){
            tax = this.getAnualIncome() * 0.14;
        }

        return tax;
    }
}
