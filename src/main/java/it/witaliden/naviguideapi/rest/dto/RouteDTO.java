package it.witaliden.naviguideapi.rest.dto;

import java.util.List;

public class RouteDTO {
    private Long id;
    private String name;
    private String description;
    private List<WaypointDTO> waypoints;

    public RouteDTO() {
    }

    public RouteDTO(Long id, String name, String description, List<WaypointDTO> waypoints) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.waypoints = waypoints;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WaypointDTO> getWaypoints() {
        return waypoints;
    }

    public void setWaypoints(List<WaypointDTO> waypoints) {
        this.waypoints = waypoints;
    }
}