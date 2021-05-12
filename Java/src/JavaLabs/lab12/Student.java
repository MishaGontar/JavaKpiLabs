package JavaLabs.lab12;

public class Student  {
    String surname ;
    String name ;
    int note ;
    int StudentNumber;

    Student (String surname, int note ){
        this.note = note ;
        this.surname = surname ;
    }

    Student (String surname, String name , int note,int StudentNumber ){
        this.note = note ;
        this.surname = surname ;
        this.name = name ;
        this.StudentNumber = StudentNumber ;
    }
    public int getNote() {
        return note;
    }

    public String getSurname() {
        return surname;
    }
}
