package com.mateus.gerenciadortarefas.business.mapper;

import com.mateus.gerenciadortarefas.business.dto.TarefasDTO;
import com.mateus.gerenciadortarefas.infrastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);
    TarefasDTO paraTarefaDTO(TarefasEntity dto);

    List<TarefasEntity> paraListaTarefasEntity(List<TarefasDTO> dto);
    List<TarefasDTO> paraListaTarefasDTO(List<TarefasEntity> dto);

}
