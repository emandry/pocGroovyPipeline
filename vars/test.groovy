println "HELLO EVERYONE"

BUILD_JOB_NAME = "My Multibranch Java Project/development"
def getJob() {
    def hi = Hudson.instance
    return hi.getItemByFullName(BUILD_JOB_NAME)
}
def getBuildGitInfo(Integer buildNumber) {
    def gitInfo = "" 
    println "INSIDE"
    
    def buildJob = getJob()
    
    buildJob.getBuildByNumber(buildNumber).getChangeSets().each { elem->
        elem.each { datos->
            print "#########################"
	    print datos
            print "#########################"
	    def affectedPathsData = datos.getAffectedPaths().join()
            gitInfo = gitInfo + "Commit ID(Revision): " + datos.getCommitId() + "\nCommit Message: " + datos.getMsg() + "\nAffected Path: " + affectedPathsData + "\nAuthor: " + datos.getAuthor() + "\n"
        }
    }
    return gitInfo
}

print getBuildGitInfo(46)
