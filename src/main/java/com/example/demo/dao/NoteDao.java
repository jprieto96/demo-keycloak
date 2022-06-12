package com.example.demo.dao;

import com.example.demo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface NoteDao extends JpaRepository<Note, Long>, JpaSpecificationExecutor<Note> {
    Optional<Note> findStockById(String idStock);
}
