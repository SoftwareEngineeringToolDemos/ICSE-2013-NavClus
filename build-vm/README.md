## Please follow these steps to spinup a Virtual Machine for NavClus:

1. Install <a href="https://www.vagrantup.com/downloads.html">Vagrant</a> and <a href="https://www.virtualbox.org/wiki/Downloads">VirtualBox</a> on the host machine.
2. Install <a href="https://github.com/aidanns/vagrant-reload">vagrant reload plugin</a> using the command "vagrant plugin install vagrant-reload"
3. Download the <a href="https://github.com/SoftwareEngineeringToolDemos/ICSE-2013-NavClus/blob/master/build-vm/Vagrantfile">Vagrantfile</a> from <a href="https://github.com/SoftwareEngineeringToolDemos/ICSE-2013-NavClus/tree/master/build-vm">build-vm</a> directory to your machine.
4. In the host, cd into the directory that contains the Vagrantfile and run the command "vagrant up"

## Note:

* The VM boots up quickly and can be viewed from Virtual Box. But the "vagrant up" command runs for approximately half an hour.
* The base box on which this VM is built is <a href=https://atlas.hashicorp.com/hashicorp/boxes/precise32>Ubuntu Server 12.04</a>
* VM login details:<br/>
Username: vagrant<br/>
Password: vagrant

## Acknowledgements:
* The commands for installing Java 8 have been taken from <a href="https://github.com/aglover">Andrew Glover's<a> <a href="https://github.com/aglover/ubuntu-equip">github repository</a>.
* The commands for installing Eclipse in have been taken from <a href="http://blog.versioneye.com/2015/05/05/setting-up-a-dev-environment-with-vagrant/">this blog</a>.
* <a href="http://www.dev9.com/article/2014/9/dev-environments-with-vagrant">Vagrant tutorial</a> by Dustin Barnes
