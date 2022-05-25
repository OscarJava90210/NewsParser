package com.parser.Jnews.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.parser.Jnews.model.News;

@Repository
public class NewsRepository extends JpaRepository<News,Long> {

}
