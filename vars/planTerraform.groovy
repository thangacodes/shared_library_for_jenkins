def call(String terraformDir = 'shared_library_for_jenkins/tfscripts/users_creation') {
    echo "Terraform plan starting in directory: ${terraformDir}"
    try {
        // Check for directory existence
        if (!fileExists(terraformDir)) {
            error "Directory '${terraformDir}' not found. Plan operation aborted."
        }
        // Execute terraform init and plan
        sh """
            cd ${terraformDir}
            terraform init -input=false
            terraform plan -input=false
            echo "Terraform plan completed successfully."
        """
    } catch (Exception e) {
        echo "Terraform plan failed: ${e.getMessage()}"
        throw e
    }
}
