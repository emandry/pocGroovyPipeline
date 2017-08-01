pipeline {
	agent any
	stages {
		stage ("Prueba") {
			steps {
library identifier: '', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '41c237a7-374b-4800-a7dd-b2190859ebc5', id: '3359e171-97f2-4fce-9e99-c73a38d94601', remote: 'git@github.com:emandry/pocGroovyPipeline.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait'], headWildcardFilter(excludes: '', includes: '*.groovy')]])
load 'test.groovy' 
			}
		}
	}
}
