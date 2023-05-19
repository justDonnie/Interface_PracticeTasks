import java.sql.SQLOutput;
import java.time.LocalDate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        EducationCenter college1 = new College("Tech college","England",LocalDate.of(1907,4,22));
        EducationCenter school1 = new School("Turkish Lyceum","Turkey",LocalDate.of(1987,6,27));
        EducationCenter university1 = new University("AUCA","Kyrgyzstan",LocalDate.of(1995,3,12));
        EducationCenter school2 = new School("Gagarina","US",LocalDate.of(1977,6,19));
        EducationCenter university2 = new University("Oxford","England",LocalDate.of(1802,4,20));
        EducationCenter college2 = new College("Hudson Cornett","England",LocalDate.of(1890,2,2));



        Student student1 = new Student("James","Lebron","M", LocalDate.of(2019,3,23),college1);
        Student student2 = new Student("Andrew","Rocks","M",LocalDate.of(2018,4,20),school1);
        Student student3 = new Student("Mary","Johns","F",LocalDate.of(2019,6,20),university1);
        Student student4 = new Student("Ed","Sheeran","M",LocalDate.of(2020,4,28),university2);
        Student student5 = new Student("Camilla","Cabello","F",LocalDate.of(2021,7,20),school2);
        Student student6 = new Student("Sofia","Meyers","F",LocalDate.of(2021,7,20),college2);
        EducationCenter [] educationCenters={college1,school1,university1,school2,university2,college2};
        Student [] students = {student1,student2,student3,student4,student5,student6};
        System.out.println("------------------------STUDENTS INFORMATION-----------------------------------------------");
        for (Student s:students) {
            System.out.println(s);
        }
        System.out.println("-------------------------STUDENTS STUDYING YEAR-------------------------------------------");
        for (Student b:students) {
            b.getStudentsStudyingYear();
        }
        System.out.println("------------------------EDUCATION CENTER FOUNDATION YEAR-----------------------------------");
        for (EducationCenter f:educationCenters) {
            f.getStudentsEducationCenters();
        }




        //EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
        //Абстракт класска School , University, College деген саб класстарды тузунуз.
        //Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
        //Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
        //Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
        //Main класста 1 метод тузунуз.
        //1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.















    }
}