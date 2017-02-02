package radium226

import java.io.InputStream

import scala.util.Try

trait VideoOpener {

  def openVideo(): Try[InputStream]

}

object VideoOpener {

  def apply(url: String): VideoOpener = {
    return new YouTubeVideoOpener(url)
  }

}