// Powered by Infostretch 

timestamps {

node () {

	stage ('verifyfreestyle - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'ramanasanjoo', url: 'https://github.com/ramanasanjoo/demoshared.git']]]) 
	}
// Unable to convert a build step referring to "hudson.plugins.ws__cleanup.PreBuildCleanup". Please verify and convert manually if required.
// Unable to convert a build step referring to "hudson.plugins.timestamper.TimestamperBuildWrapper". Please verify and convert manually if required.
// Unable to convert a build step referring to "hudson.plugins.toolenv.ToolEnvBuildWrapper". Please verify and convert manually if required.
	stage ('verifyfreestyle - Post build actions') {
/*
Please note this is a direct conversion of post-build actions. 
It may not necessarily work/behave in the same way as post-build actions work.
A logic review is suggested.
*/
		// Mailer notification
		step([$class: 'Mailer', notifyEveryUnstableBuild: true, recipients: 'ramanasanjoo@gmail.com', sendToIndividuals: false])
 
	}
}
}