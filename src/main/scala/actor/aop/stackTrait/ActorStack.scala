package actor.aop.stackTrait

import akka.actor.Actor
import akka.actor.Actor.Receive

/**
  * 框架
  * Created by User on 2017/8/24.
  */
trait ActorStack extends Actor {

  /** Actor classes should implement this partialFunction for standard
    * actor message handling
    * 用户需要实现的部分
    */
  def wrappedReceive: Receive

  /** Stackable traits should override and call super.receive(x) for
    * stacking functionality
    * 框架用来做AOP的部分
    */
  override def receive: Receive = {
    case x =>
      if (wrappedReceive.isDefinedAt(x)) wrappedReceive(x) else unhandled(x)
  }

}
