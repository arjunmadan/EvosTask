package com.inetwork.web.data.shared.dto.orders.orderdetail;

import com.google.gwt.core.client.GWT;
import java.util.Objects;
import name.pehl.piriti.commons.client.Path;
import name.pehl.piriti.xml.client.XmlReader;
import name.pehl.piriti.xml.client.XmlWriter;

public class TnDetailsNnRoute {

    public interface Reader extends XmlReader<TnDetailsNnRoute> {

    }

    public interface Writer extends XmlWriter<TnDetailsNnRoute> {

    }

    public static final Reader READER = GWT.create(Reader.class);
    public static final Writer WRITER = GWT.create(Writer.class);

    @Path("Nnid")
    private Integer nnId;
    @Path("Name")
    private String name;

    public TnDetailsNnRoute() {

    }

    public TnDetailsNnRoute(Integer nnid, String name) {
        this.nnId = nnid;
        this.name = name;
    }

    public Integer getNnId() {
        return nnId;
    }

    public void setNnId(Integer nnId) {
        this.nnId = nnId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TnDetailsNnRoute)) {
            return false;
        }
        TnDetailsNnRoute that = (TnDetailsNnRoute) o;
        return Objects.equals(getNnId(), that.getNnId()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNnId(), getName());
    }
}
