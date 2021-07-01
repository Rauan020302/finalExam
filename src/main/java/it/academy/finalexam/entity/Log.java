package it.academy.finalexam.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "logs")
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    @JoinColumn(name = "citizen_id")
    private Citizen citizen;

    @Column(name = "isInfected")
    private Boolean isInfected;

    @OneToOne
    @JoinColumn(name = "vaccine_id")
    private Vaccine vaccine;

    @Column(name = "date")
    private LocalDate date;

}
