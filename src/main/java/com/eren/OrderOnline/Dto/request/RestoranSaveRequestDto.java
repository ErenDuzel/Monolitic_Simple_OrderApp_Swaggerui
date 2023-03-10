package com.eren.OrderOnline.Dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RestoranSaveRequestDto {
    private String name;
    private String adress;
    private String Menu;
}
