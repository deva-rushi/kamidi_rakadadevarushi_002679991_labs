/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author rakadadevarushikamidi
 */
public class VitalsHistory {
    private ArrayList<Vitals> vitalsHistory;

    public VitalsHistory() {
        this.vitalsHistory = new ArrayList<>();
    }

    public ArrayList<Vitals> getVitalsHistory() {
        return vitalsHistory;
    }

    public void setVitalsHistory(ArrayList<Vitals> vitalsHistory) {
        this.vitalsHistory = vitalsHistory;
    }
    
    public Vitals getNewVitals(){
        var vitals = new Vitals();
        vitalsHistory.add(vitals);
        return vitals;
    }
    
    public void deleteVitals(Vitals vitals){
        vitalsHistory.remove(vitals);
    }
    
}
