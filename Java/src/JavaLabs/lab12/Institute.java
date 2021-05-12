package JavaLabs.lab12;

import java.util.ArrayList;
import java.util.Comparator;

public class Institute {
    String NameOfInstitute;
    ArrayList<Faculty> faculties = new ArrayList<>();
    ArrayList<Student> allStudents = new ArrayList<>();

    Institute(String Name) {
        this.NameOfInstitute = Name;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void whoIsTheBest() {

        System.out.println("Інститут : " + NameOfInstitute);
        System.out.println("Факультети : ");

        faculties.stream()
                .peek(faculty -> allStudents.addAll(faculty.students))
                .forEach(faculty -> System.out.print(faculty.NameOfFaculty + " , "));
        System.out.println('\n');
        allStudents.sort(Comparator.comparing(Student::getSurname));

        System.out.println("Список  всіх студентів які вчаться в " + NameOfInstitute + " :");
        allStudents.stream()
                .forEach(student -> System.out.println("Призвіще : "+ student.surname + " | Ім'я : " + student.name + " | Середній бал : " + student.note +" | Номер залікової книжки : " + student.StudentNumber));
        int similarNote = allStudents.stream().mapToInt(student -> student.note).sum()/allStudents.size();

        System.out.println('\n'+ "---------|Студенти які мають середній бал більший ніж середній бал по інституту" +"(Середній бал інституту : "+similarNote+")"+" |---------" );
        allStudents.stream()
                .filter(student -> student.note>similarNote)
                .forEach(student -> System.out.println("Призвіще : "+ student.surname + " | Ім'я : " + student.name + " | Середній бал : " + student.note +" | Номер залікової книжки : " + student.StudentNumber));
    }

}
