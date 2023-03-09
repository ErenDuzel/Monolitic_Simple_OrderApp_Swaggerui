package com.eren.OrderOnline.Mapper;

import com.eren.OrderOnline.Dto.request.RestoranSaveRequestDto;
import com.eren.OrderOnline.Dto.response.RestoranFindAllResponseDto;
import com.eren.OrderOnline.Repository.entity.Restoran;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IRestoranMapper {

    IRestoranMapper INSTANCE = Mappers.getMapper(IRestoranMapper.class);

    Restoran toRestoran(final RestoranSaveRequestDto dto);

    RestoranFindAllResponseDto findAllResponseDto(final Restoran restoran);


}
