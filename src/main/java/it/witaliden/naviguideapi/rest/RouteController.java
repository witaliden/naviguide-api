package it.witaliden.naviguideapi.rest;

import it.witaliden.naviguideapi.model.Route;
import it.witaliden.naviguideapi.model.Waypoint;
import it.witaliden.naviguideapi.repository.RouteRepository;
import it.witaliden.naviguideapi.repository.WaypointRepository;
import it.witaliden.naviguideapi.rest.dto.RouteDTO;
import it.witaliden.naviguideapi.rest.dto.RouteDetailsDTO;
import it.witaliden.naviguideapi.rest.dto.WaypointDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/routes")
@CrossOrigin(origins = "*")
public class RouteController {

    private final RouteRepository routeRepository;
    private final WaypointRepository waypointRepository;
    private final ModelMapper modelMapper;

    public RouteController(RouteRepository routeRepository,
                           WaypointRepository waypointRepository,
                           ModelMapper modelMapper) {
        this.routeRepository = routeRepository;
        this.waypointRepository = waypointRepository;
        this.modelMapper = modelMapper;
    }

    @GetMapping
    public ResponseEntity<List<RouteDTO>> getAllRoutes() {
        List<Route> routes = routeRepository.findAll();
        List<RouteDTO> routeDTOs = routes.stream()
                .map(route -> modelMapper.map(route, RouteDTO.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(routeDTOs);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RouteDetailsDTO> getRouteDetails(@PathVariable Long id) {
        Optional<Route> route = routeRepository.findById(id);
        if (route.isPresent()) {
            RouteDetailsDTO routeDTO = modelMapper.map(route.get(), RouteDetailsDTO.class);
            return ResponseEntity.ok(routeDTO);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}/waypoints")
    public ResponseEntity<List<WaypointDTO>> getRouteWaypoints(@PathVariable Long id) {
        List<Waypoint> waypoints = waypointRepository.findByRouteIdOrderByOrderNumber(id);
        if (!waypoints.isEmpty()) {
            List<WaypointDTO> waypointDTOs = waypoints.stream()
                    .map(waypoint -> modelMapper.map(waypoint, WaypointDTO.class))
                    .collect(Collectors.toList());
            return ResponseEntity.ok(waypointDTOs);
        }
        return ResponseEntity.notFound().build();
    }
}
