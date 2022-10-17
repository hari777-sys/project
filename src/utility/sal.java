package utility;

import java.util.HashMap;
import java.util.Scanner;

public class sal extends exp {
    public void salary(){
        double bpay,da,hra,pf,grspay,net_salary;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the :");
        bpay= sc.nextDouble();
        da=30.0/100.0*bpay;
        hra=15.0/100.0*bpay;
        pf=12.5/100.0*bpay;
        grspay=bpay+da+hra;
        net_salary=grspay-pf;
        System.out.println("net salary:"+net_salary);
        //HashMap<String, Double>map = new  Hashmap<>();
        //map.put(p,net_salary);
        //System.out.println(map);


    }


}
