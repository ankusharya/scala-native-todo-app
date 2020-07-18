package com.arya

import java.io.File

import com.arya.SQLConstants._
import com.github.sqlite4s.SQLiteConnection

object SQLiteOperations {
  def createDBSession() = {
    val db = new SQLiteConnection(new File("/tmp/database"))
    db.open(true)
  }

  def createTableIfNot(db: SQLiteConnection) = {
    db.exec(createTable)
  }

  def addTodo(db: SQLiteConnection, todo: String, status: String = "CREATED") = {
    val st = db.prepare(insertTodo)
    st.bind(1, todo)
    st.bind(2, status)
    st.step()
  }

  def displayTodos(db: SQLiteConnection) = {
    val st = db.prepare(displayAllTodo)
    println("Index, Todo")
    println("------------")
    while (st.step()) {
      println(st.columnInt(0), st.columnString(1))
    }
    println("------------")
    true
  }

  def updateTodo(db: SQLiteConnection, index: Int, status: String = "COMPLETED") = {
    val st = db.prepare(updateStatusOfTodo)
    st.bind(1, status)
    st.bind(2, index)
    st.step()
  }

  def removeTodo(db: SQLiteConnection, index: Int) = {
    val st = db.prepare(deleteTodo)
    st.bind(1, index)
    st.step()
  }

}
