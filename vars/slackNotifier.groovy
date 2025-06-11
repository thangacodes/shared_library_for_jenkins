def call(String buildResult) {
  switch(buildResult) {
    case "SUCCESS":
      slackSend color: "good", message: "Job: ${env.JOB_NAME} with build number ${env.BUILD_NUMBER} was successful"
      break
    case "FAILURE":
      slackSend color: "danger", message: "Job: ${env.JOB_NAME} with build number ${env.BUILD_NUMBER} failed"
      break
    case "UNSTABLE":
      slackSend color: "warning", message: "Job: ${env.JOB_NAME} with build number ${env.BUILD_NUMBER} was unstable"
      break
    default:
      slackSend color: "danger", message: "Job: ${env.JOB_NAME} with build number ${env.BUILD_NUMBER} result was unclear"
  }
}
