package br.com.joaoalves.springbootcleanarch.infrastructure.persistence;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, Long> {

}
