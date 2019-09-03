/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalrecords;

/**
 * Patient, creates Patient objects containing various Patient details.
 * @author Matthew Dods 420190038 
 */
public class Patient {
   private String PatientID;
   private String Name;
   private String CheckIn;
   private String AssignedP;
   
    public Patient (String PatientID, String Name, String CheckIn, String Assignedp) {
        this.PatientID = PatientID;
        this.Name = Name;
        this.CheckIn = CheckIn;
        this.AssignedP = AssignedP;
    }
   
    /**
     * toString, aims to ensure whenever a Patient is printed the format is readable.
     * @return Returns the Patient objects details in proper format.
     */
   @Override
    public String toString() {
        return "Patient ID: " + PatientID + "\nName: " + Name + "\nCheck In Date: " + CheckIn + "\nAssigned Medical Personnel: " + AssignedP; 
    }
}
