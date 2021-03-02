package max.spring.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

  @Value("${spring.datasource.password}")
  private String databaseUsername;
  @Value("${spring.datasource.username}")
  private String databasePassword;
  
  @GetMapping("/getDatabaseInfo")
  public String getDatabaseInfo(){
    return "username: " + databaseUsername + "," + "password: " + databasePassword;
  }
  
}