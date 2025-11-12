package DoctorAndPatient;

public class Patient {
    private final String name;
    private Doctor doctor;

    public Patient(String name) {
        this.name = name;
    }

    public void registerDoctor(Doctor doctor) {
        if (this.doctor != null) {
            System.out.println("Пацієн " + getName() + " вже має доктора " + this.doctor.getName() + " . ");
            return;
        }
        if (doctor.isBusy()) {
            System.out.println("Доктор " + doctor.getName() + " має пацієнта " + doctor.getPatient().getName() + " . ");
            return;
        }
        this.doctor = doctor;
        doctor.setPatient(this);
        System.out.println("Пацієнт " + getName() + " записався до лікаря " + doctor.getName() + " . ");

    }

    public void cancelDoctor() {
        System.out.println("Пацієнт " + getName() + " відмовився від лікаря " + this.doctor.getName() + " . ");
        doctor.setPatient(null);
        this.doctor = null;
    }

    public void infoAboutDoctor() {
        if (this.doctor == null) {
            System.out.println("Пацієнт " + getName() + " не має жодного лікаря");
            return;
        }
        System.out.println("Пацієнт " + getName() + " лікується в доктора " + this.doctor.getName() + " . ");
    }

    public boolean isBusy() {
        return this.doctor != null;
    }

    public String getName() {
        return name;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Doctor getDoctor() {
        return this.doctor;
    }
}
