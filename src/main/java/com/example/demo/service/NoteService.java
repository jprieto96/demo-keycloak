package com.example.demo.service;

import com.example.demo.dto.NoteDto;

import java.util.List;

public interface NoteService {

    NoteDto createNote(NoteDto noteDto) throws Exception;
    NoteDto deleteNote(Long id) throws Exception;
    NoteDto showDetails(Long id) throws Exception;
    List<NoteDto> listNotes();
    NoteDto updateNote(NoteDto noteDto) throws Exception;

}
