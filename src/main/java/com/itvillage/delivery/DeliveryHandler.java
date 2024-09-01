package com.itvillage.delivery;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Component
public class DeliveryHandler {
    public Mono<ServerResponse> getDelivery(ServerRequest request) {
        long orderId = Long.parseLong(request.pathVariable("order-id"));

        return ServerResponse.ok()
                .bodyValue(
                        new Delivery(
                                1L,
                                orderId,
                                1L,
                                Delivery.DeliveryState.COMPLETED,
                                LocalDateTime.now(),
                                LocalDateTime.now()));
    }
}
