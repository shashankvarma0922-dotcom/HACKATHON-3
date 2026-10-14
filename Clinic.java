class Appointment {
    String patientName, patientId, doctorName, type;
    double fee;
    Appointment(String n, String id, String d, String t, double f) {
        patientName = n;
        patientId = id;
        doctorName = d;
        type = t;
        fee = f;
    }
    Appointment(String n, String id, String d, double f) {
        patientName = n;
        patientId = id;
        doctorName = d;
        type = "GENERAL";
        fee = f;
    }
    void display() {
        System.out.println("Patient Name       : " + patientName.toUpperCase());
        System.out.println("Patient ID         : " + patientId);
        System.out.println("Doctor Name        : " + doctorName.toUpperCase());
        System.out.println("Appointment Type   : " + type);
        System.out.println("Consultation Fee   : Rs. " + fee);
        System.out.println("Appointment Status : Confirmed");
        System.out.println();
    }
    void display(String message) {
        System.out.println(message);
        display();
    }
    boolean checkName(Appointment a) {
        return patientName.equalsIgnoreCase(a.patientName);
    }
}
public class Clinic {
    public static void main(String[] args) {
        Appointment a1 = new Appointment(
            "Priya Sharma", "P101", "Dr. Kumar", "GENERAL", 500);

        Appointment a2 = new Appointment(
            "Rahul Verma", "P102", "Dr. Meena", 800);

        System.out.println("CLINIC APPOINTMENT SYSTEM\n");

        a1.display();
        a2.display();

        double total = a1.fee + a2.fee;

        System.out.println("APPOINTMENT SUMMARY");
        System.out.println("Total Appointments : 2");
        System.out.println("Total Consultation : Rs. " + total);
        if (a1.checkName(a2)) {
            System.out.println("Patient Verification: Names Match");
        } else {
            System.out.println("Patient Verification: Names Do Not Match");
        }
    }
}
