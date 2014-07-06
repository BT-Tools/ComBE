#!/bin/sh

cd $ECLIPSE_HOME

set +e # continue with script if command below fails (for some reason, GMF code generator 'fails' even if it succeeds)
java -Xmx512m -Xms256m -XX:MaxPermSize=512m -DworkspacePath=$PROJECT_DIR -jar plugins/org.eclipse.equinox.launcher_*.jar -data $PROJECT_DIR -application org.eclipse.ant.core.antRunner -buildfile $GMF_GEN_ANT -clean -noSplash
set -e
