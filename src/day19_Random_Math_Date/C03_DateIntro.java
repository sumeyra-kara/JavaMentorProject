package day19_Random_Math_Date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class C03_DateIntro {
    public static void main(String[] args) {
        Date date = new Date();

        //unix time stamp - unix zaman damgası
        System.out.println("date.getTime() = " + date.getTime());

        LocalDate now = LocalDate.now();
        System.out.println("now = " + now);

        LocalDateTime now1 = LocalDateTime.now();
        System.out.println("now1 = " + now1);

        System.out.println("now.getYear() = " + now.getYear());

        System.out.println("now.getDayOfMonth() = " + now.getDayOfMonth());

        System.out.println("now.getDayOfWeek() = " + now.getDayOfWeek());

        //yyyy.MM.dd.hh.mm.ss


    }
}
