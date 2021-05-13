package guanglianda;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class xiecheng {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String jieshu = read.next();
        DateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date star = dft.parse("2020-01-02");//开始时间
            Date endDay=dft.parse(jieshu);//结束时间
            Long starTime=star.getTime();
            Long endTime=endDay.getTime();
            Long num=endTime-starTime;//时间戳相差的毫秒数
            int cha= (int) (num/24/60/60/1000);//除以一天的毫秒数
            System.out.println((2+cha%7)%7);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

}
