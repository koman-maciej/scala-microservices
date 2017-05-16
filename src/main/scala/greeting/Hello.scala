package greeting

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {
  lazy val greeting: String = "Hello Maciej. You're f*ckin' awesome..."
}
