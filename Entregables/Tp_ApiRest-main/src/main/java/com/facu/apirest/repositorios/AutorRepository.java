package com.facu.apirest.repositorios;

import com.facu.apirest.entidades.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository<Autor,Long> {
}
