import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {
  val udashVersion = "$udash_version$"
  val udashJQueryVersion = "$udash_jquery_version$"

  val logbackVersion = "1.1.3"
  val jettyVersion = "9.4.11.v20180605"

  val crossDeps = Def.setting(Seq[ModuleID](
    "io.udash" %% "udash-core-shared" % udashVersion,
    "io.udash" %% "udash-rpc-shared" % udashVersion
  ))

  val frontendDeps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core-frontend" % udashVersion,
    "io.udash" %%% "udash-rpc-frontend" % udashVersion,
    "io.udash" %%% "udash-css-frontend" % udashVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))

  val backendDeps = Def.setting(Seq[ModuleID](
    "io.udash" %% "udash-rpc-backend" % udashVersion,
    "org.eclipse.jetty" % "jetty-server" % jettyVersion,
    "org.eclipse.jetty" % "jetty-servlet" % jettyVersion,
    "org.eclipse.jetty.websocket" % "websocket-server" % jettyVersion,
    "ch.qos.logback" % "logback-classic" % logbackVersion
  ))
}