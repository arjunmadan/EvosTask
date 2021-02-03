package com.inetwork.web.data.dto.imports.linefeatures.e911;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.google.common.collect.Lists;

@XmlRootElement(name = "E911OrderResponsesWrapper")
@XmlType(name = "E911OrderResponsesWrapper")
@XmlAccessorType(XmlAccessType.NONE)
public class E911OrderResponsesWrapper implements Iterable<E911OrderResponseWrapper>
{
   @XmlElement(name = "E911OrderResponseWrapper")
   private List<E911OrderResponseWrapper> e911OrderResponsesWrapper;

   @XmlElement(name = "CustomerOrderId")
   private String customerOrderId;

   public String getCustomerOrderId() {
      return customerOrderId;
   }

   public void setCustomerOrderId(String customerOrderId) {
      this.customerOrderId = customerOrderId;
   }

   public E911OrderResponsesWrapper()
   {
      this(Lists.<E911OrderResponseWrapper> newArrayList());
   }

   public E911OrderResponsesWrapper(List<E911OrderResponseWrapper> e911OrderResponses)
   {
      setE911OrderResponsesWrapper(e911OrderResponses);
   }

   public List<E911OrderResponseWrapper> getE911OrderResponsesWrapper()
   {
      return e911OrderResponsesWrapper;
   }

   public void setE911OrderResponsesWrapper(List<E911OrderResponseWrapper> e911OrderResponsesWrapper)
   {
      this.e911OrderResponsesWrapper = e911OrderResponsesWrapper;
   }

   @Override
   public Iterator<E911OrderResponseWrapper> iterator()
   {
      return getE911OrderResponsesWrapper() != null ? e911OrderResponsesWrapper.iterator() : Lists.<E911OrderResponseWrapper> newArrayList()
            .iterator();
   }

   public void add(E911OrderResponseWrapper e911OrderResponseWrapper)
   {
      if (getE911OrderResponsesWrapper() == null)
      {
         setE911OrderResponsesWrapper(Lists.<E911OrderResponseWrapper> newArrayList());
      }
      getE911OrderResponsesWrapper().add(e911OrderResponseWrapper);
   }

   public void addAll(List<E911OrderResponseWrapper> e911OrderResponsesWrappers)
   {
      if (e911OrderResponsesWrapper == null)
      {
         e911OrderResponsesWrapper = Lists.newArrayList();
      }
      e911OrderResponsesWrapper.addAll(e911OrderResponsesWrappers);
   }

   public E911OrderResponseWrapper get(int index)
   {
      return getE911OrderResponsesWrapper() != null ? getE911OrderResponsesWrapper().get(index) : null;
   }

   public int size()
   {
      return getE911OrderResponsesWrapper() != null ? getE911OrderResponsesWrapper().size() : 0;
   }

   public boolean isEmpty()
   {
      return getE911OrderResponsesWrapper() == null || getE911OrderResponsesWrapper().isEmpty();
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      E911OrderResponsesWrapper that = (E911OrderResponsesWrapper) o;
      return Objects.equals(e911OrderResponsesWrapper, that.e911OrderResponsesWrapper) &&
              Objects.equals(customerOrderId, that.customerOrderId);
   }

   @Override
   public int hashCode() {

      return Objects.hash(e911OrderResponsesWrapper, customerOrderId);
   }

}
