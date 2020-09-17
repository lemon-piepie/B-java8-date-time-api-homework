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
    if ( date.isBefore(LocalDate.of(date.getYear(),5,1))){
      nextMayFirstDay = LocalDate.of(date.getYear(),5,1);
    }else{
      nextMayFirstDay = LocalDate.of(date.getYear()+1,5,1);
    }
    long daysBetweenNextLaborDay = date.until(nextMayFirstDay, ChronoUnit.DAYS);
    return daysBetweenNextLaborDay;
  }
}
