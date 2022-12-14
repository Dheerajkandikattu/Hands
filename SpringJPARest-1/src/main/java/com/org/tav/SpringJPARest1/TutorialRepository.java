package com.org.tav.SpringJPARest1;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorialRepository extends JpaRepository<Tutorial, Integer> {
	List<Tutorial> findByPublished(boolean published);
	  List<Tutorial> findByTitleContaining(String title);
	
}
