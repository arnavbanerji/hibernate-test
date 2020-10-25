package com.arnav;

import com.arnav.pojo.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

//main class to update values to database
public class GetValuesFromDatabase
{
    public static void main( String[] args )
    {
        Alien arnav = new Alien();
        //Alien arnav = null; you can also specify as it is only used to get the data

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        //no need to mention config xml file name in configure() as it is default
        //addAnnotatedClass() to attach the POJO class which it will interact with
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession(); //create object of session for a particular logical transaction
        Transaction tx = session.beginTransaction();

        arnav = (Alien) session.get(Alien.class, 101); //second argument - specify primary key

        tx.commit();
    }
}
