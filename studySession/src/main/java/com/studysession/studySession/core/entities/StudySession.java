package com.studysession.studySession.core.entities;

import com.studysession.studySession.core.enums.Difficulty;

import java.time.LocalDate;

public class StudySession {

    private Long id;
    private String subject;
    private Integer durationMinutes;
    private LocalDate localDate;
    private String notes;
    private Difficulty difficulty;

    public StudySession(Difficulty difficulty, Integer durationMinutes, Long id, LocalDate localDate, String notes, String subject) {
        this.difficulty = difficulty;
        this.durationMinutes = durationMinutes;
        this.id = id;
        this.localDate = localDate;
        this.notes = notes;
        this.subject = subject;
    }

    public StudySession() {
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(Integer durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
