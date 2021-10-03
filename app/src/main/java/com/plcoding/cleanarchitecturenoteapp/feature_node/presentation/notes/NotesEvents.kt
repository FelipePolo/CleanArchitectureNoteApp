package com.plcoding.cleanarchitecturenoteapp.feature_node.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.util.NoteOrder

sealed class NotesEvents {
    data class Order(val noteOrder: NoteOrder): NotesEvents()
    data class DeleteNote(val note: Note) : NotesEvents()
    object RestoreNote: NotesEvents()
    object Toggle: NotesEvents()
}
