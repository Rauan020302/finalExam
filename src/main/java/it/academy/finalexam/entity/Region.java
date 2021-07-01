package it.academy.finalexam.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "region")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "population")
    private Integer population;
}
