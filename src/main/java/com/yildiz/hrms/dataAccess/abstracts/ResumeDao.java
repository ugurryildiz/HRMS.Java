package com.yildiz.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yildiz.hrms.entities.concretes.Resume;

public interface ResumeDao extends JpaRepository<Resume, Integer>{

}
