package example

/**
  * Created by kedwin.perez on 02/09/2016.
  */
object Main extends App{
  var xs = List(1,2,7,6)
  println(Lists.max(xs) + " is the greater in " + xs)
  println(Lists.sum(xs) + " is the sum of " + xs)
  println(Lists.sum(List()) + " is the sum of empty")
}
