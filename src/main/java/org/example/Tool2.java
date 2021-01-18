package org.example;

import javax.persistence.EntityManager;

public class Tool2 {
    private int id;
    private String mountain;
    private boolean access;
    private String dod;
    private String doe;
    private Groups groups;

    public void setId(Tool3 t3, String dod, String doe, boolean access, Tool1 t1) {
        groups = new Groups();
        groups.setMountain(t3.getMountain());
        groups.setDod(dod); groups.setDoe(doe);
        groups.setAccess(access);
        groups.getMl().add(t1.getMountaineer());
    }

    public void save(EntityManager entityManager){
        entityManager.persist(groups);
    }
    public boolean isAccess() {
        return access;
    }
    public String getDod() {
        return dod;
    }
    public String getDoe() {
        return doe;
    }
    public int getId() {
        return id;
    }
    public Groups getGroups(){
        return groups;
    }
}
