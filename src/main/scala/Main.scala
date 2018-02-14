import java.util

object Main extends App {


  val kc = KeycloakBuilder.builder()
    .serverUrl("http://localhost:8080")
    .realm("Demo")
    .username("admin")
    .password("admin")
    .clientId("testCLient")
    .clientSecret("dd86094d-4cd2-4f60-b3a7-298cbc475d22")
    .resteasyClient(
      new ResteasyClientBuilder()
        .connectionPoolSize(10).build())
    .build()

  val users: util.List[UserRepresentation] = kc.realm("").users().list()

}
