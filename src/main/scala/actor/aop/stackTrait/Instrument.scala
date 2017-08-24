package actor.aop.stackTrait

/**
  * 针对框架做的AOP实现的部分（相当于利用框架实现其中的一部分，这里可以使用工厂创造不同的AOP实现）
  * Created by User on 2017/8/24.
  */
trait Instrument extends ActorStack {
  override def receive: Receive = {
    case x =>
      println("Do something before")
      super.receive(x)
      println("Do something after")
  }
}
