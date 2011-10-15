package com.example

import unfiltered.request._
import unfiltered.response._
import util.Properties

/** unfiltered plan */
class App extends unfiltered.filter.Plan {
  import QParams._

  def intent = {
    case GET(Path(p)) =>
      Ok ~> ResponseString("Unfiltered on Heroku !!!")
  }
}

/** embedded server */
object Server {
  def main(args: Array[String]) {
    val port = Properties.envOrElse("PORT", "8080").toInt
    unfiltered.jetty.Http(port).filter(new App).run
  }
}
