package com.example.ahmed.dermogo20;

/**
 * Created by Ahmed on 10/6/2017.
 */

public class disorder {

    //public condition listOfSpecificConditions[]= new condition[x];
    int [] listOfSymptomID;
    protected String nameOfDisorder;
    protected    boolean hasDisorder;
    protected int ID;
    protected int maxPossibleSymptomsAmount;
    protected int currentCheckedSymptoms=0;
    protected double chanceOfDisease=0.0;

    public disorder(String x, boolean y, int z, int maxPossibleSymptomsAmount){
        this.nameOfDisorder = x;
        this.hasDisorder =y;
        this.ID=z;
        this.maxPossibleSymptomsAmount=maxPossibleSymptomsAmount;


    }
    public String getName(){

        return this.nameOfDisorder;
    }
    public disorder(){
        this.chanceOfDisease=0;
    }

    public void calculateChance(){
        this.chanceOfDisease = (double) currentCheckedSymptoms/(double) this.maxPossibleSymptomsAmount;
        //calculate the percentage of the chance u have the disease
    }
    public double getPercentage(){
        return this.chanceOfDisease;
    }
    public void addSymptom(){
        currentCheckedSymptoms++;
    }
    public void subtractSymptom(){
        currentCheckedSymptoms--;
    }
    public void editStatus(boolean x){
        this.hasDisorder=x;
    }





}
