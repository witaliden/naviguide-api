package it.witaliden.naviguideapi.rest.dto;

import lombok.Data;

@Data
public class RouteDTO {
    private Long id;
    private String name;
    private String description;
    private Double startLat;
    private Double startLng;
    private Double endLat;
    private Double endLng;
    private Integer estimatedTime;
    private Double distance;
}