package com.example;

import com.example.ATM.ATM;
import com.example.Stamps.Group;
import com.example.Stamps.NormalTask;
import com.example.Stamps.Signature;
import com.example.Stamps.Task;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(130);
        atm.process(127);

        Task task = new NormalTask();
        
        Signature firstSignature = new Signature(task);
        Signature secondSignature = new Signature(task);
        firstSignature.invoke();
        secondSignature.invoke();

        Group group = new Group();
        group.addSignature(firstSignature);
        group.addSignature(secondSignature);
        group.apply();
    }
}