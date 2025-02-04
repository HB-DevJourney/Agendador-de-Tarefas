package com.mateus.gerenciadortarefas.business.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    private String email;
    private String senha;

}
