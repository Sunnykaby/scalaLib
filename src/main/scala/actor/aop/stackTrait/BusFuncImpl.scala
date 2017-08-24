package actor.aop.stackTrait

import akka.actor.Actor

/**
  * 具体执行的实现，利用框架实现核心的应用功能
  * Created by User on 2017/8/24.
  */
class BusFuncImpl extends Actor with Instrument {

  override def wrappedReceive: Receive = {
    case "something" => println("Get something")
    case x => println("Get something of x :" + x)
  }

}
