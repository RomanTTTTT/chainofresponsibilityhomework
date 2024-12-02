package com.example.ATM;
import lombok.Getter;
import lombok.Setter;
@Getter @Setter
public class Banknote {
    private Banknote nextItem;
    private int BanknoteNominale;
    public Banknote(int BanknoteNominale) {
        this.BanknoteNominale = BanknoteNominale;
    }
    public Banknote(Banknote next, int BanknoteNominale) {
        this.nextItem = next;
        this.BanknoteNominale = BanknoteNominale;
    }
    public void process(int amount) {
        int quantity = amount / BanknoteNominale;
        
        if (nextItem != null) {
            nextItem.process(amount % BanknoteNominale);
        } else {
            if (amount % BanknoteNominale != 0) {
                throw new IllegalArgumentException();
            }
        }
        if (quantity != 0) {
        System.out.format("Please receive %d x %d", quantity, BanknoteNominale);}
    }
}
