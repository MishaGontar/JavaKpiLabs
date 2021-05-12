package JavaLabs.lab12;

public class Main {
    public static void main(String[] args) {
        Institute institute1 = new Institute("Institute");
        institute1.addFaculty(new Faculty("Facul1" , 4 , 5));

        Faculty first = institute1.faculties.get(0);
        first.addStudent(new Student("Koko",40));
        first.addStudent(new Student("Lolo",96));
        first.addStudent(new Student("Volk",65));
        first.addStudent(new Student("Mischel",60));
        first.addStudent(new Student("Nova",70));
        first.addStudent(new Student("ova",71));
        first.addStudent(new Student("a",90));
        first.addStudent(new Student("Nova",0));
        first.display();
        first.findKontPeople();

        Institute institute2 = new Institute("The Best Institute ");
        institute2.addFaculty(new Faculty("Hongo-Facult",4,5));
        institute2.addFaculty(new Faculty("Co-Mon",6,10));
        institute2.addFaculty(new Faculty("Fin",4,2));

        Faculty hongo = institute2.faculties.get(0);
        Faculty comon = institute2.faculties.get(1);
        Faculty fin = institute2.faculties.get(2);

        hongo.addStudent(new Student("Jok", "Nom",75,111));
        hongo.addStudent(new Student("Mono", "Gono",90,112));
        hongo.addStudent(new Student("NonStop", "Normal",93,113));
        hongo.display2();

        comon.addStudent(new Student("Noma","Bon",88,211));
        comon.addStudent(new Student("Lova","Jam",78,212));
        comon.addStudent(new Student("Vavon","Vova",98,213));
        comon.display2();
        comon.findKontPeople();

        fin.addStudent(new Student("Kovka" , "Molovka " , 87,311));
        fin.addStudent(new Student("Bonka" , "Finka " , 89,312));
        fin.addStudent(new Student("Lovka " , "Jok " , 89,313));

        institute2.whoIsTheBest();
    }
}
