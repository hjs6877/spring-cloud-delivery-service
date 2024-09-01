package com.itvillage.delivery;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Delivery {
    private Long deliveryId;
    private Long orderId;
    private Long deliveryRiderId;
    private DeliveryState deliveryState;
    private LocalDateTime deliveryStartTime;
    private LocalDateTime deliveryEndTime;

    @Getter
    public enum DeliveryState {
        PENDING("배달 대기 중"),
        CANCELED("배달 취소"),
        IN_DELIVERY("배달 중"),
        COMPLETED("배달 완료");

        private final String deliveryState;

        DeliveryState(String deliveryState) {
            this.deliveryState = deliveryState;
        }
    }
}
