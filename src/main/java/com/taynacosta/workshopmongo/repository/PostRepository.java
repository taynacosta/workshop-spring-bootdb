package com.taynacosta.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.taynacosta.workshopmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> { // String = é o tipo da variavel id e Post é a
																		// classe que ele vai gerenciar

}
