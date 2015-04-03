package org.texo

import org.scalatest.{FlatSpec, Matchers}
import org.texo.tasks.EchoTask

class BasicBuildSpec extends FlatSpec with Matchers {
  behavior of "A Basic Build With An Echo Task"

  it should """Run a task that echos an output""" in {
    val output = Seq[String]()
    val build = new Build(new EchoTask("Hello There, Texo!"))
    val vector: Seq[String] = build.run(output)
    vector.head should be ("Hello There, Texo!")
  }
}
