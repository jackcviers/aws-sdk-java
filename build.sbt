name := "aws-sdk-java"

organization := "com.amazonaws"

version := "1.7.2"

libraryDependencies ++= Seq(
  "commons-logging"  % "commons-logging"  % "1.1.1",
  "org.apache.httpcomponents"  % "httpclient"  % "4.2",
  "commons-codec"  % "commons-codec"  % "1.3",
  "com.fasterxml.jackson.core"  % "jackson-core"  % "2.1.1"  % "compile",
  "com.fasterxml.jackson.core"  % "jackson-databind"  % "2.1.1"  % "compile",
  "com.fasterxml.jackson.core"  % "jackson-annotations"  % "2.1.1"  % "compile",
  "joda-time"  % "joda-time"  % "[2.2,)",
  "javax.mail"  % "mail"  % "1.4",
  "org.freemarker"  % "freemarker"  % "2.3.9",
  "org.springframework"  % "spring-beans"  % "3.0.7.RELEASE",
  "org.springframework"  % "spring-core"  % "3.0.7.RELEASE",
  "org.springframework"  % "spring-context"  % "3.0.7.RELEASE",
  "org.springframework"  % "spring-test"  % "3.0.7.RELEASE",
  "org.aspectj"  % "aspectjrt"  % "1.6.0",
  "stax"  % "stax-api"  % "1.0.1",
  "stax"  % "stax"  % "1.2.0",
  "junit"  % "junit"  % "4.11" 
)
