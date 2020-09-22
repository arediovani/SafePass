package Admin;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class PersonalData
{
  private final StringProperty firstname;
  private final StringProperty lastname;
  private final StringProperty domain;
  private final StringProperty password;
  private final StringProperty DOB;
  
  public PersonalData(String firstname, String lastname, String domain, String password, String dob)
  {
    this.firstname = new SimpleStringProperty(firstname);
    this.lastname = new SimpleStringProperty(lastname);
    this.domain = new SimpleStringProperty(domain);
    this.password = new SimpleStringProperty(password);
    this.DOB = new SimpleStringProperty(dob);
  }

    public String getFirstname()
  {
    return (String)this.firstname.get();
  }
  
  public String getLastname()
  {
    return (String)this.lastname.get();
  }
  
  public String getDomain()
  {
    return (String)this.domain.get();
  }
  
  public String getPassword()
  {
    return (String)this.password.get();
  }
  
  public String getDOB()
  {
    return (String)this.DOB.get();
  }
  
  public void setfirstname(String value)
  {
    this.firstname.set(value);
  }
  
  public void setlastname(String value)
  {
    this.lastname.set(value);
  }
  
  public void setdomain(String value)
  {
    this.domain.set(value);
  }
  
  public void setpassword(String value)
  {
    this.password.set(value);
  }
  
  public void setDOB(String value)
  {
    this.DOB.set(value);
  }
  
  public StringProperty idProperty()
  {
    return this.firstname;
  }
  
  public StringProperty firstNameProperty()
  {
    return this.lastname;
  }
  
  public StringProperty lastNameProperty()
  {
    return this.domain;
  }
  
  public StringProperty emailProperty()
  {
    return this.password;
  }
  
  public StringProperty dobProperty()
  {
    return this.DOB;
  }
  
}
