package com.studysession.studySession.infra.mapper;

import com.studysession.studySession.core.entities.StudySession;
import com.studysession.studySession.infra.persistence.StudySessionEntity;
import org.springframework.stereotype.Component;

@Component
public class StudySessionEntityMapper {

    public StudySessionEntity toEntity(StudySession session){
        return new StudySessionEntity(
                session.getId(),
                session.getSubject(),
                session.getDurationMinutes(),
                session.getLocalDate(),
                session.getNotes(),
                session.getDifficulty()
        );
    }

    public StudySession toDomain(StudySessionEntity entity){
        return new StudySession(
                entity.getDifficulty(),
                entity.getDurationMinutes(),
                entity.getId(),
                entity.getLocalDate(),
                entity.getNotes(),
                entity.getSubject()
        );
    }
}
