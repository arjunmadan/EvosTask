package com.inetwork.web.data.dto;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "ImportNumbers")
@XmlType(name = "ImportNumbers")
@XmlAccessorType(XmlAccessType.FIELD)
public class ImportNumbers {

    @XmlElement(name = "AccountId")
    private Integer accountId;

    @XmlElement(name = "Site")
    private Integer site;

    @XmlElement(name = "SIP")
    private Integer sip;

    @XmlElement(name = "SpecialFlag")
    private Boolean sFlag;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "VendorName")
    private String vendorName;

    @XmlElement(name = "BatchNumber")
    private Integer batchNumber;

    @XmlElement(name = "BatchSize")
    private Integer batchSize;

    @XmlElementWrapper(name = "TelephoneNumbers")
    @XmlElement(name = "TelephoneNumber")
    private List<String> tns;

    public List<String> getTns() {
        return tns;
    }

    public void setTns(List<String> tns) {
        this.tns = tns;
    }

    public Integer getBatchSize() {
        return batchSize;
    }

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public Integer getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(Integer batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getsFlag() {
        return sFlag;
    }

    public void setsFlag(Boolean sFlag) {
        this.sFlag = sFlag;
    }

    public Integer getSip() {
        return sip;
    }

    public void setSip(Integer sip) {
        this.sip = sip;
    }

    public Integer getSite() {
        return site;
    }

    public void setSite(Integer site) {
        this.site = site;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }
}
