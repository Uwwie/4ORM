package org.example;

import org.hibernate.Session;

import javax.persistence.EntityManager;
import java.util.List;

public class SortTables {
    List<Mountain> ml;
    List<Groups> groups;
    List<Mountaineer> mountaineer;
    public void StartSearch(int id, EntityManager entityManager, int fage, int tage, String mname, String cname) {
        switch (id) {
            case 1: mountaineer = FindTables.loadAllData(Mountaineer.class,entityManager);
                for (Mountaineer mr1 : mountaineer) {
                    if (mr1.getAge()>=fage && mr1.getAge()<=tage) {
                        System.out.println("name "+mr1.getName());
                        System.out.println("address "+mr1.getAddress());
                    }
                }
                break;
            case 2: groups = FindTables.loadAllData(Groups.class,entityManager);
                for (Groups group : groups) {
                    if (group.getMountain().equals(mname)) {
                        System.out.println("id "+ group.getId());
                        System.out.println("Date of departure "+group.getDod());
                        System.out.println("Date of arrival "+group.getDoe());
                        mountaineer = group.getMl();
                        for (Mountaineer mr : mountaineer) {System.out.println(mr.getName());}
                    }
                }
                break;
            case 3: ml = FindTables.loadAllData(Mountain.class, entityManager);
                for (Mountain mountain : ml) {
                    if (mountain.getName().equals(mname)) System.out.println(mountain.getCountry());
                }
                break;
            case 4: groups = FindTables.loadAllData(Groups.class,entityManager);
                for (Groups group : groups) {
                    if (group.isAccess()) {
                        System.out.println("id "+ group.getId());
                        System.out.println("Date of departure "+group.getDod());
                        System.out.println("Date of arrival "+group.getDoe());
                        mountaineer = group.getMl();
                        for (Mountaineer mr : mountaineer) {System.out.println(mr.getName());}
                    }
                }
        }
    }
}
