package com.studysession.studySession.core.gateway;

import com.studysession.studySession.core.entities.StudySession;

import java.util.List;

public interface StudySessionGateway {

     StudySession criarSessao(StudySession session);
     List<StudySession> listarSessoes();
}
