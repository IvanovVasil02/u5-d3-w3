package ivanovvasil.u5d3w3.adapter;

import lombok.ToString;

@ToString
public class User {
  private String fullName;
  private int age;
 public void getData(MyDataSource ds){
    this.fullName = ds.getFullName();
    this.age = ds.getAge();
   System.out.println(fullName+"\n"+age);
 }

}
