package loginapp;

import Admin.AdminController;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.*;

public class LoginMainController implements Initializable{
  LoginModel loginModel = new LoginModel();
  @FXML
  private Label dbstatus;
  @FXML
  private Button loginButton;
  @FXML
  private TextField username;
  @FXML
  private PasswordField password;


  @Override
  public void initialize(URL url, ResourceBundle rb)
  {
    if (this.loginModel.isDatabaseConnected()) {
      this.dbstatus.setText("Connected");
    } else {
      this.dbstatus.setText("Not Connected");
    }
  }
  
  @FXML
  public void Login(ActionEvent event)
  {
    try
    {
      if (this.loginModel.isLogin(this.username.getText(), this.password.getText()))
      {
        Stage stage = (Stage)this.loginButton.getScene().getWindow();
        stage.close();
        adminLogin();
 
      }
      else
      {
        this.dbstatus.setText("Wrong username or password");
      }
    }
    catch (Exception localException) {}
  }
  
 
  public void adminLogin()
  {
    try
    {
      Stage adminStage = new Stage();
      FXMLLoader adminLoader = new FXMLLoader();
      Pane adminroot = (Pane)adminLoader.load(getClass().getResource("/Admin/Admin.fxml").openStream());
      AdminController admintController = (AdminController)adminLoader.getController();
      
      Scene adminscene = new Scene(adminroot);
      
      adminStage.setScene(adminscene);
      adminStage.setTitle("Admin Dashboard");
      adminStage.setResizable(true);
      adminStage.show();
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
}
