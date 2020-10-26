def call(String whoAreYou) {
	
	echo "Build #,  ${env.BUILd_NUMBER}"
	
	echo "Params ::, ${params}"
	echo "Now we're being called more magically, ${whoAreYou}, thanks to the call(...) method."
	
}

return this;