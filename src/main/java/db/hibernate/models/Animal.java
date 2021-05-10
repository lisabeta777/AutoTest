package db.hibernate.models;

import javax.persistence.*;

@Entity
@Table(name = "public.animal")
public class Animal {
    @Id
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "age")
    int age;
    @Column(name = "type")
    int type;
    @Column(name = "sex")
    int sex;
    @ManyToOne
    Places places;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Places getPlaces() {
        return places;
    }

    public void setPlaces(Places places) {
        this.places = places;
    }
}
