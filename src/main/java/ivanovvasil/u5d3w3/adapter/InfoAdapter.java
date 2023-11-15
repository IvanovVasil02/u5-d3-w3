package ivanovvasil.u5d3w3.adapter;

import lombok.ToString;

import java.time.LocalDate;
@ToString
public class InfoAdapter implements MyDataSource{
  private Info info;

  public InfoAdapter(Info info) {
    this.info = info;
  }

  @Override
  public String getFullName() {
    return info.getName() + " "+info.getSurname();
  }

  @Override
  public int getAge() {
    return LocalDate.now().getYear() - info.getBirthDate().getYear();
  }
}
