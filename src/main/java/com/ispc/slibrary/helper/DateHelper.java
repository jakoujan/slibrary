/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ispc.slibrary.helper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author edgar
 */
public class DateHelper {

    public static final String FORMAT_DAY_MONTH_YEAR_HOUR_MINUTE = "dd/MM/yyyy hh:mm";

    public static Date prepareDateForBetweenStart(Date startDate) {
        if (startDate == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance(); // locale-specific
        cal.setTime(startDate);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTime();
    }

    public static Date prepareDateForBetweenEnd(Date endDate) {
        if (endDate == null) {
            return null;
        }
        Calendar cal = Calendar.getInstance(); // locale-specific
        cal.setTime(endDate);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        return cal.getTime();
    }

    public static String format(Date date, String format) {
        SimpleDateFormat dt = new SimpleDateFormat(format);
        return dt.format(date);
    }

    public static Date add(Date date, int field, Integer quantity) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(field, quantity);
        return c.getTime();
    }
}
