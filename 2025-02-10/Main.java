public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(123);

        Product p1 = new Product("Notebook", 3500.0);
        Product p2 = new Product("Mouse", 50.0);
        Product p3 = new Product("Teclado", 120.0);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        System.out.println(cart.getContents());

        System.out.println("Número de itens no carrinho: " + cart.getItemCount());
        System.out.println("Valor total da compra: R$ " + cart.getTotalPrice());

        cart.removeProduct(p2);

        System.out.println("\nApós remover o Mouse:");
        System.out.println(cart.getContents());
        System.out.println("Número de itens no carrinho: " + cart.getItemCount());
        System.out.println("Valor total da compra: R$ " + cart.getTotalPrice());
    }
}
