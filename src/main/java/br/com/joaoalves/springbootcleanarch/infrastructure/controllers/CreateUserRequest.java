package br.com.joaoalves.springbootcleanarch.infrastructure.controllers;

public record CreateUserRequest(String username, String password, String email) {

}
