package com.xworkz.Task;

public class Security {
    Personnel[] personnel;

    public Security(Personnel[] personnel) {
        this.personnel = personnel;
    }

    public void displaySecurity(){
        for (Personnel person: personnel){
            System.out.println("Security person:"+ person.name);
            for(Skill skill: person.skills){
                System.out.println("Skill:"+ skill.name);
                for (Experience exp: skill.experiences){
                    for (ExperienceDetail expDetail: exp.experienceDetails){
                        System.out.println("Company:"+ expDetail.company.name);
                        for(Education edu: expDetail.educations){
                            System.out.println("Education:"+ edu.degree);
                        }
                    }
                }
            }
        }
    }
}
