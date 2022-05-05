package com.documentmanger.documentManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.documentmanger.documentManager.model.Doc;
import com.documentmanger.documentManager.model.FileDB;

@Repository
public interface Docrepository extends JpaRepository<Doc,String> {

}
