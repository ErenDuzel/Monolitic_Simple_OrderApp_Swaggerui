package com.eren.OrderOnline.Service;

import com.eren.OrderOnline.Dto.request.MusteriSaveRequestDto;
import com.eren.OrderOnline.Dto.response.MusteriFindAllResponseDto;
import com.eren.OrderOnline.Mapper.IMusteriMapper;
import com.eren.OrderOnline.Repository.IMusteriRepository;
import com.eren.OrderOnline.Repository.entity.Musteri;
import com.eren.OrderOnline.Utility.ServiceManager;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusteriService extends ServiceManager<Musteri,Long> {
    private final IMusteriRepository repository;

    public MusteriService(IMusteriRepository repository) {
        super(repository);
        this.repository= repository;
    }

    public void saveMusteri(MusteriSaveRequestDto dto){
        save(IMusteriMapper.INSTANCE.toMusteri(dto));
    }
    public List<MusteriFindAllResponseDto> findAllMusteri(){
        List<MusteriFindAllResponseDto> musteriList= new ArrayList<>();
        findAll().forEach( x->{
            musteriList.add(IMusteriMapper.INSTANCE.fromMusteri(x));
        });
        return musteriList;
    }
}
