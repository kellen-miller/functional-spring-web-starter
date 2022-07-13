package org.swiftec.projectcar.backend.routes;

import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

public interface Router {
    
    RouterFunction<ServerResponse> routes();
    
}