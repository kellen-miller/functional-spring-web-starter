package org.swiftec.projectcar.backend.services;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.HandlerFunction;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;
import org.swiftec.projectcar.backend.entities.AuthorEntity;
import org.swiftec.projectcar.backend.models.Author;
import org.swiftec.projectcar.backend.repositories.AuthorRepository;

@Service
public class AuthorHandlers {

    private AuthorRepository authorRepository;
    public HandlerFunction<ServerResponse> getAllAuthors = (ServerRequest request) ->
            ServerResponse.ok().body(authorRepository.findAll());
    public HandlerFunction<ServerResponse> saveAuthor = (ServerRequest request) -> {
        var authorModel = request.body(Author.class);
        var authorEntity = new AuthorEntity();
        BeanUtils.copyProperties(authorModel, authorEntity);
        return ServerResponse.ok().body(authorRepository.save(authorEntity));
    };

    public AuthorHandlers(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
}