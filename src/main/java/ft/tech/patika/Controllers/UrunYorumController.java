package ft.tech.patika.Controllers;


import ft.tech.patika.Entities.Kullanici;
import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Entities.UrunYorum;
import ft.tech.patika.Service.UrunYorumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/urunYorum")
public class UrunYorumController {







    UrunYorumService urunYorumService;

    @Autowired

    public UrunYorumController(UrunYorumService urunYorumService) {
        this.urunYorumService = urunYorumService;
    }

    @GetMapping("/getUrunYorumByUrunId")
    public List<UrunYorum> getUrunYorumByUrunId(@RequestBody Urun urun){
        return urunYorumService.getUrunYorumByUrunId(urun);
    }






    @GetMapping("/getUrunYorumByDateInterval")
    public List<UrunYorum> getUrunYorumByDateInterval(@RequestBody Urun urun,
                                                      @RequestParam String date1,
                                                      @RequestParam String date2){

        return urunYorumService.getUrunYorumByDateInterval(urun,date1,date2);
        //bu olduğu gibi bir listedir
    }




    @GetMapping("/getUrunYorumByKullaniciId")
    public List<UrunYorum> getUrunYorumByKullaniciId(@RequestBody Kullanici kullanici){
        return urunYorumService.getUrunYorumByKullaniciId(kullanici);
    }




    @GetMapping("/getUrunYorumByKullaniciAndDateInterval")
    public List<UrunYorum> getUrunYorumByKullaniciAndDateInterval(@RequestBody Kullanici kullanici,
                                                      @RequestParam String date1,
                                                      @RequestParam String date2){


        return urunYorumService.getUrunYorumByKullaniciAndDateInterval(kullanici,date1,date2);
        //bu olduğu gibi bir listedir
    }



















}
