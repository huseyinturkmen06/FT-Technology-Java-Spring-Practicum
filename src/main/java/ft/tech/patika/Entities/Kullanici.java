package ft.tech.patika.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data       //getter ve setter ları hazır almak için
@Table(name="Kullanıcı")
public class Kullanici {

    @Id

    private int kullaniciId;   //null da olamazsın diye Integer (primitive type) değil int verdim

    @Column(name = "Adı",length = 50)
    private String name;

    @Column(name = "Soyadı", length = 50)
    private String surname;

    @Email
    @Column(name = "Email",length = 50)
    private String email;

    @Column(name = "telefon",length = 15)
    private String telephone;




}
