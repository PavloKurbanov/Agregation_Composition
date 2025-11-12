package DoctorAndPatient;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Pavlo");
        Patient patient = new Patient("Lubomir");
        Doctor doctor2 = new Doctor("Olena");
        Patient patient2 = new Patient("Vasilyna");
        Patient patient3 = new Patient("Rajesh");

        doctor.acceptPatient(patient);// Пацієнт Lubomir записався до доктора Pavlo
        doctor.acceptPatient(patient2); // Доктор Pavlo зайнятий пацєнтом Lubomir .
        doctor.cancelPatient();  // Доктор Pavlo відмовився від пацієнта Lubomir .
        patient.infoAboutDoctor(); // Пацієнт Lubomir лікується в доктора Pavlo .
        doctor.acceptPatient(patient2); // Пацеєнт Lubomir записаний до лікаря Pavlo .
        patient.infoAboutDoctor();
        patient2.infoAboutDoctor();
    }
}
