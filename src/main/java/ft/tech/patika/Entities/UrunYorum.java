package ft.tech.patika.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data       //getter ve setter ları hazır almak için
@Table(name="UrunYorum")
public class UrunYorum {

    @javax.persistence.Id
    private Integer yorumId;

    @Column(name = "yarum_yazisi",length = 500)
    private String yorumYazisi;


    @Column(name = "YorumTarihi")
    @Temporal(TemporalType.DATE)
    private Date yorumTarihi;



    @OneToOne()
    @JoinColumn(name="kullanici_id")
    private Kullanici kullaniciId;
    //burayı postgre otomatik kullanici_id yapar123


    @ManyToOne()  //foreign key bağlandı
    @JoinColumn(name="urun_id")
    private Urun urunId;

    //artık urun tablosundaki urunId kolonu buraya foreign key olarak geldi
    //bu sayede urun tablosunda olmayan bir urun için yorum giremeyiz


}
