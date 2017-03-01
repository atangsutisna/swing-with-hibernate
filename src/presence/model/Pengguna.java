/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author atang
 */
@Entity
@Table(name = "pengguna")
@NamedQueries({
    @NamedQuery(name = "Pengguna.findAll", query = "SELECT p FROM Pengguna p")})
public class Pengguna implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id_pengguna")
    private Integer idPengguna;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "peran")
    private String peran;
    @Basic(optional = false)
    @Column(name = "status")
    private boolean status;
    @Basic(optional = false)
    @Column(name = "terakhir_loggedin")
    @Temporal(TemporalType.DATE)
    private Date terakhirLoggedin;

    public Pengguna() {
    }

    public Pengguna(Integer idPengguna) {
        this.idPengguna = idPengguna;
    }

    public Pengguna(Integer idPengguna, String username, String password, String peran, boolean status, Date terakhirLoggedin) {
        this.idPengguna = idPengguna;
        this.username = username;
        this.password = password;
        this.peran = peran;
        this.status = status;
        this.terakhirLoggedin = terakhirLoggedin;
    }

    public Integer getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(Integer idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPeran() {
        return peran;
    }

    public void setPeran(String peran) {
        this.peran = peran;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getTerakhirLoggedin() {
        return terakhirLoggedin;
    }

    public void setTerakhirLoggedin(Date terakhirLoggedin) {
        this.terakhirLoggedin = terakhirLoggedin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPengguna != null ? idPengguna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pengguna)) {
            return false;
        }
        Pengguna other = (Pengguna) object;
        if ((this.idPengguna == null && other.idPengguna != null) || (this.idPengguna != null && !this.idPengguna.equals(other.idPengguna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "presence.model.Pengguna[ idPengguna=" + idPengguna + " ]";
    }
    
}
