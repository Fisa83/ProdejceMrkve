import java.time.LocalDate;

public class Seller {
    private String name;
    private LocalDate birthDate;
    private int numberOfTransactions;
    private double tonsOfCarrotSold;
    private boolean isSeniorSeller;

    public Seller(LocalDate birthDate, String name, int numberOfTransactions, double tonsOfCarrotSold, boolean isSeniorSeller) {
        this.birthDate = birthDate;
        this.name = name;
        this.numberOfTransactions = numberOfTransactions;
        this.tonsOfCarrotSold = tonsOfCarrotSold;
        this.isSeniorSeller = isSeniorSeller;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }

    public void setNumberOfTransactions(int numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    public double getTonsOfCarrotSold() {
        return tonsOfCarrotSold;
    }

    public void setTonsOfCarrotSold(double tonsOfCarrotSold) {
        this.tonsOfCarrotSold = tonsOfCarrotSold;
    }

    public boolean isSeniorSeller() {
        return isSeniorSeller;
    }

    public void setSeniorSeller(boolean seniorSeller) {
        isSeniorSeller = seniorSeller;
    }

}
