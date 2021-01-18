package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "Groups")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    //@Column(name = "mountain")
    private String mountain;
    //@Column(name = "availability")
    private boolean access;
    //@Column(name = "dateofdeparture")
    private String dod;
    //@Column(name = "durationofevent")
    private String doe;

    @ManyToMany
    @JoinTable(name = "join_t",joinColumns = {@JoinColumn(name = "id")},inverseJoinColumns = {@JoinColumn(name = "idn")})
    private List<Mountaineer> ml = new ArrayList<>();

    public List<Mountaineer> getMl() {
        return ml;
    }

    public void setMl(List<Mountaineer> ml) {
        this.ml = ml;
    }

    public int getId() {
        return id;
    }


    public boolean isAccess() {
        return access;
    }

    public void setAccess(boolean access) {
        this.access = access;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public String getDoe() {
        return doe;
    }

    public void setDoe(String doe) {
        this.doe = doe;
    }

    public String getMountain() {
        return mountain;
    }

    public void setMountain(Mountain mountain) {
        this.mountain = mountain.getName();
    }
}
