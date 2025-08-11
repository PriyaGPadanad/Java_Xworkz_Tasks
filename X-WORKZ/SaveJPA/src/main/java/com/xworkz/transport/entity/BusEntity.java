package com.xworkz.transport.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@Entity
@Table(name="bus")
public class BusEntity {
    @Id
    private int id;

    @Column(name="bus_name")
    private String busName;

    private String source;

    private String destination;

    private int price;

    @Column(name = "bus_time")
    private String busTime;

}
