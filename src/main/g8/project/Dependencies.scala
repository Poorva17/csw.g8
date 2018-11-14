import sbt._

object Dependencies {

  val $name;format="Camel"$Assembly = Seq(
    CSW.`csw-framework`,
    CSW.`csw-testkit` % Test,
    Libs.`scalatest` % Test,
    Libs.`junit` % Test,
    Libs.`junit-interface` % Test
  )

  val $name;format="Camel"$Hcd = Seq(
    CSW.`csw-framework`,
    CSW.`csw-testkit` % Test,
    Libs.`scalatest` % Test,
    Libs.`junit` % Test,
    Libs.`junit-interface` % Test
  )

  val $name;format="Camel"$Deploy = Seq(
    CSW.`csw-framework`,
    CSW.`csw-testkit` % Test
  )
}
