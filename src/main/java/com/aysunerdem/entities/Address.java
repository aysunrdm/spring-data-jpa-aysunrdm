package com.aysunerdem.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private int id;
    private String street;
    private String number;
    private String city;
    private int zipcode;

    public Address(int id, String street, String number, String city, int zipcode, User user) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.city = city;
        this.zipcode = zipcode;
        this.user = user;
    }

    @OneToOne(mappedBy = "address_id")
    private User user;

    public Address() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", user=" + user +
                '}';
    }

    public void setName(String user) {
    }
}

