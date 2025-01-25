package it.witaliden.naviguideapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Waypoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double latitude;
    private Double longitude;
    private Integer orderNumber;
    private String audioUrl;
    private String videoUrl;
    private String additionalInfo;

    @ManyToOne
    @JoinColumn(name = "route_id")
    private Route route;
}