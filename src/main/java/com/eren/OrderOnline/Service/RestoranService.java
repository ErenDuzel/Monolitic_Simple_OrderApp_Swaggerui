package com.eren.OrderOnline.Service;


import com.eren.OrderOnline.Dto.request.RestoranSaveRequestDto;
import com.eren.OrderOnline.Dto.response.RestoranFindAllResponseDto;
import com.eren.OrderOnline.Mapper.IRestoranMapper;
import com.eren.OrderOnline.Repository.IRestoranRepository;
import com.eren.OrderOnline.Repository.entity.Restoran;
import com.eren.OrderOnline.Utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestoranService extends ServiceManager<Restoran,Long> {

    private final IRestoranRepository repository;

    public RestoranService(IRestoranRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public void saveRestoran(RestoranSaveRequestDto dto){
        save(IRestoranMapper.INSTANCE.toRestoran(dto));
    }

    public List<RestoranFindAllResponseDto> findAllRestoran(){
        List<RestoranFindAllResponseDto> restoranList = new ArrayList<>();
        findAll().forEach(x->{
            restoranList.add(IRestoranMapper.INSTANCE.findAllResponseDto(x));
        });
        return restoranList;
    }
}
