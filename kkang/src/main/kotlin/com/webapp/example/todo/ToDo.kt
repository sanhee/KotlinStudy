package com.webapp.example.todo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class ToDo(@Id @GeneratedValue(strategy = GenerationType.IDENTITY) var todoId: Long = 0, var content: String = "") {

}
