import java.util.ArrayList;

public class Cart {
	private ArrayList<CartItem> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }

    public void printCart() {
        double totalPrice = 0;
        for (CartItem item : items) {
            System.out.println(item);
         // ???   totalPrice += item.getTotalPrice();
        }
        System.out.println("Total Price: " + totalPrice);
    }

}
