package com.eren.OrderOnline.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestoranFindAllResponseDto {
    private String name;
    private Double point;
    private String adress;
}
