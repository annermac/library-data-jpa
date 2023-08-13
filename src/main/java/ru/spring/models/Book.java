package ru.spring.models;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Entity
@Table(name = "book", schema = "public")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Поле название не должно быть пустым!")
    @Size(min = 3, max = 100, message = "Проверьте правильность ввода названия!")
    @Column(name = "title")
    private String title;

    @NotEmpty(message = "Поле автор не должно быть пустым!")
    @Size(min = 3, max = 100, message = "Проверьте правильность ввода автора!")
    @Column(name = "author")
    private String author;

    @Min(value = 1200, message = "Год должен быть больше, чем 1200!")
    @NotNull(message = "Поле год не должно быть пустым!")
    @Column(name = "year")
    private Integer year;

    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person owner;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "taken_at")
    private Date takenAt;

    @Transient
    private Boolean expired;

    public Book() {

    }

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Date getTakenAt() {
        return takenAt;
    }

    public void setTakenAt(Date takenAt) {
        this.takenAt = takenAt;
    }

    public Boolean getExpired() {
        return expired;
    }

    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

}
