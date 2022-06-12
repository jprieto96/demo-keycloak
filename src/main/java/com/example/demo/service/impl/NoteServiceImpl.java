package com.example.demo.service.impl;

import com.example.demo.dao.NoteDao;
import com.example.demo.dto.NoteDto;
import com.example.demo.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class NoteServiceImpl implements NoteService {

    @Autowired
    private NoteDao noteDao;

    @Override
    public NoteDto createNote(NoteDto noteDto) throws Exception {
        return null;
    }

    @Override
    public NoteDto deleteNote(Long id) throws Exception {
        return null;
    }

    @Override
    public NoteDto showDetails(Long id) throws Exception {
        return null;
    }

    @Override
    public List<NoteDto> listNotes() {
        return null;
    }

    @Override
    public NoteDto updateNote(NoteDto noteDto) throws Exception {
        return null;
    }
}
