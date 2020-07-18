package com.arya

object Main {
  def main(args: Array[String]): Unit = {
    val conf = new Conf(args)

    val db = SQLiteOperations.createDBSession()
    SQLiteOperations.createTableIfNot(db)

    conf.subcommand match {
      case Some(conf.list) => SQLiteOperations.displayTodos(db)
      case Some(conf.add) => SQLiteOperations.addTodo(db, conf.add.todo())
      case Some(conf.completed) => SQLiteOperations.updateTodo(db, conf.completed.index())
      case Some(conf.delete) => SQLiteOperations.removeTodo(db, conf.delete.index())
      case Some(_) => false
      case None => false
    }

  }
}
