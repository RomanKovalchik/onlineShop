package view;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class View {
   // Scanner sc = new Scanner(System.in);


    public String[] getData() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        System.out.print("Enter customer name: ");
        String name = sc.nextLine().trim();
        System.out.print("Enter customer phone: ");
        String phone = sc.nextLine().trim();
        System.out.print("Enter product quantity, pcs.: ");
        String quantity = sc.nextLine().trim();
        System.out.print("Enter product price, USD: ");
        String price = sc.nextLine().trim();
        System.out.println("Enter category of deliverity");
        System.out.println("If you prefer shipping select 1, otherwise select 2");
        String option = sc.next();
        sc.close();
        return new String[]{name, phone, quantity, price, option};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}