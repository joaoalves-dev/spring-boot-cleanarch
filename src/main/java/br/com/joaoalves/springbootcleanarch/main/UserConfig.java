package br.com.joaoalves.springbootcleanarch.main;

import br.com.joaoalves.springbootcleanarch.application.gateways.UserGateway;
import br.com.joaoalves.springbootcleanarch.application.usecases.CreateUserInteractor;
import br.com.joaoalves.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.joaoalves.springbootcleanarch.infrastructure.controllers.UserDTOMapper;
import br.com.joaoalves.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import br.com.joaoalves.springbootcleanarch.infrastructure.persistence.UserRepository;

@Configuration
public class UserConfig {
  @Bean
  CreateUserInteractor createUserCase(UserGateway userGateway) {
    return new CreateUserInteractor(userGateway);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }
}
