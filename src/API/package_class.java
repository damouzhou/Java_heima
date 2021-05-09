package API;

/*
    基本数据类型包装类
        将基本数据类型封装为对象，可以在对象中定义更多的功能方法操作该数据
        用于基本数据类型和字符串之间的相互转换
        byte：Byte
        short：Short
        int:Integer
        long:Long
        float:Float
        double:Double
        char:Character
        boolean:Boolean
        
        int和String之间的转换:
            int-->String:
                String str=""+number
                valueOf()：
                    String s2=String.valueOf(number)
            String-->int
                parseInt()

        自动装箱和拆箱
            装箱：将基本数据类型转化为包装类型
                Integer i=Integer.valueOf(100);
                Integer ii=100;
            拆箱
                ii=ii.intValue()+200
                ii+=200;
        注意：只要是对象，在使用前就必须进行不为null的判断。

        Date
            构造方法：
                Date()
                Date(long)
            常用方法：
                setTime()
                getTime()

        SimpleDateFormat:
            格式化和解析日期
                y 年
                M 月
                d 日
                H 时
                m 分
                s 秒
            格式化 Date-->String：
                format
                SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

            解析 String-->Date
                parse
                    String ss="2018-2-28 10:34:27";
                    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date d3 = sdf3.parse(ss);

          Calender
                为某一时段和一组日历字段之间的转换提供方法，并未操作日历字段提供方法
                getInstance:用于获取Calender对象
                Calendar cl = Calendar.getInstance();//多态的形式
                System.out.println(cl);
                int year = cl.get(Calendar.YEAR)-3;
                int month= cl.get(Calendar.MONTH) + 1;
                int date=cl.get(Calendar.DATE);
* */

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class package_class {
    public static void main(String[] args) throws ParseException {
        int number=100;
        String s1=""+number;
        System.out.println(s1);
        String s2=String.valueOf(number);
        System.out.println(s2);
        
        String s="1234";

        Integer i = Integer.valueOf(s);
        System.out.println(i);
        int x=i.intValue();
        System.out.println(x);

        int y=Integer.parseInt(s);
        System.out.println(y);

        Integer ii=Integer.valueOf(100);
        Integer iii=100;
        System.out.println(iii);
        iii=iii.intValue()+200;
        iii=iii+200;
        System.out.println(iii);

        Date d=new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        long time=System.currentTimeMillis();
        Date d2=new Date(161969819);
        d2.setTime(time);
        System.out.println(d2);
        SimpleDateFormat sdf = new SimpleDateFormat();
        String str = sdf.format(d2);
        System.out.println(str);
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d2);
        System.out.println(str2);
        String ss="2018-2-28 10:34:27";
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d3 = sdf3.parse(ss);
        System.out.println(d3);


        Calendar cl = Calendar.getInstance();//多态的形式
        System.out.println(cl);
        cl.set(2018,8,3);
        int year = cl.get(Calendar.YEAR)-3;
        int month= cl.get(Calendar.MONTH) + 1;
        int date=cl.get(Calendar.DATE);
        System.out.println(year+"年"+month+"月"+date+"日");
//        cl.set(2018,9,3);

//        获取任意年份的二月有多少天

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份：");
        int year2 = sc.nextInt();
        Calendar c = Calendar.getInstance();
        c.set(year2,2,1);
        c.add(Calendar.DATE,-1);
        int day=c.get(Calendar.DATE);
        System.out.println(day);

    }
}
