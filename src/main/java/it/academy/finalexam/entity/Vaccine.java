package it.academy.finalexam.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "vaccine")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
