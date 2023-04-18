package com.school.data.read.service.repository;

import java.util.List;

import com.school.data.read.service.entity.RegisterEntity;

public interface RegisterRepo {
	public List<RegisterEntity> findList();
}
