package Dialog;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member_gym")
public class MemberGym {

    @Id
    @Column(name = "id_member")
    private String idMember;

    @Column(name = "nama")
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @ManyToOne
    @JoinColumn(name = "id_paket")   // foreign key
    private PaketGym paket;

    public MemberGym() {}

    // ===== Getter & Setter =====
    public String getIdMember() {
        return idMember;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public PaketGym getPaket() {
        return paket;
    }

    public void setPaket(PaketGym paket) {
        this.paket = paket;
    }
}
