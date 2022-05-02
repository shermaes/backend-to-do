package com.sofkaU.toDoApp.repository;

import com.sofkaU.toDoApp.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
