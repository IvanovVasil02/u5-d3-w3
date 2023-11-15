package ivanovvasil.u5d3w3.adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Info{
  private String name;
  private String surname;
  private LocalDate birthDate;
}
