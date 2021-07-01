package it.academy.finalexam.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "citizen")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Citizen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "region_id")
    private Region region;
}
