public class ShoppingCartFixed {
public static void main(String\[] args) {
try {
int quantity - Integer.parseInt ("abc");
double price = 100.0;
double total = quantity \* price;
System. out.printin("Total: " + total);
) catch (NumberFormatException e) {
System. out.printIn(" Invalid quantity entered. Please enter a number.");
System. out.printin(" Using default quantity: 1");
double total = 100.0; // Fallback value
System. out.printin("Total: " + total);
}
System. out.printIn(" Checkout completed successfully.");
 }
}
 