/*
package com.arnav;

import com.arnav.pojo.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//main class to update values to database
public class AddValuesToDatabase
{
    public static void main( String[] args )
    {
        Alien arnav = new Alien();
        arnav.setAlienID(101);
        arnav.setAlienName("bonny");
        arnav.setColor("GREEN");


        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        //no need to mention config xml file name in configure() as it is default
        //addAnnotatedClass() to attach the POJO class which it will interact with
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession(); //create object of session for a particular logical transaction
        Transaction tx = session.beginTransaction();
        session.save(arnav);
        tx.commit();
    }
}
*/
