def call(String repoUrl = 'https://github.com/thangacodes/terraform_sharelibs.git', String cloneDir = 'terraform_sharelibs') {
    echo "Cloning the GitHub repo: ${repoUrl}"
    try {
        // Remove old clone if it exists (optional safety)
        if (fileExists(cloneDir)) {
            echo "Directory '${cloneDir}' already exists. Deleting it to avoid conflicts..."
            sh "rm -rf ${cloneDir}"
        }
        // Clone the repo
        sh "git clone ${repoUrl} ${cloneDir}"
        echo "Repository cloned successfully into '${cloneDir}'"
    }
    catch (Exception e) {
        echo "Git clone failed: ${e.getMessage()}"
        throw e
    }
}
