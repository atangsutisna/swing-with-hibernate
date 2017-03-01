/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.dao;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import presence.model.Jabatan;
/**
 *
 * @author atang
 */
public class JabatanDao extends AbstractDao<Jabatan, Integer>{
    
    public JabatanDao() {
        super(Jabatan.class);
    }

    @Override
    public List<Jabatan> findAll() {
        List<Jabatan> toReturn;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Criteria criteria = session.createCriteria(Jabatan.class);
        criteria.addOrder(Order.asc("id"));
        toReturn = criteria.list();
        
        tx.commit();
        session.close();
        
        return toReturn;
    }
    
    
    
}
