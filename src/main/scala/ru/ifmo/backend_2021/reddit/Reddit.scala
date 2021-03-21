package ru.ifmo.backend_2021.reddit

import scala.util.control.Breaks._

class RedditMessage(val id: Int, val parentId: Option[Int], val text: String) {
  override def toString: String = s"#$id $text"
}

class RedditThreadPrinter {
  def printMessages(messages: Array[RedditMessage])(handlePrint: String => Unit): Unit = {
    val groupedMessagesByParents = messages.groupBy(_.parentId)
    val sb = new StringBuilder()
    val firstLevelMessages = groupedMessagesByParents.get(None)
    firstLevelMessages.get.foreach(message => {
      sb.appendAll(s"${message.toString}\n")
      appendChildren(0, sb, message.id, groupedMessagesByParents)
    })
    handlePrint(sb.toString().trim)
  }

  def appendChildren(depth: Int, sb: StringBuilder,
                     parentId: Int,
                     groupedMessages: Map[Option[Int], Array[RedditMessage]]): Unit = {
    breakable {
      val children = groupedMessages.get(Option(parentId))
      if (children.isEmpty) break
      children.get.foreach(child => {
        sb.appendAll(getMessage(depth + 1, child))
        appendChildren(depth + 1, sb, child.id, groupedMessages)
      })
    }
  }

  def getMessage(depth: Int, message: RedditMessage): String = {
    s"${" ".repeat(depth)}$message\n"
  }
}

object TestRedditThreadPrinter extends App {
  val a = new RedditThreadPrinter()

  import a._

  printMessages(
    Array(
      new RedditMessage(0, None, "I don't particularly care which interaction they pick so long as it's consistent."),
      new RedditMessage(1, Some(0), "Exactly, both is fine but do pick one."),
      new RedditMessage(2, Some(1), "Riot consistency"),
      new RedditMessage(3, Some(0), "Bad bot"),
      new RedditMessage(4, None, "I think it should be 4x1 damage always"),
      new RedditMessage(5, Some(4), "Yeah, because you're pulling X number of puffcaps, that doesn't mean one puffcap deals X damage, it's X puffcaps deal 1 damage."),
      new RedditMessage(6, Some(4), "I think 1xShrooms"),
      new RedditMessage(7, Some(6), "I agree, but I'm also scared of swain stunning 4 charas at the start of the turn lol."),
      new RedditMessage(8, Some(6), "So swain should stun multiple people right?"),
    )
  ) {
    s => println(s)
  }
  /*
    Should output:
  #0 I don't particularly care which interaction they pick so long as it's consistent.
   #1 Exactly, both is fine but do pick one.
    #2 Riot consistency
   #3 Bad bot
  #4 I think it should be 4x1 damage always
   #5 Yeah, because you're pulling X number of puffcaps, that doesn't mean one puffcap deals X damage, it's X puffcaps deal 1 damage.
   #6 I think 1xShrooms
    #7 I agree, but I'm also scared of swain stunning 4 charas at the start of the turn lol.
    #8 So swain should stun multiple people right?
  */
}