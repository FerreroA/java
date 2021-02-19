import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    protected String name;
    protected String surname;
    protected Date birthDate;
    protected int heigth;
    protected Gender gender;

    public Person(String name, String surname, Date birthDate, int heigth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.heigth = heigth;
        this.gender = gender;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    //fattorializzo
    protected String getDateString(){
        String pattern = "dd-MM-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        String date;
        try{
            date = simpleDateFormat.format(birthDate);  //format a Date into a date time format
        }catch (Exception e){
            date = "Non disponibile";
        }


        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + date +
                ", heigth=" + heigth +
                ", gender=" + gender ;
    }

    /*con la chiocciola ridefinisco un metodo*/
    @Override
    public String toString() {
        return "Persona {" + getDateString() + "}";
    }
}
