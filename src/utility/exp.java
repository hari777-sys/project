package utility;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class exp {
    public void exe(){
        Scanner  sc = new Scanner(System.in);
        System.out.println("enter your date  of joining:");
        String exp = sc.nextLine();
        String arr[]=exp.split("/");
        int date= Integer.parseInt(arr[0]);
        int month= Integer.parseInt(arr[1]);
        int year= Integer.parseInt(arr[2]);
        var  join = LocalDate.of(year,month,date);
        var now = LocalDate.now();
        var p = Period.between(join,now);
        //System.out.println("your experience is :"+p.getYears()+"years"+p.getMonths()+"months"+p.getDays()+"days");
        String expe = String.valueOf(p);
        System.out.println(expe);
    }
}
