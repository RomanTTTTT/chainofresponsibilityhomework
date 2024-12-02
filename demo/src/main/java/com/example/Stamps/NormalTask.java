package com.example.Stamps;

public class NormalTask implements Task{
    @Override
    public void execute() {
        System.out.println("Normal Task was executed");
    }
}
