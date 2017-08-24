/**
  * Created by User on 2017/8/24.
  */
import actor.aop.old.OldAopDemo
import actor.aop.stackTrait.BusFuncImpl
import akka.actor.ActorSystem
import akka.testkit.TestActorRef
import akka.util.Timeout

import scala.concurrent.duration._
import org.scalatest.{FunSpecLike, Matchers}
class AopTest extends FunSpecLike with Matchers{
  implicit val sys = ActorSystem()
  implicit val timeout = Timeout(5 seconds)

  describe("Aop test") {
    describe("Send msg") {
      it("should have the aop msg"){
        val testActorRef = TestActorRef(new BusFuncImpl)
        testActorRef ! "something"
        testActorRef ! "Hello"

        val testActorRef2 = TestActorRef(new OldAopDemo)
        testActorRef2 ! "Hello"
      }
    }
  }

}
