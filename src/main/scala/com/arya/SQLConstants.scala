package com.arya

object SQLConstants {
  val createTable =
    """
      |CREATE TABLE IF NOT EXISTS `todos` (
      |  `id` INTEGER PRIMARY KEY AUTOINCREMENT,
      |  `description` text NOT NULL,
      |  `status` text NOT NULL
      |)
    """.stripMargin

  val insertTodo =
    """
      |INSERT INTO todos (description,status)
      |VALUES(?,?)
    """.stripMargin

  val displayAllTodo =
    """
      |SELECT id, description from todos where status in ('CREATED')
    """.stripMargin

  val updateStatusOfTodo =
    """
      |UPDATE todos
      |SET status = ?
      |WHERE
      |    id = ?
    """.stripMargin

  val deleteTodo =
    """
      |DELETE FROM todos
      |WHERE id = ?
    """.stripMargin

}
