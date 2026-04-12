package com.studysession.studySession.infra.controller;

import com.studysession.studySession.core.entities.StudySession;
import com.studysession.studySession.core.useCases.CriarSessaoDeEstudoCase;
import com.studysession.studySession.infra.dto.StudySessionDto;
import com.studysession.studySession.infra.mapper.StudySessionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/studies")
public class StudySessionController {

    @Autowired
    private CriarSessaoDeEstudoCase criarSessaoDeEstudoCase;

    @Autowired
    private StudySessionMapper studySessionMapper;

    @PostMapping
    public StudySessionDto criarSessao(@RequestBody StudySessionDto dto){
        StudySession session = criarSessaoDeEstudoCase.execute(studySessionMapper.toDomain(dto));
        return studySessionMapper.toDto(session);
    }


}
