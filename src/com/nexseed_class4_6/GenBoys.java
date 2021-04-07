package com.nexseed_class4_6;

public class GenBoys {
    String bname;
    private String bsurname;
    protected String bmidname;

    GenBoys(){

        this.bname="Mario";
        bsurname="Maurer";
        bmidname="Jaguar";
    }
    GenBoys(String bname){
        this.bname=bname;
    }

    public void setBsurname(String bsurname) {
        this.bsurname = bsurname;
    }

    public String getBsurname() {
        return bsurname;
    }
}
