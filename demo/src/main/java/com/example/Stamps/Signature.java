package com.example.Stamps;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Signature {
    private final Task task;
    private String groupId;

    public Signature(Task task) {
        this.task = task;
        this.groupId = "";
    }
    public void invoke() {
        task.execute();
        if (groupId.isEmpty()) {
            System.out.println("This singature is not part of any group");
            return;
        }
        System.out.println("Group id = " + groupId);
    }
    public void accept(Visitor visitor) {
        visitor.visitSignature(this);
    }
}