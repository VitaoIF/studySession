package com.studysession.studySession.core.useCases;

import com.studysession.studySession.core.entities.StudySession;
import com.studysession.studySession.core.gateway.StudySessionGateway;

public class CriarSessaoDeEstudoCaseImpl implements CriarSessaoDeEstudoCase{

    private final StudySessionGateway gateway;

    public CriarSessaoDeEstudoCaseImpl(StudySessionGateway gateway) {
        this.gateway = gateway;
    }

    @Override
    public StudySession execute(StudySession session){
        return gateway.criarSessao(session);
    }

}
