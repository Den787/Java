import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.DataFormatException;

public class Today
{
    public static void main(String[] args)
    {
        DateFormat format = new SimpleDateFormat("yyyyMMdd_ HH:mm:ss");
        System.out.println(format.format(new Date()));

    }
}
