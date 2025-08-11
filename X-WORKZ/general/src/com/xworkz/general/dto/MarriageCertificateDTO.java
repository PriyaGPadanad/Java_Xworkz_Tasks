package com.xworkz.general.dto;
        import java.io.Serializable;
public class MarriageCertificateDTO implements Serializable {
    private String groomName, brideName, location, address, religion, date, witness1, witness2, officerPresent;
    public MarriageCertificateDTO() {}
    public String getGroomName() { return groomName; }
    public void setGroomName(String groomName) { this.groomName = groomName; }
    public String getBrideName() { return brideName; }
    public void setBrideName(String brideName) { this.brideName = brideName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getReligion() { return religion; }
    public void setReligion(String religion) { this.religion = religion; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getWitness1() { return witness1; }
    public void setWitness1(String witness1) { this.witness1 = witness1; }
    public String getWitness2() { return witness2; }
    public void setWitness2(String witness2) { this.witness2 = witness2; }
    public String getOfficerPresent() { return officerPresent; }
    public void setOfficerPresent(String officerPresent) { this.officerPresent = officerPresent; }
}
