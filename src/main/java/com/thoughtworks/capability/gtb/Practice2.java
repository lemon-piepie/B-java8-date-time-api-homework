package com.thoughtworks.capability.gtb;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 对任意日期获取下一个工作日, 不考虑节假日
 *
 * @author itutry
 * @create 2020-05-15_17:20
 */
public class Practice2 {

  public static LocalDate getNextWorkDate(LocalDate date) {
    LocalDate nextWorkDate ;
    int daysOfWeek = 7;

    int dayOfWeek = date.getDayOfWeek().getValue();
    if (dayOfWeek >= DayOfWeek.FRIDAY.getValue()) {
      date = date.plusDays(daysOfWeek - dayOfWeek);
    }
    nextWorkDate = date.plusDays(1);
    return nextWorkDate;
  }
}
