package goodreads;

import geb.Page

public class LoginPage extends Page {
	static url = "https://www.goodreads.com/user/sign_in?returnurl=%2Fgiveaway"
	static content = {
		loginForm { $("form[id=emailForm]") }
		emailField { $("input[id=user_email]") }
		passwordField { $("input[id=user_password]") }
		submitButton { $("input[type=submit]") }
	}
}
