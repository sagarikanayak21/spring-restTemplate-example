package com.sn.faculty.facultyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sn.faculty.facultyMaster.FacultyMaster;

@Repository
public interface FacultyMasterRepository extends JpaRepository<FacultyMaster, Integer> {
}
