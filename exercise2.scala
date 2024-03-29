import scala.io.StdIn.readLine

/** Counting the Number of Characters.
  *
  * @author Juan Pablo Nahuelpán
  *
  * Program that prompts for an input string and displays
  * output that shows the input string and the number of
  * characters the string contains.
  */
@main def exercise2(): Unit =
  println("What is the input string?")
  var name = readLine()
  while verify(name) do
    println("Please enter a valid string")
    name = readLine()
  println(s"$name has ${name.length} characters.")

def verify(name: String): Boolean =
  name.length == 0
