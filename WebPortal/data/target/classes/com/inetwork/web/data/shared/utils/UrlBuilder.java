package com.inetwork.web.data.shared.utils;

import java.util.List;

import com.google.common.collect.Multimap;

public interface UrlBuilder
{

   /**
    * Appends a path "element" (e.g. .../accounts).
    * 
    * @param pathParam the path element
    * @return the url builder
    */
   UrlBuilder addPath(String pathParam);

   /**
    * Appends a path "element" (e.g. .../123).
    * 
    * @param pathParam the path element
    * @return the url builder
    */
   UrlBuilder addPath(int pathParam);

   UrlBuilder addParameter(String key, Object values);

   /**
    * Appends the map's key-values as query parameters.
    * 
    * @param parameters the parameters (key=parameterName, value=parameterValues)
    * @return the url builder
    */
   UrlBuilder addParameters(Multimap<String, ?> parameters);

   UrlBuilder addParameters(String parameterName, List<?> parametersValues);

   /**
    * Builds the url returning it as a string.
    * 
    * @return the url
    * @see com.google.gwt.http.client.UrlBuilder#buildString()
    */
   String buildString();

}
