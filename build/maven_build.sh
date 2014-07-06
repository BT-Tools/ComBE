#!/bin/sh

cd $PROJECT_DIR

# Clean up.
rm pom.xml
rm */pom.xml
rm */poma.xml

# Generate poms.
mvn org.eclipse.tycho:tycho-pomgenerator-plugin:generate-poms -Dversion=$Dversion -DgroupId=$DgroupId -Dtycho.targetPlatform=$ECLIPSE_HOME

# Maven package.
mvn package -Dtycho.targetPlatform=$ECLIPSE_HOME -e
