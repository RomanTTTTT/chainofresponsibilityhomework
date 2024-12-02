package com.example.Stamps;

public class GroupVisitor implements Visitor {
    private final String groupId;

    public GroupVisitor(String groupId) {
        this.groupId = groupId;
    }
    @Override
    public void visitSignature(Signature signature) {
        signature.setGroupId(groupId);
    }
}
