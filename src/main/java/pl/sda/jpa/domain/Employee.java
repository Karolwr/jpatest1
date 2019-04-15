package pl.sda.jpa.domain;

import javax.persistence.*;
import java.math.BigDecimal;

//@Entity sprawia, że tworzy tą klase jako tablice w bazie mysql
@Entity
//tablica zmienia nazwe a pracownicy
@Table (name = "pracownicy")
public class Employee {
    //to pole to jest nasz klucz:)
    @Id//to jest klucz
    @GeneratedValue//samo ustawia ID
    private long id;
    @Column(name = "imie", columnDefinition = "VARCHAR(45) NOT NULL")//COLUMDEFINITIONTO COŚ USTAWIA TAK JAK W BASIE DANYCH
    private String firstName;
    @Column (name = "nazwisko",nullable = false)
    private String lastName;


    @Column(name = "wynagrodzenie")
    private double salary;

  //  private BigDecimal premia;
    @Column(precision = 7, scale = 2)
    private float premia;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public float getPremia() {
        return premia;
    }

    public void setPremia(float premia) {
        this.premia = premia;
    }

}
