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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author atang
 */
@Entity
@Table(name = "staff")
@NamedQueries({
    @NamedQuery(name = "Staff.findAll", query = "SELECT s FROM Staff s")})
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nip")
    private String nip;
    @Basic(optional = false)
    @Column(name = "nama")
    private String nama;
    @Lob
    @Column(name = "alamat")
    private String alamat;
    
    @OneToOne
    @JoinColumn(name="id_jabatan")
    private Jabatan jabatan;
    
    @Basic(optional = false)
    @Column(name = "jenis_kelamin")
    private boolean jenisKelamin;
    @Column(name = "pendidikan_terakhir")
    private String pendidikanTerakhir;
    @Basic(optional = false)
    @Column(name = "status")
    private String status;

    public Staff() {
    }

    public Staff(Integer id) {
        this.id = id;
    }

    public Staff(Integer id, String nip, String nama, boolean jenisKelamin, String status) {
        this.id = id;
        this.nip = nip;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
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

    public Jabatan getJabatan() {
        return jabatan;
    }

    public void setJabatan(Jabatan jabatan) {
        this.jabatan = jabatan;
    }

    public boolean getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getPendidikanTerakhir() {
        return pendidikanTerakhir;
    }

    public void setPendidikanTerakhir(String pendidikanTerakhir) {
        this.pendidikanTerakhir = pendidikanTerakhir;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(object instanceof Staff)) {
            return false;
        }
        Staff other = (Staff) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presence.model.Staff[ id=" + id + " ]";
    }
    
}
