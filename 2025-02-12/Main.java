public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(123);

        Product p1 = new Product("Notebook", 3500.0);
        Product p2 = new Product("Mouse", 50.0);
        Product p3 = new Product("Teclado", 120.0);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        Tv samsung = new Tv("Samsung", 7200.0, 12);
        Stove lux = new Stove("Lux", 4200, 5);
        Refrigerator miau = new Refrigerator("Miau", 1200, 2);

        cart.addProduct(miau);
        cart.addProduct(lux);
        cart.addProduct(samsung);

        System.out.println(cart.getContents());

    }
}
