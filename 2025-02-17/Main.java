import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of tax payers: ");
        int numberTaxPayers = sc.nextInt();
        ArrayList<Cliente> clientes = new ArrayList<>();

        for (int i = 0; i < numberTaxPayers; i++){
            System.out.println("individual or company (i/c)?");
            char typeOfClient = sc.next().charAt(0);
            sc.nextLine();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Anual income: ");
            double anualIconme = sc.nextDouble();

            if (typeOfClient == 'i'){
                System.out.println("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                Individual indiv = new Individual(name, anualIconme, typeOfClient, healthExpenditures);
                clientes.add(indiv);
            }

            if (typeOfClient == 'c'){
                System.out.println("Number of Employees: ");
                int numberOfEmployees = sc.nextInt();
                Company comp = new Company(name, anualIconme, typeOfClient, numberOfEmployees);
                clientes.add(comp);
            }
        }

        Contribuintes cont = new Contribuintes(clientes);

        System.out.println("TAXES PAID:");
        System.out.println(cont.getTaxesPaidList());
        System.out.print("TOTAL TAXES: $ ");
        System.out.print(cont.getTotalTaxes());

    }
}