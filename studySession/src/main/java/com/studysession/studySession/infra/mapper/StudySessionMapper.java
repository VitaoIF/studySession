package com.studysession.studySession.infra.mapper;

import com.studysession.studySession.core.entities.StudySession;
import com.studysession.studySession.infra.dto.StudySessionDto;
import org.springframework.stereotype.Component;

@Component
public class StudySessionMapper {

    public StudySessionDto toDto(StudySession session){
        return new StudySessionDto(
                session.getId()
                , session.getSubject()
                , session.getDurationMinutes()
                , session.getLocalDate()
                , session.getNotes()
                , session.getDifficulty());
    }

    public StudySession toDomain(StudySessionDto studySessionDto){
        StudySession studySession = new StudySession();
        studySession.setId(studySessionDto.id());
        studySession.setSubject(studySessionDto.subject());
        studySession.setDurationMinutes(studySessionDto.durationMinutes());
        studySession.setLocalDate(studySessionDto.localDate());
        studySession.setNotes(studySessionDto.notes());
        studySession.setDifficulty(studySessionDto.difficulty());

        return studySession;
    }

}
