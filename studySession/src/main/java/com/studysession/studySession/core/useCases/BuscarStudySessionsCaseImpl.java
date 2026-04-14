package com.studysession.studySession.core.useCases;

import com.studysession.studySession.core.entities.StudySession;
import com.studysession.studySession.core.gateway.StudySessionGateway;

import java.util.List;

public class BuscarStudySessionsCaseImpl implements BuscarStudySessionsCase{

    private final StudySessionGateway sessionGateway;

    public BuscarStudySessionsCaseImpl(StudySessionGateway sessionGateway) {
        this.sessionGateway = sessionGateway;
    }

    @Override
    public List<StudySession> execute() {
        return sessionGateway.listarSessoes();
    }
}
