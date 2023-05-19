import java.time.LocalDate;
import java.time.Period;

public class Student extends EducationCenter implements Study {
    private String name;
    private String surname;
    private String gender;
    private LocalDate dateOfStart;
    private EducationCenter educationCenter;

    public Student(String name, String surname, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        this.educationCenter = educationCenter;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return educationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        this.educationCenter = educationCenter;
    }


    @Override
    public void getStudentsEducationCenters() {
        toString();
    }

    @Override
    public void getStudentsStudyingYear() {
        Period period = Period.between(getDateOfStart(),LocalDate.now());
        System.out.println(getName()+" "+getSurname()+" is studying "+period.getYears()+" years");
    }

    @Override
    public String toString() {
        return "Student: " +
                " name - " + name + '\'' +
                " surname - " + surname + '\'' +
                " gender - " + gender + '\'' +
                " dateOfStart - " + dateOfStart +
                " educationCenter - " + educationCenter ;
    }
}
