# Short description 
A digital safe that keeps all your login information in one place. Built with JavaFX 
# Abstract 
This documentation is about the Safe Password software that I made. The inspiration came after I was having a hard time remembering a password on a site that had no recover password option.. The software is about saving your password that you use in other websites or applications. You can view your saved information by providing a username and master password and after it has been verified that those are correct the system will show you a list with all the information used. Not only this but the system has an option to add more than one saved password to the database. Yes, the software has a database which saves everything, including the master password. This means that after the system has been terminated the data is safe and secured. So you can run the software anytime and always have up to date information. The software works perfectly as I planned and I’m proud of the end result.
# Product Perspective and Scope
The Safe Password software is a software that will keep track of any information that you use to login in other website or other desktop applications. The goal of the software is to be very easy to use and fast in the user interaction. That is why the software is developed using JAVAFX library. It is very efficient and friendly to an ordinary user to be familiar with it fast.
Also we use SQLLite as a database. We modified the database with a software called SQLlite studio.
First the software opens a red window with a logo ,2 text fields a button and a text in the bottom. Now lets explain every single one of them.

The first window has a title called “ SafePass software” which lets the user know what application he or she is using. 
The red pane is symbolic to the software because red in ancient Greek symbolizes safety and security and that’s exactly what my intentions where when I started to make this software.
The two first fields are respectfully called username and password.
These are used for the user to enter his username and password in order to be authenticated by the system.
After that we are followed by a button which tells the system to use the fields above the button and start the authentication procedure.
After that we get a logo of the system, this logo is not intractable.
In the end we get a text that shows us valuable information if the database is online or not. Without it nothing would work. So in order to avoid confusion to the user or developer we print out connected or disconnected, this makes it easier to troubleshoot problems because the user is aware.
If the user types wrong credentials a message will pop up

# Quick Tutorial for users
This section will cover a very quick tutorial on what every simple user should do when using this program.

**Login Window**
1.check if database is connected
If yes continue to step 2
If no contact the developer
2.write username
3.write password
4.click

**Main Dashboard**
To show the data from database click on the button “Load Data”
After that all the information from the datavase will be shown in the huge spreadsheet on the right.
If you want to add more entries to the database, please write the information to the respective fields.

# Implmentation

This Section is for Developers and Students who are eager to learn how this wonderful application works.
This software is build using 2 main libraries SQLlite and JAVAfx. We are using SQLlite because it has less features than MySQL and its more faster and lighter than MySQL. 
JavaFx because it has some very beautiful design concepts that look modern in todays design era.
The development is sectioned in 3 main parts.just like the packages that are in the java development folder

The login package has 3 classes 
LoginApp has the main class so the application starts there.
It creates the window using FXML file which is located in this package
LoginModel has the main functions which are used to control the text fiels 
While the LoginMainController code is used how the JAVAFX library compnoents are changed when the user interacts wit the window.
As I mentioned above this software is used with conjunction with SQLITE
I will promptly show how the datbesl are created with SQLITE studio
All the fields are text for ease of use in development
This table has the password or username of the main user of the software
Both fields are essential for the login window in order for it to work.
DbUtil package has one class that its purpouse is to connect the software with the database.

This package has classes and files and classes that work on to create the admin dashboard after the user has logged in.
There is a fxml file that handles how the software looks, feels and interacts.
Personal data class 
This class stores the information that we get from the database. So every time we call this class we have a constructor in which the information is temporarily stored
`
public PersonalData(String firstname, String lastname, String domain, String password, String dob)
  {
    this.firstname = new SimpleStringProperty(firstname);
    this.lastname = new SimpleStringProperty(lastname);
    this.domain = new SimpleStringProperty(domain);
    this.password = new SimpleStringProperty(password);
    this.DOB = new SimpleStringProperty(dob);
  }
  `
We used StringProperty because it is the best way to store string in this current situations. Also it is better to use with JavaFX

Admin Controller class
This class controls how the fxml interacts with the user. Firstly we import all the datatypes fro mteh FXML File
Example like :
`
@FXML
  private TableView<PersonalData> studenttable;
  @FXML
  private TableColumn<PersonalData, String> idcolumn;
`
After that we initialize the connection witthe databze by using the initialize method.
Loadsdata method purpouse is to connect to the databsase
Run a SQL query command which is :
`
SELECT * FROM information
After that it loads all the string that it gets from the other class to the respectfull colums by using these commands
    this.idcolumn.setCellValueFactory(new PropertyValueFactory("firstname"));
    this.firstnamecolumn.setCellValueFactory(new PropertyValueFactory("lastname"));
    this.lastnamecolumn.setCellValueFactory(new PropertyValueFactory("domain"));
    this.emailcolumn.setCellValueFactory(new PropertyValueFactory("password"));
    this.dobcolumn.setCellValueFactory(new PropertyValueFactory("DOB"));
`
AddData method is gets the information from the textfields and stores them in the databse using these functions
`
      stmt.setString(1, this.id.getText());
      stmt.setString(2, this.firstname.getText());
      stmt.setString(3, this.lastname.getText());
      stmt.setString(4, this.email.getText());
      stmt.setString(5, this.dob.getEditor().getText());
`
ClearData method sets the value of the texts field to nothing by using the setText method
`
  this.id.setText("");
    this.firstname.setText("");
    this.lastname.setText("");
    this.email.setText("");
    this.dob.setValue(null);
`
# References
Software Used to make this application:
https://www.sqlite.org/index.html
https://netbeans.org/
https://gluonhq.com/products/scene-builder/
https://openjfx.io/

