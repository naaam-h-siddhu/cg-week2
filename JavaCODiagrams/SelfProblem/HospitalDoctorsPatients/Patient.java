package HospitalDoctorsPatients;

import javax.print.Doc;
import java.util.ArrayList;

public class Patient {
    private String patientName;
    private ArrayList<Doctor> doctors;

    public Patient(String patientName,Hospital h) {
        doctors = new ArrayList<>();
        this.patientName = patientName;
        h.addPatient(this);

    }
    public void addDoctor(Doctor doctor){
        doctors.add(doctor);

    }
    public void getPatientDetails(){
        System.out.println("Name of patient: "+patientName);
        System.out.print("Doctors : ");
        for(Doctor doctor : doctors){
            System.out.println(doctor.getDoctorName()+", ");
        }
        System.out.println();
    }
    public String getPatientName() {
        return patientName;
    }
}
