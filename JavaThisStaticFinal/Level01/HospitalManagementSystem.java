public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient dholu = new Patient("Dholu yadav",12,"Piles",1);
        Patient bholu = new Patient("Bholu gupta",13, "Paralysis", 2);
        dholu.getPatientDetails();
        bholu.getPatientDetails();
        Patient.getTotalPatients();
        if(dholu instanceof Patient && bholu instanceof Patient){
            System.out.println("Yes dholu and bholu are patient");
        }
    }
}
class Patient{
    private static String hospitalName = "AIIMS";
    private String name;
    private int age;
    private String ailment;
    private static int totalPatient = 0;
    private final int patientID;

    public Patient(String name, int age, String ailment , int patientID){
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatient++;
    }
    public static void getTotalPatients(){
        System.out.println("Total patients : "+totalPatient);

    }
    public void getPatientDetails(){
        System.out.println("Patient name : "+name);
        System.out.println("Age of patient : "+age);
        System.out.println("Ailment : "+ailment);
    }


}