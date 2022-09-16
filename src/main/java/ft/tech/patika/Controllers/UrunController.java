package ft.tech.patika.Controllers;


import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Entities.UrunYorum;
import ft.tech.patika.Service.UrunService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/urun")
public class UrunController {

    UrunService urunService;

    @Autowired
    public UrunController(UrunService urunService) {
        this.urunService = urunService;
    }



    @GetMapping("/getUrunler")
    public List<Urun> getUrunler(){
        return urunService.getUrunler();

    }



    @GetMapping("/getUrunlerSktGecmeyenler")
    public ArrayList<Urun> getUrunlerSktGecmeyenler(){
        return  urunService.getUrunlerSktGecmeyenler();
    }



    @GetMapping("/getUrunlerSktGecenler")
    public List<Urun> getUrunlerSktGecenler(){
        return urunService.getUrunlerSktGecenler();
    }






}
