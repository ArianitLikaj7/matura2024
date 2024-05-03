package com.arianit.matura2024.mapper;

public interface GenericMapper <E,D,R,U>{

    D toDto(E entity);

    E toEntity(R request);

    void toEntity(U updateRequest, E entity);
}
