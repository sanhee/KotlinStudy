package com.webapp.example.todo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
class TodoController(val todoRepository : TodoRepository) {

    @GetMapping("/")
    fun listTodo(model: Model) : String{
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }

    @PostMapping("/")
    fun addTodo(todo: ToDo, model: Model): String{
        todoRepository.save(todo)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }

    @PostMapping("/delete")
    fun deleteTodo(@RequestParam(name = "todoId") todoId: Long, model: Model): String{
        todoRepository.deleteByTodoId(todoId)
        model.addAttribute("todos", todoRepository.findAll())
        return "index"
    }

}
