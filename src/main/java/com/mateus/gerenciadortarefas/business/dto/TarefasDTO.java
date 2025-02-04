package com.mateus.gerenciadortarefas.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.mateus.gerenciadortarefas.infrastructure.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TarefasDTO {

    private String id;

    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm")
    private LocalDateTime dataEvento;

    private String emailUsuario;
    private LocalDateTime dataAlteracao;
    private StatusNotificacaoEnum status;

}
