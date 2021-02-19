public class Student extends Person{

    private int iD;
    public Student(String name, String surname, Gender gender, int iD) {
        super(name, surname, gender);  //equivale a dire Chiama Persona
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Studente {" +
                "iD=" + iD + getDateString() +
                "}";
    }
}
