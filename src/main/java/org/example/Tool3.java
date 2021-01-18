package org.example;

import javax.persistence.EntityManager;

public class Tool3 {
    private String name;
    private String country;
    private int height;
    private Mountain mountain;


    public void setName(String name, String country, int height) throws Exception {
        if (name.length()<4 || country.length()<4 || height<100) throw new Exception("Mountain variables exception");
        else {
            mountain = new Mountain(); mountain.setCountry(country); mountain.setName(name); mountain.setHeight(height);
        }
    }

    public void save(EntityManager entityManager){
        entityManager.persist(mountain);
    }

    public String getName() {
        return name;
    }
    public String getCountry() {
        return country;
    }
    public int getHeight() {
        return height;
    }
    public Mountain getMountain() { return mountain;}
}
