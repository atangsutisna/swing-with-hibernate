/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author atang
 */
@Entity
@Table(name = "siswa")
@NamedQueries({
    @NamedQuery(name = "Siswa.findAll", query = "SELECT s FROM Siswa s")})
public class Siswa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nomor_induk")
    private String nomorInduk;
    @Basic(optional = false)
    @Column(name = "nama_lengkap")
    private String namaLengkap;
    @Lob
    @Column(name = "alamat")
    private String alamat;
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private boolean jenisKelamin;

    public Siswa() {
    }

    public Siswa(Integer id) {
        this.id = id;
    }

    public Siswa(Integer id, String nomorInduk, String namaLengkap, boolean jenisKelamin) {
        this.id = id;
        this.nomorInduk = nomorInduk;
        this.namaLengkap = namaLengkap;
        this.jenisKelamin = jenisKelamin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public void setNomorInduk(String nomorInduk) {
        this.nomorInduk = nomorInduk;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public void setNamaLengkap(String namaLengkap) {
        this.namaLengkap = namaLengkap;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siswa)) {
            return false;
        }
        Siswa other = (Siswa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presence.model.Siswa[ id=" + id + " ]";
    }
    
}
