package com.eren.OrderOnline.Mapper;

import com.eren.OrderOnline.Dto.request.SiparisSaveRequestDto;
import com.eren.OrderOnline.Dto.response.SiparisFindAllResponseDto;
import com.eren.OrderOnline.Repository.entity.Siparis;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISiparisMapper {

    ISiparisMapper INSTANCE = Mappers.getMapper(ISiparisMapper.class);

    Siparis fromSiparisSaveRequestDto(final SiparisSaveRequestDto dto);

    SiparisFindAllResponseDto fromSiparis(final Siparis siparis);



}
