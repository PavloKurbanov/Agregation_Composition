package DoctorAndPatient;

public class Doctor {
    private String name;
    private Patient patient;


    public Doctor(String name) {
        this.name = name;
    }

    public void acceptPatient(Patient patient) {
        if (patient.isBusy()) {
            System.out.println("Пацеєнт " + patient.getName() + " записаний до лікаря " + patient.getDoctor().getName() + " . ");
            return;
        }
        if (this.patient != null) {
            System.out.println("Доктор " + getName() + " зайнятий пацєнтом " + this.patient.getName() + " . ");
            return;
        }
        this.patient = patient;
        patient.setDoctor(this);
        System.out.println("Пацієнт " + patient.getName() + " записався до доктора " + getName() + " . ");

    }

    public void infoAboutPatient() {
        if (this.patient == null) {
            System.out.println("Доктор " + getName() + " не має жодного пацієнта");
        }
        System.out.println("Доктор " + getName() + " лікує " + this.patient.getName() + " . ");
    }

    public void cancelPatient() {
        System.out.println("Доктор " + getName() + " відмовився від пацієнта " + this.patient.getName() + " . ");
        patient.setDoctor(null);
        this.patient = null;
    }

    public String getName() {
        return name;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Patient getPatient() {
        return patient;
    }

    public boolean isBusy() {
        return patient != null;
    }

}
