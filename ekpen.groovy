@Library('Jenkins-Shared-Library') _
pipeline {
agent any
stages{
stage('CheckoutCode')
{
steps
{
git branch: 'development', credentialsId: '6773dc34-a3fd-44ec-b1ee-
3d2f0aa9f346', url: https://github.com/LandmakTechnology/maven-web-
application.git'}
}
}
stage("Build"){
steps{
stages("Build")
}
}
stage("Execute SonarQube Report"){
steps{
stages("SonarQube Report")
stage("Upload Artifacts Into Nexus"){
steps{
stages("Upload Into Nexus")
}
}
}// Stages Close
} // Pipeline Close
To get the build parameters...
parameters {
string(name: 'GoalName', defaultValue: 'Package', description: 'Pass the Maven Goals')
choice(name: 'BranchName', choices: ['master', 'development', 'stage'], description:
'Pick the Branch Name.')

}

stages{
stage('CheckoutCode')
{
steps
{
git branch: "${params.BranchName}", credentialsId: '6773dc34-a3fd-44ec-b1ee-
3d2f0aa9f346', url: ' https://github.com/LandmakTechnology/maven-web-application.git'
}
}
