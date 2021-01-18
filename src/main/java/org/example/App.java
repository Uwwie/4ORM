package org.example;

import org.hibernate.Hibernate;
import org.hibernate.Session;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class App 
{
    public static void main( String[] args ) throws Exception {
        Tool3 t3 = new Tool3();
        t3.setName("Mount1","Count1",3000);
        Tool1 t1 = new Tool1();
        t1.setId("Vanya","Roskostreet",60);
        Tool2 t2 = new Tool2();
        t2.setId(t3,"10 sep","11 sep",false,t1);
        Tool2 t4 = new Tool2();
        t4.setId(t3,"15 sep","17 sep",true,t1);
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("jpa");
        EntityManager entityManager = managerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        t1.save(entityManager);
        t2.save(entityManager);
        t4.save(entityManager);
        t3.save(entityManager);

        entityManager.getTransaction().commit();

        SortTables st = new SortTables();
        st.StartSearch(1,entityManager,10,70,"Mount1","Count1");

        entityManager.close();


    }
}
