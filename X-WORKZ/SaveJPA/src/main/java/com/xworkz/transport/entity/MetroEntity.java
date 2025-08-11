package com.xworkz.transport.entity;

        import lombok.*;

        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.Id;
        import javax.persistence.Table;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

@Entity
@Table(name = "metro")
public class MetroEntity {

    @Id
    private int id;

    @Column(name = "metro_source")
    private String metroSource;

    @Column(name = "metro_destination")
    private String metroDestination;

    @Column(name = "min_charge")
    private String minCharge;

    private String city;

    @Column(name = "driver_name")
    private String driverName;
}
