import java.time.LocalDate;

public class Main{
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        StringBuilder sb = new StringBuilder();

        sb.append(year).append('\n').append(month).append('\n').append(day);
        System.out.println(sb);
    }
}
