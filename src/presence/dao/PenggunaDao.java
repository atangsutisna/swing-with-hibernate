/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.dao;

import java.io.Serializable;
import presence.model.Pengguna;
import presence.model.Staff;

/**
 *
 * @author atang
 */
public class PenggunaDao extends AbstractDao<Pengguna, Integer>{
    
    public PenggunaDao() {
        super(Pengguna.class);
    }
    
}
