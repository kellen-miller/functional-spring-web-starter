package org.swiftec.projectcar.backend.routes;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;
import org.swiftec.projectcar.backend.services.ReviewHandlers;

import static org.springframework.web.servlet.function.RequestPredicates.GET;
import static org.springframework.web.servlet.function.RequestPredicates.POST;
import static org.springframework.web.servlet.function.RouterFunctions.route;

@Controller
public class ReviewRouter implements Router {

    private final ReviewHandlers reviewHandlers;

    public ReviewRouter(ReviewHandlers reviewHandlers) {
        this.reviewHandlers = reviewHandlers;
    }

    @Override
    public RouterFunction<ServerResponse> routes() {
        return route()
                .path("/review", builder -> builder
                        .route(GET(""), reviewHandlers.getAllReviews)
                        .route(POST(""), reviewHandlers.saveReview))
                .build();
    }
}