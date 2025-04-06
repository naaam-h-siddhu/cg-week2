package HospitalDoctorsPatients;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctors;
    private ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
        this.hospitalName = hospitalName;

    }
    public void addPatient(Patient p){
        patients.add(p);
    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void getHospitalDetails(){
        System.out.println("Hospital Name : "+hospitalName);
        System.out.println("names of patients : ");
        for(Patient patient : patients){
            System.out.print(patient.getPatientName()+", ");
        }
        System.out.println();
        System.out.println("names of Doctors : ");
        for (Doctor doctor :doctors){
            System.out.print(doctor.getDoctorName()+", ");
        }
        System.out.println();
    }

}
