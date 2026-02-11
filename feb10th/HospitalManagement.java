class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
class Patient extends Person {
    Patient(String name) {
        super(name);
    }
}
class Appointment {
    Patient patient;

    Appointment(Patient patient) {
        this.patient = patient;
    }
}
class Doctor extends Person {
    String specialization;
    Appointment[] appointments = new Appointment[5];
    int appCount = 0;

    Doctor(String name, String specialization) {
        super(name);
        this.specialization = specialization;
    }

    void addAppointment(Patient p) {
        appointments[appCount++] = new Appointment(p);
        System.out.println("Appointment added for " + p.name);
    }

    void dischargePatient(String patientName) {
        for (int i = 0; i < appCount; i++) {
            if (appointments[i].patient.name.equals(patientName)) {
                appointments[i] = null;
                System.out.println(patientName + " discharged from Dr. " + name);
                break;
            }
        }
    }
}
class Hospital {
    Doctor[] doctors = new Doctor[5];
    int doctorCount = 0;

    void addDoctor(Doctor d) {
        doctors[doctorCount++] = d;
    }

    void searchDoctorBySpecialization(String spec) {
        for (int i = 0; i < doctorCount; i++) {
            if (doctors[i].specialization.equalsIgnoreCase(spec)) {
                System.out.println("Doctor Found: " + doctors[i].name);
            }
        }
    }
}
public class HospitalManagement {
    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor("Arjun", "Cardiology");
        Doctor d2 = new Doctor("Meena", "Neurology");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        Patient p1 = new Patient("karthik");
        Patient p2 = new Patient("sita");

        d1.addAppointment(p1);
        d1.addAppointment(p2);

        d1.dischargePatient("karthik");

        hospital.searchDoctorBySpecialization("Cardiology");
    }
}
