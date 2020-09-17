package com.thoughtworks.capability.gtb;

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
    int friday = 5;
    int dayOfWeekPlus = 8;

    int dayOfWeek = date.getDayOfWeek().getValue();
    if (dayOfWeek >= friday) {
      nextWorkDate = date.plusDays(dayOfWeekPlus - dayOfWeek);
    }else {
      nextWorkDate = date.plusDays(1);
    }
    return nextWorkDate;
  }
}
