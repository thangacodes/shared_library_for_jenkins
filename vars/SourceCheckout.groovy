@Library('terraform_iac'@main') _
node
{
   stage('GitCheckout')
   {
       sourceCheckout("https://github.com/send2durai/ansible-notes.git","main")
	}
}
