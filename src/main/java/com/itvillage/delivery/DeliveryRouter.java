package com.itvillage.delivery;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class DeliveryRouter {
    @Bean
    public RouterFunction<?> routeOrder(DeliveryHandler handler) {
        return route()
                .GET("/orders/{order-id}/deliveries", handler::getDelivery)
                .build();
    }
}
