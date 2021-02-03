package com.inetwork.web.data.utils;

import com.inetwork.web.data.shared.EasternTime;
import com.inetwork.web.data.shared.ServiceConstants;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Pattern;

import static com.inetwork.web.data.shared.ServiceConstants.MILLISECONDS_PER_MINUTE;

import com.inetwork.web.data.shared.utils.StringUtils;

public class DateUtils
{

   private static final Pattern REG_EXP_ONE = Pattern.compile(ServiceConstants.REG_EXP_ONE_PATTERN);
   private static final Pattern REG_EXP_TWO = Pattern.compile(ServiceConstants.REG_EXP_TWO_PATTERN);
   private static final Pattern REG_EXP_OLD = Pattern.compile(ServiceConstants.REG_EXP_OLD_PATTERN);
   private static final Pattern REG_EXP_WEB_HISTORY = Pattern.compile(ServiceConstants.REG_EXP_WEB_HISTORY_PATTERN);
   private static final Pattern REG_EXP_WEB_DATE = Pattern.compile(ServiceConstants.REG_EXP_WEB_DATE_PATTERN);
   private static SimpleDateFormat irisOrderTimeOne = new SimpleDateFormat(ServiceConstants.TIME_ONE_PATTERN);
   private static SimpleDateFormat irisOrderTimeTwo = new SimpleDateFormat(ServiceConstants.TIME_TWO_PATTERN);
   private static SimpleDateFormat irisOrderTimeOld = new SimpleDateFormat(ServiceConstants.TIME_OLD_PATTERN);
   private static SimpleDateFormat generalWebDateFormat = new SimpleDateFormat(ServiceConstants.GENERAL_WEB_DATE_FORMAT_PATTERN);
   private static SimpleDateFormat generalWebDateTimeFormat = new SimpleDateFormat(ServiceConstants.GENERAL_WEB_DATE_TIME_FORMAT_PATTERN);
   private static SimpleDateFormat irisEstEdtConverter = new SimpleDateFormat(ServiceConstants.EST_EDT_PATTERN);
   private static SimpleDateFormat webHistoryNotesTimeConverter = new SimpleDateFormat(ServiceConstants.WEB_HISTORY_NOTES_TIME_PATTERN);

   public static Date getDate(String orderDate)
   {
      try
      {
         if (REG_EXP_ONE.matcher(orderDate)
               .find())
         {
            return irisOrderTimeOne.parse(orderDate);
         }
         else if (REG_EXP_TWO.matcher(orderDate)
               .find())
         {
            return irisOrderTimeTwo.parse(orderDate);
         }
         else if (REG_EXP_OLD.matcher(orderDate)
               .find())
         {
            return irisOrderTimeOld.parse(orderDate);
         }
         else if (REG_EXP_WEB_HISTORY.matcher(orderDate)
               .find())
         {
            return webHistoryNotesTimeConverter.parse(orderDate);
         }
         else if (REG_EXP_WEB_DATE.matcher(orderDate)
               .find())
         {
            return generalWebDateFormat.parse(orderDate);
         }
         else
         {
            return null;
         }
      }
      catch (ParseException iae)
      {
         return null;
      }
   }

   @SuppressWarnings("deprecation")
   public static String getEstDate(String dateString)
   {
      Date date = getDate(dateString);
      if ((dateString != null) && (date != null))
      {
         date.setTime(date.getTime() - (long) date.getTimezoneOffset() * MILLISECONDS_PER_MINUTE);
         TimeZone zone = null;
         String timeZone = "";
         if (isEDT(date))
         {
            zone = TimeZone.getTimeZone("GMT-4");
            timeZone = EasternTime.EDT.name();
         }
         else
         {
            zone = TimeZone.getTimeZone("GMT-5");
            timeZone = EasternTime.EST.name();
         }
         irisEstEdtConverter.setTimeZone(zone);
         return irisEstEdtConverter.format(date)
               .concat(" ")
               .concat(timeZone);
      }
      return null;
   }

   public static boolean isEDT(Date date)
   {
      TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
      return timeZone.inDaylightTime(date);
   }

   public static String convertDate(String date, String oldPattern, String newPattern)
   {
      if (StringUtils.isEmpty(date))
         return date;

      String convertedDate = date;
      try
      {
         SimpleDateFormat oldDateTimeFormat = new SimpleDateFormat(oldPattern);
         Date parsedDate = oldDateTimeFormat.parse(date);
         SimpleDateFormat newDateTimeFormat = new SimpleDateFormat(newPattern);
         convertedDate = newDateTimeFormat.format(parsedDate);
      }
      catch (Exception e)
      {
         e.printStackTrace();
      }
      return convertedDate;
   }
}
