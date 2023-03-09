package com.eren.OrderOnline.Dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SiparisFindAllResponseDto {
    private String orderdetails;
    private Double cost;
}
