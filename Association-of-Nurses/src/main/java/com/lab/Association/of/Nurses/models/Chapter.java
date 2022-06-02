package com.lab.Association.of.Nurses.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String district;
    @OneToOne
    @JoinColumn(name = "member")
    private Member president;
    @ManyToOne
    private List<Member> members;

    public Chapter(){

    }

    public Chapter(int id, String name, String district, Member president, List<Member> members) {
        this.id = id;
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Member getPresident() {
        return president;
    }

    public void setPresident(Member president) {
        this.president = president;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }
}
