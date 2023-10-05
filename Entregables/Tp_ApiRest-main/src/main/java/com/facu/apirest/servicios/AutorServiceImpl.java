package com.facu.apirest.servicios;

import com.facu.apirest.entidades.Autor;
import com.facu.apirest.repositorios.AutorRepository;
import com.facu.apirest.repositorios.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor, Long> implements AutorService{

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }



}