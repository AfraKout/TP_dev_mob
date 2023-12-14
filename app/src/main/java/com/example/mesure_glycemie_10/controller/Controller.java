 package com.example.mesure_glycemie_10.controller;
import com.example.mesure_glycemie_10.model.Patient;
public class Controller {
    private static Controller instance = null;
    private static Patient patient;
    private Controller(){
        super();
    }
    public static final Controller getInstance(){
        if(Controller.instance ==null){
            Controller.instance = new Controller();
        }
        return Controller.instance;
    }
    public void createPatient(int age, float valeurMesuree, boolean isFasting){
        patient = new Patient(age, valeurMesuree, isFasting);
    }

    public String getReponse() {
        return patient.getReponse();
    }

    public static Patient getPatient() {
        return patient;
    }
}
