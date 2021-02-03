package com.inetwork.web.data.dto.manageorders;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "RequestDescription")
@XmlType(name = "RequestDescription")
@XmlAccessorType(XmlAccessType.NONE)
public class RequestDescription
{
   @XmlAttribute(required = true)
   private String link;

   @XmlElementRefs(
   {
       @XmlElementRef(type = ResultsModel.class)
   })
   private Object xmlBody;

   public String getLink()
   {
      return link;
   }

   public void setLink(String link)
   {
      this.link = link;
   }

   public Object getXmlBody()
   {
      return xmlBody;
   }

   public void setXmlBody(Object xmlBody)
   {
      this.xmlBody = xmlBody;
   }

    @Override
   public String toString()
   {
      return String.format("RequestDescription{link=%s, xmlBody=%s}", link, xmlBody);
   }
}
