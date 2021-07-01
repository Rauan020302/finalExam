package it.academy.finalexam.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PercentModel {
    private String regionName;

    private Integer population;

    private Integer infected;

    private Integer vaccinated;

    private Double percentInfected;

    private Double percentVaccinated;
}
