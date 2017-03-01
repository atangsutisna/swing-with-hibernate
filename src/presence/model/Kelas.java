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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author atang
 */
@Entity
@Table(name = "kelas")
@NamedQueries({
    @NamedQuery(name = "Kelas.findAll", query = "SELECT k FROM Kelas k")})
public class Kelas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "id_wali_kelas")
    private Integer idWaliKelas;
    @Basic(optional = false)
    @Column(name = "nama_kelas")
    private String namaKelas;
    @Basic(optional = false)
    @Column(name = "tahun_ajaran")
    private String tahunAjaran;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;

    public Kelas() {
    }

    public Kelas(Integer id) {
        this.id = id;
    }

    public Kelas(Integer id, String namaKelas, String tahunAjaran, boolean status) {
        this.id = id;
        this.namaKelas = namaKelas;
        this.tahunAjaran = tahunAjaran;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdWaliKelas() {
        return idWaliKelas;
    }

    public void setIdWaliKelas(Integer idWaliKelas) {
        this.idWaliKelas = idWaliKelas;
    }

    public String getNamaKelas() {
        return namaKelas;
    }

    public void setNamaKelas(String namaKelas) {
        this.namaKelas = namaKelas;
    }

    public String getTahunAjaran() {
        return tahunAjaran;
    }

    public void setTahunAjaran(String tahunAjaran) {
        this.tahunAjaran = tahunAjaran;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
        if (!(object instanceof Kelas)) {
            return false;
        }
        Kelas other = (Kelas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presence.model.Kelas[ id=" + id + " ]";
    }
    
}
