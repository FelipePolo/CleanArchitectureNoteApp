package com.plcoding.cleanarchitecturenoteapp.feature_node.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.module.Note
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_node.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false,

)
