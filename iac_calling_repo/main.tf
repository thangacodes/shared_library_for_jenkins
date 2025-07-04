provider "aws" {
  region = "ap-south-1"
}

module "ec2-create" {
  source   = "git::https://github.com/thangacodes/terraform.git//enterprise_level_tfmodule_calling/ec2/modules/ec2?ref=v0.0.1"
  image_id = "ami-0d03cb826412c6b0f"
  vm_spec  = "t2.micro"
  keyname  = "bastion"
  sgp      = ["allowed-all-ports"]
  tagging = {
    Name        = "mod-invoke-vm"
    Environment = "dev"
    TFVersion   = "v1.12.1"
    Owner       = "admin@try-devops.xyz"
  }
}

# output section
output "modvm_publicip" {
  value = module.ec2-create.modvm_publicip
}
output "modvm_privateip" {
  value = module.ec2-create.modvm_privateip
}
output "modvm_tagging" {
  value = module.ec2-create.modvm.tagging
}
