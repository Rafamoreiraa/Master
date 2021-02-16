package Elementos;

import org.openqa.selenium.By;

public class elementos {

	
	
	// Elementos para Cadastro
	private By user = By.id("menuUser");
	private By createNewAccunt = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	private By userName = By.name("usernameRegisterPage");
	private By Email = By.name("emailRegisterPage");
	private By Passoword = By.name("passwordRegisterPage");
	private By ConfirmPassoword = By.name("confirm_passwordRegisterPage");
    private By firstName = By.name("first_nameRegisterPage");
    private By lastName = By.name("last_nameRegisterPage");
    private By phoneNumber = By.name("phone_numberRegisterPage");
    private By country = By.name("countryListboxRegisterPage");
    private By city = By.name("cityRegisterPage");
    private By address= By.name("addressRegisterPage");
    private By state = By.name("state_/_province_/_regionRegisterPage");
    private By postal = By.name("postal_codeRegisterPage");
    private By checkBoxIgred = By.name("i_agree");
    private By btnRegister = By.id("register_btnundefined");
	
    
    // Elementos para realizar Login
    
    private By userNameLogin = By.name("username");
    private By passowordLogin = By.name("password");
    private By checkboxremember = By.name("remember_me");
    private By btnSign = By.id("sign_in_btnundefined");
    private By nome = By.xpath("//*[@id=\"menuUserLink\"]/span");
    
    
    
    
    
    
    
    
    
    
    
    
    public By getNome() {
		return nome;
	}
	public By getUserNameLogin() {
		return userNameLogin;
	}
	public By getPassowordLogin() {
		return passowordLogin;
	}
	public By getCheckboxremember() {
		return checkboxremember;
	}
	public By getBtnSign() {
		return btnSign;
	}
	public By getUser() {
		return user;
	}
	public By getCreateNewAccunt() {
		return createNewAccunt;
	}
	public By getUserName() {
		return userName;
	}
	public By getEmail() {
		return Email;
	}
	public By getPassoword() {
		return Passoword;
	}
	public By getConfirmPassoword() {
		return ConfirmPassoword;
	}
	public By getFirstName() {
		return firstName;
	}
	public By getLastName() {
		return lastName;
	}
	public By getPhoneNumber() {
		return phoneNumber;
	}
	public By getCountry() {
		return country;
	}
	public By getCity() {
		return city;
	}
	public By getAddress() {
		return address;
	}
	public By getState() {
		return state;
	}
	public By getPostal() {
		return postal;
	}
	public By getCheckBoxIgred() {
		return checkBoxIgred;
	}
	public By getBtnRegister() {
		return btnRegister;
	}
    



}
