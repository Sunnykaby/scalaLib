package actor.aop.old

import akka.actor.Actor

/**
  * Created by User on 2017/8/24.
  */
class OldAopDemo extends Actor {

  def wrappedReceive: Receive = {
    case x => println("This is old aop demo")
  }

  override def receive: Receive = {
    case x =>
      println("Do something before")
      wrappedReceive(x)
      println("Do something after")
  }
}
