package com.test
import scala.actors.Actor._
object ActorTest {
  def actorRun {
    var actor2=actor{
      while(true){
        receive {
          case "Hi" => println("HELLO")
        }
      }
    }
  }
}