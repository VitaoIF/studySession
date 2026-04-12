package com.studysession.studySession.infra.dto;

import com.studysession.studySession.core.enums.Difficulty;

import java.time.LocalDate;

public record StudySessionDto(
        Long id,
        String subject,
        Integer durationMinutes,
        LocalDate localDate,
        String notes,
        Difficulty difficulty
) {
}
