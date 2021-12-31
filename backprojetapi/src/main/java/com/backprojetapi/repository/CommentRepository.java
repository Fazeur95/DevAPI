package com.backprojetapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backprojetapi.model.Comment;

@Repository
public interface CommentRepository extends CrudRepository<Comment, Integer>{

}
