package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Mountaineer")
public class Mountaineer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //@Column(name = "name")
    private String name;
    //@Column(name = "address")
    private String address;
    //@Column(name = "age")
    private int age;

    @ManyToMany
    @JoinTable(name = "join_t",joinColumns = {@JoinColumn(name = "idn")},inverseJoinColumns = {@JoinColumn(name = "id")})
    private List<Groups> gl = new ArrayList<>();

    public List<Groups> getGl() {
        return gl;
    }

    public void setGl(List<Groups> gl) {
        this.gl = gl;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
