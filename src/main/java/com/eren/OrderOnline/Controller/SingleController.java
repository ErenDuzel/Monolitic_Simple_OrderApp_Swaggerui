package com.eren.OrderOnline.Controller;


import com.eren.OrderOnline.Dto.request.MusteriSaveRequestDto;
import com.eren.OrderOnline.Dto.request.RestoranSaveRequestDto;
import com.eren.OrderOnline.Dto.request.SiparisSaveRequestDto;
import com.eren.OrderOnline.Dto.response.MusteriFindAllResponseDto;
import com.eren.OrderOnline.Dto.response.RestoranFindAllResponseDto;
import com.eren.OrderOnline.Repository.entity.Musteri;
import com.eren.OrderOnline.Service.MusteriService;
import com.eren.OrderOnline.Service.RestoranService;
import com.eren.OrderOnline.Service.SiparisService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class SingleController {

    private final MusteriService musteriService;
    private final RestoranService restoranService;
    private final SiparisService siparisService;

    @PostMapping("/savemusteri")
    public void saveMusteri(MusteriSaveRequestDto dto) {
        musteriService.saveMusteri(dto);
    }

    @GetMapping("/findallmusteri")
    public void findAllMusteri() {
        musteriService.findAllMusteri();
    }

    @PostMapping("/saverestoran")
    public void saveRestoran(RestoranSaveRequestDto dto) {
        restoranService.saveRestoran(dto);
    }

    @GetMapping("/findallrestoran")
    public void findAllRestoran() {
        restoranService.findAllRestoran();
    }
    @PostMapping("/savesiparis")
    public void saveSiparis(SiparisSaveRequestDto dto){
        siparisService.saveSiparis(dto);
    }
    @GetMapping("findallsiparis")
    public void findAllSiparis(){
        siparisService.findAllSiparis();
    }



}
