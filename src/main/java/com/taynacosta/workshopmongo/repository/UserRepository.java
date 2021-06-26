package com.taynacosta.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.taynacosta.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{   //String = é o tipo da variavel id e User é a classe que ele vai gerenciar

}
