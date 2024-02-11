package com.example.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name="practice")
@NoArgsConstructor
@Component
@Getter
@Setter
public class User
{ @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;



    String name;
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


}
