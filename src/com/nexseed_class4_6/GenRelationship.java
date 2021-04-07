package com.nexseed_class4_6;

public class GenRelationship {
    String relationship;
    private String relationship1;
    protected String relation;

    GenRelationship(){

        this.relationship=" is happy with ";
        relationship1=" is happy with ";
        relation = " igsoon ni ";
    }
    GenRelationship(String relationship){

        this.relationship=relationship;
    }
    public void setRelationship(String nrelationship){
        relationship1=nrelationship;
    }

    public String getRelationship() {
        return relationship1;
    }
}
