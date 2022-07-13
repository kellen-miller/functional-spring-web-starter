package org.swiftec.projectcar.backend.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import org.swiftec.projectcar.backend.entities.ReviewEntity;
import org.swiftec.projectcar.backend.models.Review;
import org.swiftec.projectcar.backend.repositories.ReviewRepository;


@Service
public class ReviewHandlers {

    private ReviewRepository reviewRepository;
    public HandlerFunction<ServerResponse> getAllReviews = (ServerRequest request) ->
            ServerResponse.ok().body(reviewRepository.findAll());
    public HandlerFunction<ServerResponse> saveReview = (ServerRequest request) -> {
        var reviewModel = request.body(Review.class);
        var reviewEntity = new ReviewEntity();
        BeanUtils.copyProperties(reviewModel, reviewEntity);
        return ServerResponse.ok().body(reviewRepository.save(reviewEntity));
    };

    public ReviewHandlers(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
}
