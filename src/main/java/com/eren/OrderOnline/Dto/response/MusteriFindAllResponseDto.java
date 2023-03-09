package com.eren.OrderOnline.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class MusteriFindAllResponseDto {
    String name;
    String surname;
    String adres;
    String email;
    String phonenumber;


}
