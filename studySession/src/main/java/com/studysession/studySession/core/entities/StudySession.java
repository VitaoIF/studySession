package com.studysession.studySession.core.entities;

import com.studysession.studySession.core.enums.Dificulty;

import java.time.LocalDate;

public class StudySession {

    private Long id;
    private String subject;
    private Integer durationMinutes;
    private LocalDate localDate;
    private String notes;
    private Dificulty dificulty;

    public StudySession(Dificulty dificulty, Integer durationMinutes, Long id, LocalDate localDate, String notes, String subject) {
        this.dificulty = dificulty;
        this.durationMinutes = durationMinutes;
        this.id = id;
        this.localDate = localDate;
        this.notes = notes;
        this.subject = subject;
    }

    public StudySession() {
    }

    public Dificulty getDificulty() {
        return dificulty;
    }

    public void setDificulty(Dificulty dificulty) {
        this.dificulty = dificulty;
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
