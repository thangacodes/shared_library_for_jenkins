def call(String terraformDir = 'shared_library_for_jenkins/user_account') {
    echo "Starting Terraform state refresh in directory: ${terraformDir}"
    try {
        // Validate directory
        if (!fileExists(terraformDir)) {
            error "Terraform directory '${terraformDir}' not found. Refresh aborted."
        }
        // Run terraform init and refresh
        sh """
            cd ${terraformDir}
            terraform init -input=false
            terraform refresh -input=false
            echo "Terraform state refresh completed successfully."
        """
    }
    catch (Exception e) {
        echo "Terraform refresh failed: ${e.getMessage()}"
        throw e
    }
}
