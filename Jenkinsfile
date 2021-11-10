pipeline {
   agent {
     label "maven"
   }
   stages {
     stage('pmd') {
       steps {
          echo "pmd"
          sh('mvn pmd:pmd')
       }
     }
   }
   post {
     success {
       echo "scuccess"
       recordIssues(tools: [pmdParser(pattern: 'target/pmd.xml', reportEncoding: 'UTF-8')])
     }
  }
}
