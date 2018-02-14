name := "keyCloak-client"

version := "0.1"

scalaVersion := "2.11.12"

val keycloak = Seq(
  "org.keycloak" % "keycloak-adapter-core" % "3.4.3.Final",
  "org.keycloak" % "keycloak-core" % "3.4.3.Final",
  "org.jboss.logging" % "jboss-logging" % "3.3.0.Final",
  "org.jboss.logging" % "jboss-logging-annotations" % "2.1.0.Final" % "provided",
  "org.jboss.logging" % "jboss-logging-processor" % "2.1.0.Final" % "provided",
  "org.keycloak" % "keycloak-admin-client" % "3.4.3.Final",
  "org.jboss.resteasy" % "resteasy-client" % "3.0.24.Final" excludeAll(
    ExclusionRule("junit", "junit"),
    ExclusionRule("org.jboss.logging"),
    ExclusionRule("net.jcip"),
    ExclusionRule("org.jboss.spec.javax.ws.rs"),
    ExclusionRule("org.jboss.spec.javax.servlet"),
    ExclusionRule("org.jboss.spec.javax.annotation"),
    ExclusionRule("javax.activation"),
    ExclusionRule("commons-io"),
    ExclusionRule("org.apache.httpcomponents")),
  "org.jboss.resteasy" % "resteasy-jaxrs" % "3.0.24.Final" excludeAll(
    ExclusionRule("junit", "junit"),
    ExclusionRule("org.jboss.logging"),
    ExclusionRule("net.jcip"),
    ExclusionRule("org.jboss.spec.javax.ws.rs"),
    ExclusionRule("org.jboss.spec.javax.servlet"),
    ExclusionRule("org.jboss.spec.javax.annotation"),
    ExclusionRule("javax.activation"),
    ExclusionRule("commons-io"),
    ExclusionRule("org.apache.httpcomponents")),
  "org.apache.httpcomponents" % "httpclient" % "4.5.1",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.0",
  "org.jboss.spec.javax.annotation" % "jboss-annotations-api_1.2_spec" % "1.0.2.Final",
  "commons-io" % "commons-io" % "2.6"
)

libraryDependencies ++= keycloak
