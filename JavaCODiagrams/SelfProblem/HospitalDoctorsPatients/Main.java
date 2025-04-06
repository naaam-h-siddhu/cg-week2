package HospitalDoctorsPatients;

public class Main {
    public static void main(String[] args) {

        // Create a hospital
        Hospital aiims = new Hospital("AIIMS Bhopal");

        // Create some patients
        Patient p1 = new Patient("Siddhu",aiims);
        Patient p2 = new Patient("Karan",aiims);
        Patient p3 = new Patient("Sumit",aiims);
        Patient p4 = new Patient("Nitish",aiims);
        Patient p5 = new Patient("Nivedita",aiims);
        Patient p6 = new Patient("Anshi",aiims);

        // Creating some doctors
        Doctor d1 = new Doctor("Dr. Yuvraj Singh",aiims);
        Doctor d2 = new Doctor("Dr. Prinshu Singh",aiims);
        // Add consults
        d1.consult(p1);
        d2.consult(p2);
        d2.consult(p3);
        d1.consult(p5);
        d1.consult(p4);
        d2.consult(p6);

        aiims.getHospitalDetails();
        d1.getDoctorDetails();
        d2.getDoctorDetails();
    }
}
