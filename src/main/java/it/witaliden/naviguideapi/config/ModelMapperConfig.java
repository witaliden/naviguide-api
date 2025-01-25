package it.witaliden.naviguideapi.config;

import it.witaliden.naviguideapi.model.Route;
import it.witaliden.naviguideapi.rest.dto.RouteDTO;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        modelMapper.typeMap(Route.class, RouteDTO.class).addMappings(mapper -> mapper.map(Route::getWaypoints, RouteDTO::setWaypoints));

        return modelMapper;
    }
}