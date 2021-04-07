package com.nexseed_class4_6;

public class GenGirls {
    String gname;
    private String gsurname;
    protected String gmidname;

    GenGirls(){
        this.gname="Marimar";
        gsurname="Soriano";
        gmidname="Inocentes";
    }
    GenGirls(String name){
        this.gname=name;
    }
    public void setGsurname(String nsurname){
        gsurname = nsurname;
    }

    public String getGsurname() {
        return gsurname;
    }
}
