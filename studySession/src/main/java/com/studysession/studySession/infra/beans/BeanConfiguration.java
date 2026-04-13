package com.studysession.studySession.infra.beans;

import com.studysession.studySession.core.gateway.StudySessionGateway;
import com.studysession.studySession.core.useCases.BuscarStudySessionsCase;
import com.studysession.studySession.core.useCases.BuscarStudySessionsCaseImpl;
import com.studysession.studySession.core.useCases.CriarSessaoDeEstudoCase;
import com.studysession.studySession.core.useCases.CriarSessaoDeEstudoCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    public CriarSessaoDeEstudoCase criarSessaoDeEstudo(StudySessionGateway sessionGateway){
        return new CriarSessaoDeEstudoCaseImpl(sessionGateway);
    }

    @Bean
    public BuscarStudySessionsCase buscarStudySessions(StudySessionGateway sessionGateway){
        return new BuscarStudySessionsCaseImpl(sessionGateway);
    }
}
