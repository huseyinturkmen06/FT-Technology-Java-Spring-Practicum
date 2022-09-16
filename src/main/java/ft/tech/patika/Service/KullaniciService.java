package ft.tech.patika.Service;


import ft.tech.patika.Entities.Kullanici;
import ft.tech.patika.Repositories.KullaniciRepository;
import org.springframework.stereotype.Service;

@Service
public class KullaniciService {

    KullaniciRepository kullaniciRepository;

    public KullaniciService(KullaniciRepository kullaniciRepository) {
        this.kullaniciRepository = kullaniciRepository;
    }

    public Kullanici getKullaniciByKullaniciId(int kullanici_id){
        return kullaniciRepository.getKullaniciByKullaniciId(kullanici_id);
    }
}
