package com.xworkz.nursery.enitity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nurserytable")
public class NurseryEnitity {
    @Id
    private int id;
    @Column(name="nurseryname")
    private String nurseryName;

    private  String flowername;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNurseryName() {
        return nurseryName;
    }

    public void setNurseryName(String nurseryName) {
        this.nurseryName = nurseryName;
    }

    public String getFlowername() {
        return flowername;
    }

    public void setFlowername(String flowername) {
        this.flowername = flowername;
    }

    public NurseryEnitity(int id, String nurseryName, String flowername) {
        this.id = id;
        this.nurseryName = nurseryName;
        this.flowername = flowername;
    }

    @Override
    public String toString() {
        return "NurseryEnitity{" +
                "id=" + id +
                ", nurseryName='" + nurseryName + '\'' +
                ", flowername='" + flowername + '\'' +
                '}';
    }
}
