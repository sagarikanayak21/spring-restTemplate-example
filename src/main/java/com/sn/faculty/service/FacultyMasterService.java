package com.sn.faculty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

import com.sn.faculty.facultyMaster.FacultyMaster;
import com.sn.faculty.facultyRepository.FacultyMasterRepository;

@Service
public class FacultyMasterService implements FacultyMasterServiceI {
		@Autowired
		FacultyMasterRepository facultyMasterRepository;
		
		@Override
		public FacultyMaster getFacultyDetails(int fid) {
			Optional<FacultyMaster> fm = facultyMasterRepository.findById(fid);
			if(fm.isPresent()) {
				return fm.get();
			}
			return null;
		}
		
		@Override
		public FacultyMaster saveFacultyDetails(FacultyMaster facultyMaster) {
			FacultyMaster facultyMasterRes = facultyMasterRepository.save(facultyMaster);
			return facultyMasterRes;
		}
}
