/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepresenceapp;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import presence.model.Staff;
import presence.model.Staff;

/**
 *
 * @author atang
 */
public class Simplepresenceapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        
        Criteria criteria = session.createCriteria(Staff.class);
        List<Staff> listStaff = criteria.list();
        System.out.println("size of liststaff "+ listStaff.size());
        for (Staff staff : listStaff) {
            System.out.println("Staff: "+ staff.getNama() + ", Jabatan: "+ staff.getJabatan().getNama());
        }
        tx.commit();
        session.close();
    }
    
}
