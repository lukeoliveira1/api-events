package com.eventostec.api.domain.coupons;

public record CouponRequestDTO(String code, Integer discount, Long valid) {
}
