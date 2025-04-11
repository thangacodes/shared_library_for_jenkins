def call(String terraformDir = 'shared_library_for_jenkins/infraiac/user_account') {
    echo "Starting Terraform destroy in directory: ${terraformDir}"
    try {
        // Validate the directory exists
        if (!fileExists(terraformDir)) {
            error "Terraform directory '${terraformDir}' not found. Aborting destroy."
        }
        // Execute terraform destroy with initialization
        sh """
            cd ${terraformDir}
            terraform init -input=false
            terraform destroy -auto-approve
            echo "Terraform destroy completed successfully."
        """
    } 
    catch (Exception e) {
        echo "Terraform destroy failed: ${e.getMessage()}"
        throw e
    }
}
