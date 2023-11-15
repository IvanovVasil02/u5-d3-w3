package ivanovvasil.u5d3w3.adapter;

import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.time.LocalDate;
@Component
public class AdapterRunner implements CommandLineRunner {
  @Override
  public void run(String... args) throws Exception {

    Info info = new Info("Vasil", "Ivanov", LocalDate.of(2002,1,2));
    MyDataSource infoAdapter = new InfoAdapter(info);
    User user = new User();
    user.getData(infoAdapter);

  }
}
