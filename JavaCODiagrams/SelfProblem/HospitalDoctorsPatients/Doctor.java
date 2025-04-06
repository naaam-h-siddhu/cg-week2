package HospitalDoctorsPatients;

import java.util.ArrayList;

public class Doctor {
    private String doctorName;
    private ArrayList<Patient> patients;

    public Doctor(String doctorName, Hospital h) {
        patients = new ArrayList<>();
        h.addDoctor(this);
        this.doctorName = doctorName;
    }
    public void consult(Patient patient){
        patients.add(patient);
        patient.addDoctor(this);
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void getDoctorDetails(){
        System.out.println("Name :"+doctorName);
        System.out.print("patients : ");
        for(Patient patient: patients){
            System.out.print(patient.getPatientName()+", ");
        }
        System.out.println();
    }
}
