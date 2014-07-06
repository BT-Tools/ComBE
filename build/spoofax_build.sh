#!/bin/sh

export LOCALCLASSPATH="utils/aster.jar:utils/make_permissive.jar:utils/sdf2imp.jar:utils/strategoxt.jar"
export ANT_OPTS="-Xss8m -Xmx2048m"

NATIVE_PREFIX=`find $ECLIPSE_HOME -wholename *plugins/org.strategoxt.imp.nativebundle_*/native/linux`
export PATH=$PATH:$NATIVE_PREFIX

# Make sdf2table and implodePT exectutable. This is necessary when the installed Eclipse has never been start up.
cd $NATIVE_PREFIX
chmod u+x sdf2table
chmod u+x implodePT

cd $PROJECT_DIR
for d in */build.main.xml ; do
  cd `dirname $d`
  mkdir -p utils 
  cp -Rv `find $ECLIPSE_HOME -name strategoxt.jar` utils/
  cp -Rv `find $ECLIPSE_HOME -name aster.jar` utils/
  cp -Rv `find $ECLIPSE_HOME -name sdf2imp.jar` utils/
  cp -Rv `find $ECLIPSE_HOME -name make_permissive.jar` utils/
  ant -f build.main.xml -Declipse.spoofaximp.jars=utils all -Declipse.home=$ECLIPSE_HOME
  if [ ! $? -eq 0 ]; then exit 1; fi
  cd ..
done
