import javax.swing.JOptionPane;

public class Sales {
    public static void main(String[] args) {
        String Item, Quantity2;
        double SaleTax, Price, TotalPrice, Discount;
        int Quantity;



        Quantity = Integer.parseInt(JOptionPane.showInputDialog ("how much do you want"));
        Price = Integer.parseInt(JOptionPane.showInputDialog("how much is for 1"));
        Item = JOptionPane.showInputDialog("what are you buying");



        TotalPrice = Quantity * Price;
        Discount = Quantity * 0.50;
        SaleTax =  TotalPrice / 0.08;


      System.out.println("Total: " + TotalPrice);
        System.out.println ( "Tax:" + SaleTax);
        System.out.println ( "Discount: " + Discount);

        System.exit(0);

    }

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
}
