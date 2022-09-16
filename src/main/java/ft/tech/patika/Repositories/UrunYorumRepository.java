package ft.tech.patika.Repositories;

import ft.tech.patika.Entities.Kullanici;
import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Entities.UrunYorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunYorumRepository extends JpaRepository<UrunYorum,Integer> {

    public List<UrunYorum> getUrunYorumByUrunId(Urun urun);
    //dış class lardan da erişilebilsin diye

    public List<UrunYorum> getUrunYorumByKullaniciId(Kullanici kullanici);

    //servis kodları service katmanı içerisinde

}
