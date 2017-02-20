package io.scalajs.dom

import scala.scalajs.js

/**
  * The Comment interface represents textual notations within markup; although it is generally not visually shown,
  * such comments are available to be read in the source view. Comments are represented in HTML and XML as content
  * between '<!--' and '-->'. In XML, the character sequence '--' cannot be used within a comment.
  * @see https://developer.mozilla.org/en-US/docs/Web/API/Comment
  * @author lawrence.daniels@gmail.com
  */
@js.native
class Comment extends CharacterData