import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    Person paolo = new Person ("Paolo", "Rossi", Gender.M);
        /*Definisco la data di nascita e dichiaro l'oggetto sampledateformat*/
        String pattern = "dd-MM-YYYY";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        /*Faccio gestire a Java l'eccezione sul parse della data (Try-catch)*/
        try {
            Date date = simpleDateFormat.parse("12-12-1995");
            paolo.setBirthDate(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Student gianni = new Student("Gianni", "Bianchi", Gender.M, 1);
        System.out.println(paolo);
        System.out.println(gianni);

    }
}
