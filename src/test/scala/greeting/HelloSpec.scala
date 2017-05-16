package greeting

import org.scalatest._

class HelloSpec extends FlatSpec with Matchers {
  "The Hello object" should "say hello" in {
    Hello.greeting shouldEqual "Hello Maciej. You're f*ckin' awesome..."
  }
}
