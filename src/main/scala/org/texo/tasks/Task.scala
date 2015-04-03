package org.texo.tasks

/**
 *
 * @author Daniel Hinojosa
 * @since 3/28/15 3:18 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
trait Task {
  def apply(output:Seq[String]):Seq[String]
}
