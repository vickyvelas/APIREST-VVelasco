package com.facu.apirest.repositorios;

import com.facu.apirest.entidades.Persona;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends BaseRepository<Persona,Long> {


}
