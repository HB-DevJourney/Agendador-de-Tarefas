package com.mateus.gerenciadortarefas.business;

import com.mateus.gerenciadortarefas.business.dto.TarefasDTO;
import com.mateus.gerenciadortarefas.business.mapper.TarefasConverter;
import com.mateus.gerenciadortarefas.infrastructure.entity.TarefasEntity;
import com.mateus.gerenciadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import com.mateus.gerenciadortarefas.infrastructure.repository.TarefasRepository;
import com.mateus.gerenciadortarefas.infrastructure.security.util.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TarefasService {

    private final TarefasRepository repository;
    private final TarefasConverter converter;
    private final JwtUtil jwtUtil;

    public TarefasDTO salvarTarefa(String token, TarefasDTO dto) {
        String email = jwtUtil.extrairEmailToken(token.substring(7));

        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatus(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
        TarefasEntity tarefasEntity = converter.paraTarefaEntity(dto);
        return converter.paraTarefaDTO(repository.save(tarefasEntity));
    }
}
