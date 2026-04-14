package com.studysession.studySession.core.useCases;

import com.studysession.studySession.core.entities.StudySession;

import java.util.List;

public interface BuscarStudySessionsCase {

    List<StudySession> execute();
}
