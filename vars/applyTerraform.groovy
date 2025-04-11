def call(String terraformDir = 'shared_library_for_jenkins/tfscripts/users_creation') {
    echo "Starting Terraform Apply in directory: ${terraformDir}"
    try {
        // Check if the directory exists before attempting to cd into it
        if (!fileExists(terraformDir)) {
            error "Terraform directory '${terraformDir}' does not exist. Aborting."
        }
        // Run Terraform apply
        sh """
            cd ${terraformDir}
            terraform init -input=false
            terraform apply -auto-approve
            echo "Terraform apply completed successfully."
        """
       } 
    catch (Exception e) {
        echo "Terraform apply failed: ${e.getMessage()}"
        throw e
    }
}
