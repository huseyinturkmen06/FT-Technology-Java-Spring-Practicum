package ft.tech.patika.Service;


import ft.tech.patika.Entities.Kullanici;
import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Entities.UrunYorum;
import ft.tech.patika.Repositories.UrunYorumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UrunYorumService {

    UrunYorumRepository urunYorumRepository;

    @Autowired
    public UrunYorumService(UrunYorumRepository urunYorumRepository) {
        this.urunYorumRepository = urunYorumRepository;
    }


    public List<UrunYorum> getAll(){
        return urunYorumRepository.findAll();
    }




//Görev 1: Bir ürüne ait yorumları listeleyen bir metot yazınız.
    public List<UrunYorum> getUrunYorumByUrunId(Urun urun){
        return urunYorumRepository.getUrunYorumByUrunId(urun);
    }



//Görev 2: Verilen tarih aralıklarında belirli bir ürüne yapılmış olan yorumları gösteren bir metot yazınız.
    public List<UrunYorum> getUrunYorumByDateInterval( Urun urun,
                                                       String date1,
                                                       String date2){
        Date testDate;
        Date startDate = java.sql.Date.valueOf(LocalDate.parse(date1));
        Date endDate = java.sql.Date.valueOf(LocalDate.parse(date2));
        //local date i date e çevirdim
        ArrayList<UrunYorum> aralıktakiler= new ArrayList<>();

        for(UrunYorum yorum:urunYorumRepository.getUrunYorumByUrunId(urun)){
            testDate=yorum.getYorumTarihi();
            //zaten date olarak geldiği için bu sefer parse felan etmeye gerek kalmadı

            if(isWithinRange(testDate,startDate,endDate)){
                aralıktakiler.add(yorum);
            }

        }
        return aralıktakiler;
        //bu olduğu gibi bir listedir
    }



//Görev 3: Bir kullanıcının yapmış olduğu yorumları listeleyen bir metot yazınız.
    public List<UrunYorum> getUrunYorumByKullaniciId(Kullanici kullanici){
        return urunYorumRepository.getUrunYorumByKullaniciId(kullanici);
    }





//görev 4: Bir kullanıcının belirli tarihler aralığında yapmış olduğu yorumları gösteren bir metot yazınız.
    boolean isWithinRange(Date testDate,Date startDate,Date endDate) {
        return !(testDate.before(startDate) || testDate.after(endDate));
    }


    public List<UrunYorum> getUrunYorumByKullaniciAndDateInterval( Kullanici kullanici,
                                                                   String date1,
                                                                   String date2){
        Date testDate;
        Date startDate = java.sql.Date.valueOf(LocalDate.parse(date1));
        Date endDate = java.sql.Date.valueOf(LocalDate.parse(date2));
        //local date i date e çevirdim
        ArrayList<UrunYorum> aralıktakiler= new ArrayList<>();

        for(UrunYorum yorum:urunYorumRepository.getUrunYorumByKullaniciId(kullanici)){
            testDate=yorum.getYorumTarihi();
            //zaten date olarak geldiği için bu sefer parse felan etmeye gerek kalmadı

            if(isWithinRange(testDate,startDate,endDate)){
                aralıktakiler.add(yorum);

            }
        }
        return aralıktakiler;
        //bu olduğu gibi bir listedir
    }










}
