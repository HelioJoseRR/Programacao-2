import java.util.ArrayList;

public class ShoppingCart {
    private int customerID;
    private ArrayList<Product> productList;

    public ShoppingCart(int customerID){
        this.customerID = customerID;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product produto){
        this.productList.add(produto);
    }

    public void removeProduct(Product produto){
        this.productList.remove(produto);
    }

    public String getContents(){
        System.out.printf("Cart List: \n");

        String contents = "";

        for (Product p : productList){
            contents += String.format("%s%n", p.toString());
        }

        return contents;
    }

    public int getCustomerId(){
        return this.customerID;
    }

    public int getItemCount(){
        return productList.size();
    }

    public double getTotalPrice(){
        double total = 0.0;

        for (Product p : productList){
            total += p.getPrice();
        }
        return total;
    }
}
