#!/bin/sh

# Install Eclipse.
rm -rf $ECLIPSE_HOME
mkdir $ECLIPSE_HOME
cd $ECLIPSE_HOME; cd ../
curl $ECLIPSE_DOWNLOAD | tar zx

# Remove vm args.
cd $ECLIPSE_HOME
sed -i 's|-Xms[0-9]*m||' eclipse.ini
sed -i 's|-Xss[0-9]*m||' eclipse.ini
sed -i 's|-Xmx[0-9]*m||' eclipse.ini
sed -i 's|-XX:MaxPermSize=[0-9]*m||' eclipse.ini
sed -i '/^$/d' eclipse.ini
perl -pi -e "s/^\r\n//" eclipse.ini

# Add own default vmwargs.
echo "-Xms256m" >> eclipse.ini
echo "-Xss8m" >> eclipse.ini
echo "-Xmx1024m" >> eclipse.ini
echo "-XX:MaxPermSize=256m" >> eclipse.ini
echo "-server" >> eclipse.ini

# Install Spoofax and JSch.
java -Xmx512m -jar plugins/org.eclipse.equinox.launcher_*.jar  \
     -application org.eclipse.equinox.p2.director \
     -metadataRepository $ALL_SITES \
     -artifactRepository $ALL_SITES \
     -installIU $ALL_FEATURES \
     -data ../data \
     -consolelog
