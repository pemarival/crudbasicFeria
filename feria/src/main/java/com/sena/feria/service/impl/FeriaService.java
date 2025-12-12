package com.sena.crudbasic.service;

import java.util.List;

import com.sena.crudbasic.dto.CourseDto;
import com.sena.crudbasic.model.Course;

public interface FeriaService {

	/*
	 * findAll
	 * findById
	 * filterByName
	 * save
	 * delete
	 */
	public List<Feria> findAll();
	public Course findById(int id);
	public List<Course> filterByName(String name);
	public String save(FeriaDto f);
	public String delete(int id);
}
