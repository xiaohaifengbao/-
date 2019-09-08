package com.city.demo.model;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author yuminghao
 * @Date 2019/8/20 10:00
 * @About 时间轴设计
 */
public class TestModel {

    public static void main(String[] args) throws ParseException {
        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("MM-dd");

        Date startDate = df.parse("2-1");
        startCalendar.setTime(startDate);
        Date endDate = df.parse("3-5");
        endCalendar.setTime(endDate);

        List list = new ArrayList();
        Date parse = df.parse("2-1");
        list.add(df.format(parse));
        while (true) {
            startCalendar.add(Calendar.DAY_OF_MONTH, 1);
            if (startCalendar.getTimeInMillis() <= endCalendar.getTimeInMillis()) {
                list.add(df.format(startCalendar.getTime()));
            } else {
                break;
            }
        }
        list.forEach(value -> {
            System.out.println(value);
        });
    }
}
