# TODO App in  Scala Native
This app works natively on OS without the support of JVM. This TODO app has `add` `update` `delete` and `list` 
feature for TODOS.
### Note: Tested on MacBook

### Prerequisites
1. Follow scala native documentation for [native env setup](https://scala-native.readthedocs.io/en/v0.3.9-docs/user/setup.html). 
2. `re2` Regular Expression native library is required

### Setup
1. `sbt nativeLink`
2. After compilation is complete, you will get executable in  `target/scala-version/project-name-out`
3. Eg - (In my case it was) `target/scala-2.11/scala-native-todo-app-out`

###Usage
1. `target/scala-2.11/scala-native-todo-app-out --help` to get help
2. `target/scala-2.11/scala-native-todo-app-out list` to list all todo
3. `target/scala-2.11/scala-native-todo-app-out add -t "My first task"` add todo
4. `target/scala-2.11/scala-native-todo-app-out delete -i 1` to delete todo at index 1
4. `target/scala-2.11/scala-native-todo-app-out completed -i 1` to update the created  todo at index 1 in completed state