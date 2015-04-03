package org.texo.tasks

class EchoTask(echo: String) extends Task {
  override def apply(output:Seq[String]):Seq[String] = output :+ echo
}
