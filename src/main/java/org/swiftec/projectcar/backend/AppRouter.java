package org.swiftec.projectcar.backend;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.swiftec.projectcar.backend.routes.Router;

import java.util.List;

import static org.springframework.web.servlet.function.RouterFunctions.route;


@Configuration
public class AppRouter {

    private final List<Router> routers;

    public AppRouter(List<Router> routers) {
        this.routers = routers;
    }

    @Bean
    public RouterFunction<ServerResponse> router() {
        return route()
                .path("/api", builder ->
                        routers.stream()
                                .map(Router::routes)
                                .forEach(builder::add))
                .build();
    }
}