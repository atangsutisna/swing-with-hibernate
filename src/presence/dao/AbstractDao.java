/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presence.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import simplepresenceapp.HibernateUtil;

/**
 *
 * @author atang
 */
public class AbstractDao<E, I extends Serializable> {
    private final Class<E> entity;
    
    protected AbstractDao(Class<E> entity) {
        this.entity = entity;
    }
    
    protected Session getSession() {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        return sessionFactory.openSession();
    }
    
    public List<E> findAll() {
        List<E> toReturn;
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        Criteria criteria = session.createCriteria(entity);
        toReturn = criteria.list();
        
        tx.commit();
        session.close();
        
        return toReturn;
    }
    
    public E findOne(I id) {
        return (E) getSession().get(entity, id);
    }
    
    public void insert(E e) {
        Session session = getSession();
        Transaction tx = session.beginTransaction();
        session.save(e);
        tx.commit();
        session.close();
    }
    
    public void update(E e) {
        getSession().merge(e);
    }


}
