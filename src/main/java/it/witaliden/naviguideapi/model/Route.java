package it.witaliden.naviguideapi.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Double startLat;
    private Double startLng;
    private Double endLat;
    private Double endLng;
    private Integer estimatedTime; // w minutach
    private Double distance; // w kilometrach

    @OneToMany(mappedBy = "route", cascade = CascadeType.ALL)
    private List<Waypoint> waypoints;
}