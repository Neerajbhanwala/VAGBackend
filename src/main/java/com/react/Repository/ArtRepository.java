package com.react.Repository;

import com.react.Entity.Art;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories
public interface ArtRepository extends JpaRepository<Art,Integer>
{

    List<Art> findByCategory(String category);
    List<Art> findByAuthorName(String authorName);
}
