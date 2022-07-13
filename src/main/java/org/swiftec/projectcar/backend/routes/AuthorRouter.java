package org.swiftec.projectcar.backend.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.swiftec.projectcar.backend.services.AuthorHandlers;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RequestPredicates.POST;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@Controller
public class AuthorRouter implements Router {

    private final AuthorHandlers authorHandlers;

    public AuthorRouter(AuthorHandlers authorHandlers) {
        this.authorHandlers = authorHandlers;
    }

    @Override
    public RouterFunction<ServerResponse> routes() {
        return route()
                .path("/author", builder -> builder
                        .route(GET(""), authorHandlers.getAllAuthors)
                        .route(POST(""), authorHandlers.saveAuthor))
                .build();
    }
}