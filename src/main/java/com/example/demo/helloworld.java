@SpringBootApplication
@RestController
public class helloworld {

  @GetMapping("/")
  public String hello() {
    return "Hello from Kubernetes";
  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
