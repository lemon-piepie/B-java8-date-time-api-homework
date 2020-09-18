package com.thoughtworks.capability.gtb;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    LocalDate nextMayFirstDay;
    int year = date.getYear();
    LocalDate laborDayOfThisYear = LocalDate.of(year,5,1);
    //todo date.getYear
    if ( date.isBefore(laborDayOfThisYear)){
      nextMayFirstDay = laborDayOfThisYear;
    }else{
      nextMayFirstDay = laborDayOfThisYear.withYear(year+1);
    }
    return date.until(nextMayFirstDay, ChronoUnit.DAYS);
  }
}
