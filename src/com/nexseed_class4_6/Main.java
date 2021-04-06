package com.nexseed_class4_6;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        GenBoys boy1 = new GenBoys();
        boy1.bname = "Rodrigo";
        GenBoys boy2 = new GenBoys();
        boy2.bname = "Alan";
        GenBoys boy3 = new GenBoys();
        boy3.bname = "Chiz";
        GenGirls girl1 = new GenGirls();
        girl1.gname = "Heart";
        GenGirls girl2 = new GenGirls();
        girl2.gname = "Maria";
        GenGirls girl3 = new GenGirls();
        girl3.gname = "Ellen";
        GenRelationship relation1 = new GenRelationship();
        relation1.relationship = " is a son of ";
        GenRelationship relation2 = new GenRelationship();
        relation2.relationship = " a sibling of ";
        GenRelationship relation3 = new GenRelationship();
        relation3.relationship = " friends with ";

        GenBoys[] boys = {boy1, boy2, boy3};
        GenGirls[] girls = {girl1, girl2, girl3};
        GenRelationship[] rltn = {relation1, relation2, relation3};

        int count =0;
        while (count<3) {
            System.out.println(boys[random()].bname + rltn[random()].relationship + girls[random()].gname);
            count++;
        }
    }
    public static int random(){
        Random ran = new Random();
        return ran.nextInt(3);
    }
}
