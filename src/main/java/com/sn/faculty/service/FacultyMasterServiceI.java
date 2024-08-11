package com.sn.faculty.service;

import com.sn.faculty.facultyMaster.FacultyMaster;
public interface FacultyMasterServiceI {
	public FacultyMaster getFacultyDetails(int fid);

	FacultyMaster saveFacultyDetails(FacultyMaster facultyMaster);
}
