import java.time.LocalDate;
import java.time.Period;

public class School extends EducationCenter{
    public School(String name, String locatedCountry, LocalDate foundationYear) {
        super(name, locatedCountry, foundationYear);
    }

    public School() {
    }

    @Override
    public void setFoundationYear(LocalDate foundationYear) {
        super.setFoundationYear(foundationYear);
    }

    @Override
    public String toString() {
        return super.toString();
    }


    @Override
    public void getStudentsEducationCenters() {
        Period period = Period.between(getFoundationYear(),LocalDate.now());
        System.out.println(getName()+" "+period.getYears()+" years old");
    }

    @Override
    public void getStudentsStudyingYear() {

    }
}
