package org.example;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

public class Tool1 {
    private int id;
    private String name;
    private String address;
    private int age;
    private Mountaineer mountaineer;

    public void setId(String name, String address, int age) throws Exception {
        if (name.length()<3 || address.length()<5 || age<18) throw new Exception("Mountaineer variables exception");
        else {
            mountaineer = new Mountaineer(); mountaineer.setName(name); mountaineer.setAddress(address); mountaineer.setAge(age);
        }
    }

    public void save(EntityManager entityManager){
        entityManager.persist(mountaineer);
    }

    public Mountaineer getMountaineer(){ return mountaineer; }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public int getAge() {
        return age;
    }
}
