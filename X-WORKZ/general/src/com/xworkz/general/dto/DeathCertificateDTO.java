package com.xworkz.general.dto;
        import java.io.Serializable;
public class DeathCertificateDTO implements Serializable {
    private String name, cause, date, time, ageAtDeath, certifiedBy, hospitalName, mannerOfDeath, gender, marks;
    public DeathCertificateDTO() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCause() { return cause; }
    public void setCause(String cause) { this.cause = cause; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getTime() { return time; }
    public void setTime(String time) { this.time = time; }
    public String getAgeAtDeath() { return ageAtDeath; }
    public void setAgeAtDeath(String ageAtDeath) { this.ageAtDeath = ageAtDeath; }
    public String getCertifiedBy() { return certifiedBy; }
    public void setCertifiedBy(String certifiedBy) { this.certifiedBy = certifiedBy; }
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public String getMannerOfDeath() { return mannerOfDeath; }
    public void setMannerOfDeath(String mannerOfDeath) { this.mannerOfDeath = mannerOfDeath; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getMarks() { return marks; }
    public void setMarks(String marks) { this.marks = marks; }
}

