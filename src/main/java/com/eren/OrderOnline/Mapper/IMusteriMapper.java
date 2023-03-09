package com.eren.OrderOnline.Mapper;


import com.eren.OrderOnline.Dto.request.MusteriSaveRequestDto;
import com.eren.OrderOnline.Dto.response.MusteriFindAllResponseDto;
import com.eren.OrderOnline.Repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMusteriMapper {

    IMusteriMapper INSTANCE = Mappers.getMapper(IMusteriMapper.class);

    Musteri toMusteri(final MusteriSaveRequestDto dto);
    MusteriFindAllResponseDto fromMusteri(final Musteri musteri);
}
