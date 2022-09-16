package ft.tech.patika.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data       //getter ve setter ları hazır almak için
@Table(name="Urun")
public class Urun {

    @Id
    private int urunId;

    @Column(name = "Adı")
    private String urunAdi;

    @Column(name = "Fiyat")
    private Integer fiyat;

    @Nullable
    @Column(name = "Son_Kullanma_Tarihi")
    @Temporal(TemporalType.DATE)
    private Date sonKullanmaTarihi;





}
