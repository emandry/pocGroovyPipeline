
pipeline {
	agent any
	stages {
		stage ("Prueba") {
			steps {
//library identifier: 'test.groovy@master', retriever: modernSCM([$class: 'GitSCMSource', credentialsId: '9d4a4938-d295-49c2-8954-e713bfc3fe9b', remote: 'git@github.com:emandry/pocGroovyPipeline.git', traits: [[$class: 'jenkins.plugins.git.traits.BranchDiscoveryTrait'], headWildcardFilter(excludes: '', includes: '*.groovy')]])
load 'vars/test.groovy' 

script {
	print getBuildGitInfo(params.BuildNumber.toInteger())
}
			}
		}
	}
}
