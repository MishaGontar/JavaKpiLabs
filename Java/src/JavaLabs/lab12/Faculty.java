package JavaLabs.lab12;
import java.util.*;

public class Faculty {
    String NameOfFaculty;
    ArrayList<Student> students = new ArrayList<>();
    private final ArrayList <Student> kontrakts = new ArrayList<>();
    private final ArrayList <Student> budjet = new ArrayList<>();
    private int maxBud = 0;
    private int maxKon = 0;

    Faculty(String NameOfFaculty, int maxBud , int maxKon){
        this.maxBud = maxBud;
        this.maxKon = maxKon;
        this.NameOfFaculty = NameOfFaculty;
    }

    public void addStudent(Student student) {
        students.add(student);
        students.sort(Comparator.comparing(Student::getNote).reversed());
    }

    public void findKontPeople(){
        System.out.println("Список абітуріентів які потрапили на бюджет");
        students.stream()
             .takeWhile(n -> n.note >60)
             .limit(maxBud)
             .peek(student -> budjet.add(student))
             .forEach(student -> System.out.println("Surname : "+student.surname + " | Note is : " + student.note));

        budjet.stream()
                .forEach(student -> students.remove(student));
        System.out.println("----------------------------------");

        System.out.println("Список студентів які потрапили на контракт і мають бал > 60");
        students.stream()
          .takeWhile(n -> n.getNote() > 60)
          .limit(maxKon)
          .peek(student -> kontrakts.add(student))
          .forEach(student -> System.out.println("Surname : "+student.surname + " | Note is : " + student.note));

        kontrakts.stream()
          .forEach(student -> students.remove(student));
        System.out.println("-------------------------------------");

        System.out.println("Список студентів мають бал < 60");
        students.stream()
                .forEach(student -> System.out.println("Surname : "+student.surname + " | Note is : " + student.note));
        System.out.println("-------------------------------------");
    }
    void display(){
        System.out.println("Факультет :" + NameOfFaculty);
        System.out.println("Кількість буджетних місць :" + maxBud);
        System.out.println("Кількість контрактних місць :" + maxKon);
        System.out.println("----------------");
        System.out.println("Призвіще  | Оцінка ");
        System.out.println("----------------");
        students.forEach(student -> System.out.println(student.surname + " | " + student.note));
        System.out.println('\n');
    }
    void display2(){
        System.out.println("Факультет :" + NameOfFaculty);
        System.out.println("Кількість буджетних місць :" + maxBud);
        System.out.println("Кількість контрактних місць :" + maxKon);
        System.out.println("----------------");
        System.out.println("Призвіще  | Ім'я | Середній бал | Номер залікової книжки  ");
        System.out.println("----------------");
        students.forEach(student -> System.out.println(student.surname + " | " + student.name +" | "+student.note + " | " + student.StudentNumber));
        System.out.println('\n');
    }
}