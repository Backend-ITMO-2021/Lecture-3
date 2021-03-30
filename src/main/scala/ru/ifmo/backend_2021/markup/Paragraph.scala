package ru.ifmo.backend_2021.markup
//
//object ScalaMain {
//  def main(args: Array[String]): Unit = {
//    val paragraph = new Paragraph(Array(
//      new Strong(Array(
//        new Text("1"),
//        new Strikeout(Array(
//          new Text("2"),
//          new Emphasis(Array(
//            new Text("3"),
//            new Text("4")
//          )),
//          new Text("5")
//        )),
//        new Text("6")
//      ))
//    ))
//    printf("[f[f")
//
//  }
//
//}


class Paragraph(override val children: Array[Mark]) extends AbstractMarkup(children, ""){

}