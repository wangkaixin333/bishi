public class Mei4 {import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            //System.out.println("please input the date:(yyyy-MM-dd)");
            String date = input.next();
            boolean flag=true;
            if (isValidDate(date)) {
                try {
                    System.out.println(getSpecifiedDayBefore(date));
                    System.out.println(getSpecifiedDayAfter(date));
                } catch (Exception ex) {
                    flag=false;
                }
            } else {
                flag=false;
            }
            if(flag==false)
            {
                System.out.println("The date you entered is wrong");
            }
        }
        public static boolean isValidDate(String strDate) {

            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            try {
// 设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2018-02-29会被接受，并转换成2018-03-01
                format.setLenient(false);
                Date date = format.parse(strDate);
//判断传入的yyyy年-MM月-dd日 字符串是否为数字

//            String[] sArray = strDate.split("-");
//
//            for (String s : sArray) {
//
//                boolean isNum = s.matches("[0-9]+");
//
////+表示1个或多个（如"3"或"225"），*表示0个或多个（[0-9]*）（如""或"1"或"22"），?表示0个或1个([0-9]?)(如""或"7")
//
//                if (!isNum) {
//
//                    return false;
//                }
//            }
            } catch (Exception e) {

// e.printStackTrace();

// 如果throw java.text.ParseException或者NullPointerException，就说明格式不对

                return false;
            }


            return true;

        }

        /**
         * 获得指定日期的前一天
         *
         * @param specifiedDay
         * @return
         * @throws Exception
         */
        public static String getSpecifiedDayBefore(String specifiedDay) {
//SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date date = null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            c.setTime(date);
            int day = c.get(Calendar.DATE);
            c.set(Calendar.DATE, day - 1);

            String dayBefore = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
            return dayBefore;
        }

        /**
         * 获得指定日期的后一天
         *
         * @param specifiedDay
         * @return
         */
        public static String getSpecifiedDayAfter(String specifiedDay) {
            Calendar c = Calendar.getInstance();
            Date date = null;
            try {
                date = new SimpleDateFormat("yyyy-MM-dd").parse(specifiedDay);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            c.setTime(date);
            int day = c.get(Calendar.DATE);
            c.set(Calendar.DATE, day + 1);

            String dayAfter = new SimpleDateFormat("yyyy-MM-dd").format(c.getTime());
            return dayAfter;
        }

    }
}
