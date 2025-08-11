package com.xworkz.cinema.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="actor")
public class ActorEntity {

    @Id
    private int id;

    @Column(name="actor_name")
    private String actorName;
    @Column(name="actor_age")
    private int actorAge;
    private String gender;
    private int awards;

    public ActorEntity(int id, String actorName, int actorAge, String gender, int awards) {
        this.id = id;
        this.actorName = actorName;
        this.actorAge = actorAge;
        this.gender = gender;
        this.awards = awards;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public int getActorAge() {
        return actorAge;
    }

    public void setActorAge(int actorAge) {
        this.actorAge = actorAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAwards() {
        return awards;
    }

    public void setAwards(int awards) {
        this.awards = awards;
    }

    @Override
    public String toString() {
        return "ActorEntity{" +
                "id=" + id +
                ", actorName='" + actorName + '\'' +
                ", actorAge=" + actorAge +
                ", gender='" + gender + '\'' +
                ", awards=" + awards +
                '}';
    }
}
