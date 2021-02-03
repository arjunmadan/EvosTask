package com.inetwork.web.data.shared.utils;

import com.google.gwt.regexp.shared.RegExp;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

public class XmlUtils
{
   public static final String START_XMP = "<xmp>";
   public static final String END_XMP = "</xmp>";

   public static String clean(String xml)
   {
      if (xml != null)
      {
         RegExp re = RegExp.compile("<[^</>]*/>", "g");
         xml = re.replace(xml, "");
      }
      return xml;
   }

   public static String wrapWithinXMP(String xml)
   {
      return START_XMP + xml + END_XMP;
   }

   public static String unWrapFromXMP(String xml)
   {
      if (isNotEmpty(xml) && xml.startsWith(START_XMP) && xml.endsWith(END_XMP))
      {
         return xml.substring(START_XMP.length(), xml.length() - END_XMP.length());
      }
      return xml;
   }

}
