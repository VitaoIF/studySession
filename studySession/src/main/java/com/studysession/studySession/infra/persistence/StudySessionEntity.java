package com.studysession.studySession.infra.persistence;

import com.studysession.studySession.core.enums.Difficulty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tb_studysessions")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudySessionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject;
    private Integer durationMinutes;
    private LocalDate localDate;
    private String notes;
    private Difficulty difficulty;


}
