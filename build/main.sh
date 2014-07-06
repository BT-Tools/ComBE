#!/bin/sh
# Make sure to have Maven 3 and ANT installed and have JDK 7 set as the default JDK.
# This script takes two arguments:
#   $1: parent dir of repository clone 
#   $2: the parent dir of where Eclipse is installed or should otherwise be installed
#
set -e

# Convert relative paths $1 and $2 to absolute paths

export CLONE_DIR=`cd $1; pwd`
export ECLIPSE_HOME=`cd $2; pwd`/eclipse

# More variables
export PROJECT_DIR=$CLONE_DIR/ComBE
export Dversion="1.0.0.qualifier"
export DgroupId="mygroup"
export GMF_GEN_ANT=$PROJECT_DIR/org.behaviorengineering.combe.graphical/generate.xml
export ECLIPSE_DOWNLOAD=http://carroll.aset.psu.edu/pub/eclipse/technology/epp/downloads/release/kepler/SR1/eclipse-modeling-kepler-SR1-linux-gtk-x86_64.tar.gz
SPOOFAX_UPDATE="http://hydra.nixos.org/job/spoofax/spoofax-modelware/build/latest/download/1/update"
export ALL_SITES=$ECLIPSE_UPDATE,$SPOOFAX_UPDATE
export ALL_FEATURES=org.spoofax.modelware.gmf.feature.feature.group

# Install Eclipse and Spoofax, but only if folder $ECLIPSE_HOME doesn't exists yet
 if [ ! -d $ECLIPSE_HOME ]; then
   sh $PROJECT_DIR/build/setup_eclipse.sh
fi

# EMF and GMF code generation
# sh $PROJECT_DIR/build/generate_gmf_code.sh

# Spoofax build
# sh $PROJECT_DIR/build/spoofax_build.sh

# Generate Eclipse update site using Maven
sh $PROJECT_DIR/build/maven_build.sh

