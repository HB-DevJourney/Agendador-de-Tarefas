package com.mateus.gerenciadortarefas.infrastructure.security.service;

import com.mateus.gerenciadortarefas.business.dto.UsuarioDTO;
import com.mateus.gerenciadortarefas.infrastructure.security.client.IUsuarioClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserDetailsServiceImpl {

    private IUsuarioClient iUsuarioClient;

    public UserDetails carregarDadosUsuario(String email, String token) {
        UsuarioDTO usuarioDTO = iUsuarioClient.buscarUsuarioPorEmail(email, token);
        return User
                .withUsername(usuarioDTO.getEmail())
                .password(usuarioDTO.getSenha())
                .build();
    }
}
