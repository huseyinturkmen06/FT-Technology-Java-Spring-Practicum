package ft.tech.patika.Repositories;

import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Entities.UrunYorum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UrunRepository extends JpaRepository<Urun,Integer> {

    //servis kodları service katmanı içerisinde


}
