package ft.tech.patika.Service;

import ft.tech.patika.Entities.Urun;
import ft.tech.patika.Repositories.UrunRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class UrunService {

    UrunRepository urunRepository;

    @Autowired
    public UrunService(UrunRepository urunRepository) {
        this.urunRepository = urunRepository;
    }


    public List<Urun> getUrunler(){
        return urunRepository.findAll();
    }




//Görev 6: Son kullanma tarihi geçmemiş ürünleri listeleyen bir metot yazınız.
// (Son kullanma tarihi boş olanlar da gelmeli.)
    boolean sktKontrol(Date currentDate, Date skt) {
        return skt.after(currentDate);
        //true döner ise skt geçmedi demektir
        //skt anlık tarihten sonra ise daha tazedir
    }


    public ArrayList<Urun> getUrunlerSktGecmeyenler(){

        Date testDate;
        Date currentDate=java.sql.Date.valueOf((LocalDate.now()));

        //local date i date e çevirdim

        ArrayList<Urun> aralıktakiler= new ArrayList<>();
        ArrayList<Urun> aralikdaOlmayanlar= new ArrayList<>();

        for(Urun urun:getUrunler()){
            testDate=urun.getSonKullanmaTarihi();
            //zaten date olarak geldiği için bu sefer parse felan etmeye gerek kalmadı


            if(testDate==null){    //skt==null ise de tarihi gecmemis demektir
                aralıktakiler.add(urun);
            }
            else{
                //--------------------------
                if(sktKontrol(currentDate,testDate)){
                    aralıktakiler.add(urun);
                    //skt geçmeyenler
                }
                else{
                    aralikdaOlmayanlar.add(urun);

                }
                //--------------------------

            }
        }

        System.out.println(aralıktakiler);
        return  aralıktakiler;

    }


//Görev 5: Son kullanma tarihi geçmiş ürünleri listeleyen bir metot yazınız.
    public List<Urun> getUrunlerSktGecenler(){

        List<Urun> tumUrunler=getUrunler();
        tumUrunler.removeAll(getUrunlerSktGecmeyenler());
        //listenin farkını alma
        //aynı kodu tekrar yazmamak için bunu yaptım
        return tumUrunler;
    }







}
