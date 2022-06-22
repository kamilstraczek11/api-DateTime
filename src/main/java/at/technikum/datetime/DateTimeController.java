package at.technikum.datetime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.text.SimpleDateFormat;
import java.util.Date;
@RestController
public class DateTimeController {
    @GetMapping("/api/time")
    public String time(){
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }
    @GetMapping("/api/date")
    public String date(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return formatter.format(date);
    }




}











