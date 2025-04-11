def call(String terraformDir = 'shared_library_for_jenkins/tfscripts/users_creation') {
    echo "Starting Terraform initialization in directory: ${terraformDir}"
    try {
        // Validate the directory
        if (!fileExists(terraformDir)) {
            error "Terraform directory '${terraformDir}' not found. Initialization aborted."
        }
        // Run terraform init
        sh """
            cd ${terraformDir}
            terraform init -input=false
        """
        echo "Terraform initialization completed successfully."
    }
    catch (Exception e) {
        echo "Terraform initialization failed: ${e.getMessage()}"
        throw e
    }
}
