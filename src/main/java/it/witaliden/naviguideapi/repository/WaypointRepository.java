package it.witaliden.naviguideapi.repository;

import it.witaliden.naviguideapi.model.Waypoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WaypointRepository extends JpaRepository<Waypoint, Long> {
    List<Waypoint> findByRouteIdOrderByOrderNumber(Long id);
}
