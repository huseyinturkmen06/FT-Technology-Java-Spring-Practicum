package ft.tech.patika.Controllers;


import ft.tech.patika.Entities.Kullanici;
import ft.tech.patika.Service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kullanici")
public class KullaniciController {

    @Autowired
    KullaniciService kullaniciService;

    @GetMapping("/getKullaniciByKullaniciId")
    public Kullanici getKullaniciByKullaniciId(@RequestParam int kullanici_id){
        return kullaniciService.getKullaniciByKullaniciId(kullanici_id);
    }

}
