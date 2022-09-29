package com.gabinet.gabinet.visit;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Table
@Entity
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "visit_id")
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;
    private String note;

    public Visit() {
    }

    public Visit(LocalDate date, String note) {
        this.date = date;
        this.note = note;
    }

    public Visit(Long id, LocalDate date, String note) {
        this.id = id;
        this.date = date;
        this.note = note;
    }

    @Override
    public String toString() {
        return "Visit{" +
                "id=" + id +
                ", date=" + date +
                ", note='" + note + '\'' +
                '}';
    }
}
