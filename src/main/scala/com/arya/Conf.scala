package com.arya


import org.rogach.scallop.{ScallopConf, Subcommand}

class Conf(arguments: Seq[String]) extends ScallopConf(arguments) {
  // Select all todos
  val list: Subcommand = new Subcommand("list")
  //list.descr("List  all Todo tasks")


  // Insert a todo
  val add = new Subcommand("add") {
    val todo = opt[String]("todo", descr = "Add the description of todo task")
  }

  // Mark a todo as complete
  val completed = new Subcommand("completed") {
    val index = opt[Int]("index", descr = "Index of Todo to be updated")
  }

  // Delete a todo permanently
  val delete = new Subcommand("delete") {
    val index = opt[Int]("index", descr = "Index of Todo to be deleted permanently")
  }

  addSubcommand(list)
  addSubcommand(add)
  addSubcommand(completed)
  addSubcommand(delete)
  verify()
}
