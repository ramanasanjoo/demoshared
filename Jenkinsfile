// Powered by Infostretch 

timestamps {

node () {

	stage ('SampleFreestyle - Checkout') {
 	 checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'ramanasanjoo', url: 'https://github.com/ramanasanjoo/demoshared.git']]]) 
	}
	stage ('SampleFreestyle - Build') {
 	
// Unable to convert a build step referring to "hudson.plugins.ws__cleanup.PreBuildCleanup". Please verify and convert manually if required.
// Unable to convert a build step referring to "hudson.plugins.timestamper.TimestamperBuildWrapper". Please verify and convert manually if required.
// Unable to convert a build step referring to "jenkins.plugins.mvn__snapshot__check.MavenSnapshotCheck". Please verify and convert manually if required.		// Shell build step
sh """ 
sh $BRANCH_NAME 
 """ 
	}
}
}