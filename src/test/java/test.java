import java.text.SimpleDateFormat;
import java.util.Date;

public class test {
    public static void main(String args[]){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time=simpleDateFormat.format(new Date());
        System.out.println(time);
    }
}
