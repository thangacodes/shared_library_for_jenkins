@Library('terraform_iac'@master') _
node
{
   stage('GitCheckout')
   {
       sourceCheckout("https://github.com/send2durai/ansible-notes.git","master")
	}
}
