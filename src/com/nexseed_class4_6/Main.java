package com.nexseed_class4_6;

public class Main {

    public static void main(String[] args) {

        GenBoys boys = new GenBoys();
        boys.bname = "Juan";
        GenGirls girls = new GenGirls();
        girls.gname = "Maria";
        GenRelationship relation = new GenRelationship();
        relation.relationship = " is a son of ";
        System.out.println(boys.bname + relation.relationship + girls.gname);
    }
}
