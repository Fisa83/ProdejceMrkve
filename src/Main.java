import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Seller seller1 = new Seller(LocalDate.of(1995, 2, 15),"Neo Anderson", 475, 65.3, false);
        Seller seller2 = new Seller(LocalDate.of(1987, 9, 23),"Agent Smith", 666, 121.5, true);

        System.out.println("First sellers name is "+ seller1.getName() + ".");
        System.out.println("Second sellers name is "+ seller2.getName() + ".");

    }
}