package com.inetwork.web.data.shared.csv;

public abstract class HyperLinkCreator
{
   private static final String HYPER_LINK = "=HYPERLINK";
   private static final String SLASH = "\"";
   private static final String SLASH_ENCODE = "%22";

   private static String formatUrl(String url)
   {
      return url.replaceAll(SLASH, SLASH_ENCODE);
   }

   public static String create(String url, String label)
   {
      StringBuilder sb = new StringBuilder();
      sb.append(HYPER_LINK)
            .append("(")
            .append(SLASH)
            .append(formatUrl(url))
            .append(SLASH)
            .append(";")
            .append(SLASH)
            .append(label)
            .append(SLASH)
            .append(")");
      return sb.toString();
   }
}
