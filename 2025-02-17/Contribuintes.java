import java.util.ArrayList;

public class Contribuintes {
    private ArrayList<Cliente> clientes;

    public Contribuintes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getTaxesPaidList(){
        String taxesPaidList = "";
        for (Cliente c : clientes){
            taxesPaidList += c.toString() + "\n";
        }

        return taxesPaidList;
    }

    public double getTotalTaxes(){
        double sum = 0;

        for (Cliente c : clientes){
            sum += c.returnTaxPaid();
        }

        return sum;
    }
}
