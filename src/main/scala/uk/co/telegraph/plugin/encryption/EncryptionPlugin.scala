package uk.co.telegraph.plugin.encryption

import sbt._

object EncryptionPlugin extends AutoPlugin
  with EncryptionKeys
  with EncryptionConfiguration {

  object autoImport {
  }

  import autoImport._

  override def trigger: PluginTrigger = allRequirements

  override lazy val projectSettings:Seq[Setting[_]] = baseStackSettings
}