name := "keyCloak-client"

version := "0.1"

scalaVersion := "2.11.12"

val keycloak = Seq(
  "org.keycloak" % "keycloak-adapter-core" % "3.4.3.Final",
  "org.keycloak" % "keycloak-core" % "3.4.3.Final",
  "org.jboss.logging" % "jboss-logging" % "3.3.0.Final",
  "org.jboss.logging" % "jboss-logging-annotations" % "2.1.0.Final" % "provided",
  "org.jboss.logging" % "jboss-logging-processor" % "2.1.0.Final" % "provided",
  "org.keycloak" %% "keycloak-admin-client" % "3.4.3.Final",
  "org.jboss.resteasy" %% "resteasy-client" % "3.0.24.Final",
  "org.jboss.resteasy" %% "resteasy-jaxrs" % "3.0.24.Final",
  "org.apache.httpcomponents" % "httpclient" % "4.5.1"
)

libraryDependencies ++= keycloak