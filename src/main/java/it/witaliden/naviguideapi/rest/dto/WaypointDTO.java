package it.witaliden.naviguideapi.rest.dto;

import lombok.Data;

@Data
public class WaypointDTO {
    private Long id;
    private String name;
    private String description;
    private Double latitude;
    private Double longitude;
    private Integer orderNumber;
    private String audioUrl;
    private String videoUrl;
    private String additionalInfo;
}
