package ft.tech.patika.Repositories;

import ft.tech.patika.Entities.Kullanici;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KullaniciRepository extends JpaRepository<Kullanici,Integer> {

    public Kullanici getKullaniciByKullaniciId(int kullanici_id);

    //servis kodları service katmanı içerisinde

}
