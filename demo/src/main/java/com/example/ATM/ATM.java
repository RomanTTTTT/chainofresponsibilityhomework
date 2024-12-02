package com.example.ATM;

import lombok.Getter;

@Getter
public class ATM {
    private final Banknote first;
    private int budget;
    public ATM(int budget) {
        this.budget = budget;
        first = new Banknote(100);
        Banknote second = new Banknote(50);
        Banknote third = new Banknote(1);
        first.setNextItem(second);
        second.setNextItem(third);
    }
    public void process(int amount) {
        if (amount > budget) {
            throw new IllegalArgumentException("ATM doesn't have enough money :(");
        }
        first.process(amount);
        budget -= amount;
    }
}