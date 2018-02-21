package com.example.ahmed.dermogo20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class detectorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detector);


    }


    ArrayList<disorder> analyzedDisorderList = new ArrayList<disorder>();
    public void analyzeData(View view) {
        analyzedDisorderList.add(listOfDisorders.eczema);
        analyzedDisorderList.add(listOfDisorders.acne);
        analyzedDisorderList.add(listOfDisorders.sunBurn);
        analyzedDisorderList.add(listOfDisorders.rosacea);
        for (int i = 0; i < analyzedDisorderList.size(); i++) {
            analyzedDisorderList.get(i).calculateChance();
        }
//WHAT IF ALL IS 0
        for (int i = 0; i < analyzedDisorderList.size(); i++) {
            if (analyzedDisorderList.get(i).getPercentage() == 0) {
                analyzedDisorderList.remove(i);
            }
        }
        disorder temp = new disorder();

        ArrayList<disorder> orderedDisorders = new ArrayList<disorder>();

        for (int i = 0; i < analyzedDisorderList.size(); i++) {

            for (int k = 0; k < analyzedDisorderList.size(); k++) {
                if (analyzedDisorderList.get(k).getPercentage() > temp.getPercentage()) {
                    temp = analyzedDisorderList.get(k);
                }
            }
            orderedDisorders.add(temp);
            analyzedDisorderList.remove(orderedDisorders.get(orderedDisorders.size() - 1));
            temp=new disorder();

        }


        for (int i = 0; i < orderedDisorders.size(); i++) {
            Log.i(orderedDisorders.get(i).getName(), Double.toString(orderedDisorders.get(i).getPercentage()));

        }
//listOfStatus.finalCalculatedList=orderedDisorders;
   //     Intent intent= new Intent(this,calculation.class);
   //     startActivity(intent);
    }
/*
POSSIBLE ALGRITHIM USING ARRAYS

    public disorder[] analyzedDisorderArray;
    public void analyzeData1(View view) {
        analyzedDisorderArray = new disorder[3];
        analyzedDisorderArray[0] = listOfDisorders.eczema;
        analyzedDisorderArray[1] = listOfDisorders.acne;
        analyzedDisorderArray[2] = listOfDisorders.sunBurn;
        for (int i = 0; i < analyzedDisorderArray.length; i++) {
            analyzedDisorderArray[i].calculateChance();
        }

        disorder temp = new disorder();
        int n = analyzedDisorderArray.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - 1); j++) {
                if (analyzedDisorderArray[j - 1].getPercentage() < analyzedDisorderArray[j].getPercentage()) {
                    temp = analyzedDisorderArray[j - 1];
                    analyzedDisorderArray[j - 1] = analyzedDisorderArray[j];
                    analyzedDisorderArray[j] = temp;
                }
            }

        }

//check greatest that isn't 0, put it in arraylist, check greatest that is not
        for (int i = 0; i < analyzedDisorderArray.length; i++) {
            Log.i(analyzedDisorderArray[i].getName(), Double.toString(analyzedDisorderArray[i].getPercentage()));

        }


    }
*/













public void goToCalculations(View view){
    Intent intent= new Intent(this,calculation.class);
    startActivity(intent);

}


    public void wartsBumpClick(View view) {
        CheckBox checkBox = (CheckBox) view;

        if (checkBox.isChecked()) {
            listOfDisorders.warts.addSymptom();
        } else {
            listOfDisorders.warts.subtractSymptom();

        }
    }
    public void wartsDarkDotClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.warts.addSymptom();
        } else {
            listOfDisorders.warts.subtractSymptom();

        }
    }
    public void wartsSharingRazorClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.warts.addSymptom();
        } else {
            listOfDisorders.warts.subtractSymptom();

        }
    }
    public void wartsSharingTowelsClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.warts.addSymptom();
        } else {
            listOfDisorders.warts.subtractSymptom();

        }
    }
    public void wartsTimyBloodVesselClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.warts.addSymptom();
        } else {
            listOfDisorders.warts.subtractSymptom();

        }
    }

























    public void hivesInsectStingClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.hives.addSymptom();
        } else {
            listOfDisorders.hives.subtractSymptom();

        }
    }


    public void hivesPaleRedBumpsImageClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.hives.addSymptom();
        } else {
            listOfDisorders.hives.subtractSymptom();

        }
    }

















    public void rosaceaEyeIrritationImageClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.rosacea.addSymptom();
        } else {
            listOfDisorders.rosacea.subtractSymptom();

        }
    }


    public void rosaceaFlushingClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.rosacea.addSymptom();
        } else {
            listOfDisorders.rosacea.subtractSymptom();

        }
    }


    public void rosaceaPlaqueClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.rosacea.addSymptom();
        } else {
            listOfDisorders.rosacea.subtractSymptom();

        }
    }


    public void rosaceaVisibleBloodVesselsClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.rosacea.addSymptom();
        } else {
            listOfDisorders.rosacea.subtractSymptom();

        }
    }


    public void rosaceaBumpsAndPimplesClick(View view) {
        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.rosacea.addSymptom();
        } else {
            listOfDisorders.rosacea.subtractSymptom();

        }
    }


    public void eczemaItcheClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.eczema.addSymptom();
            listOfDisorders.hives.addSymptom();
        } else {
            listOfDisorders.eczema.subtractSymptom();
            listOfDisorders.hives.subtractSymptom();

        }
    }


    public void eczemaDryAndScalySkinClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.eczema.addSymptom();
        } else {
            listOfDisorders.eczema.subtractSymptom();

        }
    }


    public void eczemaOnFeetClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.eczema.addSymptom();
        } else {
            listOfDisorders.eczema.subtractSymptom();

        }
    }

    public void eczemaRashOnFaceClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.eczema.addSymptom();
        } else {
            listOfDisorders.eczema.subtractSymptom();

        }
    }

    public void eczmaRashOnKneesClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.eczema.addSymptom();
        } else {
            listOfDisorders.eczema.subtractSymptom();

        }
    }


    public void acneBlackHeadClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void acneCystClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void acnePapulesClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void acnePimpleClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void acneRedSpotsClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void acneWhiteHeadsClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.acne.addSymptom();
        } else {
            listOfDisorders.acne.subtractSymptom();

        }
    }


    public void headacheClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.sunBurn.addSymptom();
        } else {
            listOfDisorders.sunBurn.subtractSymptom();

        }
    }

    public void sunBurnBlistersClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.sunBurn.addSymptom();

        } else {
            listOfDisorders.sunBurn.subtractSymptom();

        }
    }

    public void sunBurnSkinPeelingClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.sunBurn.addSymptom();

        } else {
            listOfDisorders.sunBurn.subtractSymptom();

        }
    }

    public void sunBurnVisibleMarksClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.sunBurn.addSymptom();
            listOfDisorders.rosacea.addSymptom();

        } else {
            listOfDisorders.sunBurn.subtractSymptom();
            listOfDisorders.rosacea.subtractSymptom();

        }
    }

    public void tanningClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.sunBurn.addSymptom();
            listOfDisorders.hives.addSymptom();

        } else {
            listOfDisorders.sunBurn.subtractSymptom();
            listOfDisorders.hives.subtractSymptom();

        }
    }



    public void swellingClick(View view) {

        CheckBox checkBox = (CheckBox) view;
        if (checkBox.isChecked()) {
            listOfDisorders.hives.addSymptom();

        } else {
            listOfDisorders.hives.subtractSymptom();

        }
    }



}
