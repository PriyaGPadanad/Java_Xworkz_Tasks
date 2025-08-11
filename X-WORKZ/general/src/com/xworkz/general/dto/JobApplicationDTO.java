package com.xworkz.general.dto;
        import java.io.Serializable;
public class JobApplicationDTO implements Serializable {
    private String name, email, education, skills, salary, experience;
    public JobApplicationDTO() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getEducation() { return education; }
    public void setEducation(String education) { this.education = education; }
    public String getSkills() { return skills; }
    public void setSkills(String skills) { this.skills = skills; }
    public String getSalary() { return salary; }
    public void setSalary(String salary) { this.salary = salary; }
    public String getExperience() { return experience; }
    public void setExperience(String experience) { this.experience = experience; }
}
