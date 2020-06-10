package com.example.repo;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.StudentDetails;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Integer> {
	
	@Query(value="select k from StudentDetails k order by k.marks",nativeQuery = false)
	List<StudentDetails> findByOrderByMarksAsc();

}
