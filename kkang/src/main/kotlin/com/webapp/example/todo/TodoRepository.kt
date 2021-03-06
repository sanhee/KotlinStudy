package com.webapp.example.todo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import javax.transaction.Transactional

@Repository
interface TodoRepository : JpaRepository<ToDo, Long>{
    @Transactional
    fun deleteByTodoId(todoId: Long)
}
