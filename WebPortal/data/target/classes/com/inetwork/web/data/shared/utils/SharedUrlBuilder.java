package com.inetwork.web.data.shared.utils;

import static com.inetwork.web.data.shared.utils.StringUtils.isNotEmpty;

import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public abstract class SharedUrlBuilder implements UrlBuilder
{
   private static final String SLASH = "/";

   protected final String scheme;
   protected final String host;
   protected final Integer port;
   protected final Multimap<String, String> parameters;
   protected final StringBuilder pathBuilder;

   public SharedUrlBuilder(String scheme, String host, Integer port, String restApiPath)
   {
      this.scheme = scheme;
      this.host = host;
      this.port = port;
      this.parameters = HashMultimap.create();
      this.pathBuilder = new StringBuilder();
      addPath(restApiPath);
   }

   @Override
   public abstract String buildString();

   @Override
   public UrlBuilder addPath(String pathElement)
   {
      if (isNotEmpty(pathElement))
      {
         if (!pathElement.startsWith(SLASH))
         {
            pathBuilder.append(SLASH);
         }
         pathBuilder.append(pathElement);
         if (pathElement.endsWith(SLASH))
         {
            pathBuilder.deleteCharAt(pathBuilder.length() - 1);
         }
      }
      return this;
   }

   @Override
   public UrlBuilder addPath(int pathElement)
   {
      pathBuilder.append(SLASH)
            .append(pathElement);
      return this;
   }

   @Override
   public UrlBuilder addParameter(String name, Object value)
   {
      if (isNotEmpty(name) && isNotEmpty(Objects.toString(value, "")))
      {
         parameters.put(name, String.valueOf(value));
      }
      return this;
   }

   @Override
   public UrlBuilder addParameters(String name, List<?> values)
   {
      if (CollectionUtils.isNotEmpty(values))
      {
         for (Object value : values)
         {
            addParameter(name, value);
         }
      }
      return this;
   }

   @Override
   public UrlBuilder addParameters(Multimap<String, ?> parameters)
   {
      if (parameters != null)
      {
         for (Entry<String, ?> parameter : parameters.entries())
         {
            addParameter(parameter.getKey(), parameter.getValue());
         }
      }
      return this;
   }

   @Override
   public String toString()
   {
      return buildString();
   }
}
