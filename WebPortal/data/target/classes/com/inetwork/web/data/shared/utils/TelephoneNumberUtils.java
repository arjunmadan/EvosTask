package com.inetwork.web.data.shared.utils;

import static com.inetwork.web.data.shared.utils.CollectionUtils.isNotEmpty;
import static com.inetwork.web.data.shared.utils.StringUtils.EMPTY_STRING;
import static com.inetwork.web.data.shared.utils.StringUtils.isEmpty;

import com.google.gwt.regexp.shared.RegExp;
import com.inetwork.web.data.shared.dto.TollFreeNpa;
import java.util.List;

public abstract class TelephoneNumberUtils
{
   private static final String VALID_TOLLFREE_NXX_REGEX = "(" + StringUtils.join(TollFreeNpa.TOLL_FREE_NPAS, "|") + ")";
   private static final String VALID_TOLLFREE_REGEX = "(" + VALID_TOLLFREE_NXX_REGEX + "[2-9]\\d{6})";
   private static final RegExp TOLLFREE_TELEPHONENUMBER = RegExp.compile("^" + VALID_TOLLFREE_REGEX + "$");
   private static final RegExp TEN_DIGIT_TELEPHONENUMBER = RegExp.compile("^\\d{10}$");
   private static final RegExp SHORT_CODE_TELEPHONENUMBER = RegExp.compile("^\\d{5,6}$");

   private TelephoneNumberUtils()
   {
   }

   /**
    * Format ten digit telephone number as follows: "(NPA) NXX-XXXX"
    * 
    * @param rawNumber raw telephone number
    * @return a formatted telephone number
    */
   public static String formatWithParensAndDash(final String rawNumber)
   {
      StringBuilder sb = new StringBuilder();
      String number = StringUtils.checkEmpty(rawNumber);
      if (number.length() >= 10)
      {
         sb.append('(')
               .append(number.substring(0, 3))
               .append(')')
               .append(' ')
               .append(number.substring(3, 6))
               .append('-')
               .append(number.substring(6, number.length()));
      }
      else
      {
         sb.append(number);
      }
      return sb.toString();
   }

   // TODO remove this method due to new TN validation rules
   public static String formatToDigits(final String telephoneNumber)
   {
      return telephoneNumber.replaceAll("\\D", "");
   }

   public static String formatTo10DigitsTn(String tn)
   {
      if (isEmpty(tn))
      {
         return tn;
      }
      String output = tn.replaceAll("^\\((\\d{3})\\)\\s", "$1");
      output = output.replaceAll("-|\\.", EMPTY_STRING); // remove dots and dashes
      output = output.replaceFirst("^\\((\\d{3})\\)", "$1"); // replace only first parentheses group
      if (output.matches("^(1|01)(\\d{10})$")) // remove leading 1 if TN is 11 digits, and 01 if TN is 12 digits
      {
         return output.replaceFirst("1|01", EMPTY_STRING);
      }
      else if (output.matches("^\\+1(\\d{10})$")) // remove leading +1 if any
      {
         return output.replaceFirst("\\+1", EMPTY_STRING);
      }
      return output;
   }

   public static boolean isValidTollFreeTelephoneNumber(String fullNumber) {
      return isValid(fullNumber, TOLLFREE_TELEPHONENUMBER);
   }

   public static boolean isValidShortCodeTelephoneNumber(String fullNumber) {
      return isValid(fullNumber, SHORT_CODE_TELEPHONENUMBER);
   }

   public static boolean isValidTollFreeTelephoneNumbers(List<String> telephoneNumbers) {
      return isNotEmpty(telephoneNumbers) && telephoneNumbers.stream()
              .allMatch(TelephoneNumberUtils::isValidTollFreeTelephoneNumber);
   }

   private static boolean isValid(String value, RegExp regExp)
   {
      return StringUtils.isNotEmpty(value) && regExp.test(value);
   }

   public static boolean isValid10DigitTelephoneNumber(String fullnumber)
   {
      return isValid(fullnumber, TEN_DIGIT_TELEPHONENUMBER);
   }
}
