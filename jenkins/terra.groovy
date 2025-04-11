def tfinit() {
  sh """
  echo 'terraform init in progress...'
  cd ec2_spinup
  pwd
  terraform init
""" 
}
def tffmt() {
  sh """
  echo 'terraform format in progress...'
  cd ec2_spinup
  pwd
  terraform fmt
  """
}
def tfvalidate() {
  sh """
  echo 'terraform validate in progress...'
  cd ec2_spinup
  pwd
  terraform validate
"""
}
def tfplan() {
  sh """
  echo 'terraform plan in progress...'
  cd ec2_spinup
  pwd
  terraform plan
"""
}
return this
