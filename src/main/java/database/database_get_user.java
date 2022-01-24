package database;
import Models.user;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import Models.human;
public class database_get_user {

  //  public user getUser() {
//        return localUser;//this function must return user object
  //  }

    LocalDateTime convertStringToLocalDateTime(String toBeConverted){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return LocalDateTime.parse(toBeConverted, formatter);
    }

    String convertLocalDateTimeToString(LocalDateTime toBeConverted){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
        return dateTime.format(formatter);
    }


}
