package com.xworkz.general.dto;
        import java.io.Serializable;
public class BirthCertificateDTO implements Serializable {
    private String birthId, hospitalName, fatherName, motherName, dateTime, doctorName, nurseName, hospitalType;
    public BirthCertificateDTO() {}
    public String getBirthId() { return birthId; }
    public void setBirthId(String birthId) { this.birthId = birthId; }
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public String getFatherName() { return fatherName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
    public String getMotherName() { return motherName; }
    public void setMotherName(String motherName) { this.motherName = motherName; }
    public String getDateTime() { return dateTime; }
    public void setDateTime(String dateTime) { this.dateTime = dateTime; }
    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public String getNurseName() { return nurseName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }
    public String getHospitalType() { return hospitalType; }
    public void setHospitalType(String hospitalType) { this.hospitalType = hospitalType; }
}