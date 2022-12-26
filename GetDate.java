import java.util.Date;

public class GetDate {
    public Date getDate() {
        Date date = new Date();
        return date;
    }

    public String getDaate() {
        return String.format("%tD", getDate());
    }
    
    public String getTiime() {
        return String.format("%tr", getDate());
    }

}
