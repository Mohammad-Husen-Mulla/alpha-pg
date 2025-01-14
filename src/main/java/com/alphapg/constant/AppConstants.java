package com.alphapg.constant;

public class AppConstants {
	
	private AppConstants() {
		
	}
	
	 // API Endpoint Constants
    public static final String BASE_URL = "https://api.yourapp.com/";
    public static final String REGISTRATION_URL = BASE_URL + "user/register";
    public static final String LOGIN_URL = BASE_URL + "user/login";
    
    // Request Parameter Keys
    public static final String PARAM_USERNAME = "username";
    public static final String PARAM_EMAIL = "email";
    public static final String PARAM_PASSWORD = "password";
    public static final String PARAM_CONFIRM_PASSWORD = "confirm_password";
    
    // Response Keys
    public static final String RESPONSE_STATUS = "status";
    public static final String RESPONSE_MESSAGE = "message";
    public static final String RESPONSE_USER_ID = "user_id";
    public static final String RESPONSE_TOKEN = "token";
    
    // Registration Status
    public static final int STATUS_SUCCESS = 1;
    public static final int STATUS_FAILED = 0;
    
    // Error Messages
    public static final String ERROR_INVALID_EMAIL = "Invalid email format";
    public static final String ERROR_USER_NOTFOUND = "User not found";
    public static final String ERROR_PASSWORD_MISMATCH = "Passwords do not match";
    public static final String ERROR_USERNAME_EXISTS = "Username already exists";
    public static final String ERROR_EMAIL_EXISTS = "Email already exists";
    public static final String ERROR_PHONE_EXISTS = "Phone number already exists";
    public static final String ERROR_UNKNOWN = "An unknown error occurred. Please try again later.";
    
    // Regex Patterns
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
    public static final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$"; // at least 1 digit, 1 lowercase, 1 uppercase, and minimum 6 characters
    
    // SharedPreferences Keys
    public static final String PREF_USER_LOGGED_IN = "user_logged_in";
    public static final String PREF_USER_ID = "user_id";
    public static final String PREF_USER_TOKEN = "user_token";
    
    // Registration Success Message
    public static final String REGISTRATION_SUCCESS_MESSAGE = "Registration successful! Please check your email to verify your account.";
    
    // Successfull Process
    public static final String PROCESS_SUCC_MSG="Process completed successfully";
}
