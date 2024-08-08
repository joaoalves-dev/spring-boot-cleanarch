package br.com.joaoalves.springbootcleanarch.application.gateways;

import br.com.joaoalves.springbootcleanarch.domain.entity.User;

public interface UserGateway {
  User createUser(User user);
}
