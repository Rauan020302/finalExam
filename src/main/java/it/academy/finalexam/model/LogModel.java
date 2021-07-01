package it.academy.finalexam.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class LogModel {

    private Long citizenId;

    private Boolean isInfected;

    private Long vaccineId;

    private LocalDate date;
}
