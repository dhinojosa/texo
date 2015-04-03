package org.texo

import org.texo.tasks.Task

/**
 *
 * @author Daniel Hinojosa
 * @since 3/28/15 3:15 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
class Build(tasks: Task*) {
  def run(output:Seq[String]): Seq[String] = tasks.flatMap(_.apply(output))
}
