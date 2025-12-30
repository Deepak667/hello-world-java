@SpringBootApplication
@RestController
public class App {
  @GetMapping("/")
  public String hello() {
    return "Hello from Kubernetes";
  }

  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }
}
