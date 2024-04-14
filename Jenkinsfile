pipeline {
   agent {
     label "${params.AGENT_LABEL ?: 'master'}"
   }
   stages {
     stage('env') {
       steps {
          script {
            if (isUnix()) {
              sh "env|sort"
            } else {
              bat "set"
            }
          }          
       }
     }
     stage('gradle-build') {
       steps {
          script {
            if (isUnix()) {
              sh "./gradlew clean build"
            } else {
              bat "gradlew.bat clean build"
            }
          }          
       }
     }
   }
   post {
     always {
      recordIssues enabledForFailure: true, 
                  tools: [pmdParser(pattern: '**/pmd/main.xml', reportEncoding: 'UTF-8'),
                          spotBugs(pattern: '**/spotbugs/main.xml', reportEncoding: 'UTF-8'),
                          checkStyle(pattern: '**/checkstyle/main.xml', reportEncoding: 'UTF-8')]

      junit allowEmptyResults: true, keepLongStdio: true, testResults: '**/test-results/test/TEST-*.xml'
      
      jacoco()

      script {
        try {

          if(env.gitlabMergeRequestIid){
              ViolationsToGitLab([apiTokenCredentialsId: 'gitlab-api-token-text',
                            apiTokenPrivate: false, 
                            authMethodHeader: false, 
                            commentOnlyChangedContentContext: 999999, 
                            createSingleFileComments: true, 
                            enableLogging: true, 
                            gitLabUrl: 'https://gitlab.com/', 
                            maxNumberOfViolations: 999999, 
                            mergeRequestIid: "$gitlabMergeRequestIid", 
                            projectId: "$gitlabMergeRequestTargetProjectId", 
                            violationConfigs: [[parser: 'PMD', pattern: '.*/pmd/.*\\.xml$', reporter: 'pmd'], 
                                                [parser: 'CHECKSTYLE', pattern: '.*/checkstyle/.*\\.xml$', reporter: 'checkstyle'], 
                                                [parser: 'FINDBUGS', pattern: '.*/spotbugs/.*\\.xml$', reporter: 'spotbugs']],
                            commentTemplate: '''**Reporter**: {{violation.reporter}}{{#violation.rule}}

**Rule**: {{violation.rule}}{{/violation.rule}}
**Severity**: {{violation.severity}}
**File**: {{changedFile.filename}} L{{violation.startLine}}{{#violation.source}}

**Source**: {{violation.source}}{{/violation.source}}

{{violation.message}}'''
                  ])
          }                
        } catch (ignore) {}
      } 
    }
  }
}