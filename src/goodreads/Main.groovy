package goodreads

import geb.Browser

class Main {
	
	static void main(String... args) {
		Browser.drive {
			to LoginPage
			emailField = "dulshani.gunawardhana89@gmail.com"
			passwordField = "Winner1!"
        	submitButton.click()
			at ListingPage
			try{
				println "Entered"
				GiveawayListItem.each {
					if(GiveawayButton.present){
						GiveawayButton.click()
						at GiveawayPage
							SelectAddressButton.click()
							termsCheckBox.value(true)
							EnterGiveawayButton.click()
							println "*" + GiveawayTitle.text()
							to ListingPage
					}
				}} finally {
					println "Keep your fingers crossed: to strike books!"
				}
}}}
