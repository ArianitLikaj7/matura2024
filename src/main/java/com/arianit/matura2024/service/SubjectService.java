package com.arianit.matura2024.service;

import com.arianit.matura2024.dao.SubjectRepository;
import com.arianit.matura2024.dto.SubjectDto;
import com.arianit.matura2024.dto.request.SubjectRequest;
import com.arianit.matura2024.entity.Subject;
import com.arianit.matura2024.mapper.SubjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SubjectService {
    private final SubjectRepository subjectRepository;
    private final SubjectMapper mapper;

    public SubjectDto create(SubjectRequest request){
        Subject subject = mapper.toEntity(request);
        return mapper.toDto(subjectRepository.insert(subject));
    }
}
