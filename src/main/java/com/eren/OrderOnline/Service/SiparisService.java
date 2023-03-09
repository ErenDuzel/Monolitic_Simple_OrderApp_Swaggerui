package com.eren.OrderOnline.Service;

import com.eren.OrderOnline.Dto.request.SiparisSaveRequestDto;
import com.eren.OrderOnline.Dto.response.SiparisFindAllResponseDto;
import com.eren.OrderOnline.Mapper.ISiparisMapper;
import com.eren.OrderOnline.Repository.ISiparisRepository;
import com.eren.OrderOnline.Repository.entity.Siparis;
import com.eren.OrderOnline.Utility.ServiceManager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SiparisService extends ServiceManager<Siparis,Long> {

    private final ISiparisRepository repository;

    public SiparisService(ISiparisRepository repository) {
        super(repository);
        this.repository = repository;
    }

    public void saveSiparis(SiparisSaveRequestDto dto) {
        save(ISiparisMapper.INSTANCE.fromSiparisSaveRequestDto(dto));
    }
    public List<SiparisFindAllResponseDto> findAllSiparis(){
        List<SiparisFindAllResponseDto> siparisList = new ArrayList<>();
        findAll().forEach( z->{
            siparisList.add(ISiparisMapper.INSTANCE.fromSiparis(z));
        });
        return siparisList;
    }
}
