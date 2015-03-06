ComBE
=======

ComBE is a real-time synchronized textual and graphical editor for Behavior Trees.

- Website: http://bt-tools.github.com/ComBE/
- Issue tracking: http://yellowgrass.org/project/ComBE


Developers
----------
Feel free to fork the repo.

This is how you can build the tool:

- Make sure to have JDK 7 installed.
- Download Eclipse Kepler (any package solution): http://www.eclipse.org/downloads/
- Change your eclipse.ini as explained here: http://metaborg.org/wiki/spoofax/download
- Make sure that Eclipse uses JDK 7 and not JDK 6. You can set this by going to 'Window -> Preferences -> Java -> Compiler'
- Install Spoofax Core + Spoofax Modelware by pointing your Eclipse update manager to http://download.spoofax.org/update/release/1.4.0
- Import the projects from https://github.com/oskarvanrest/ComBE into your workspace.
- Open file org.behaviorengineering.combe.graphical/model/ComBE.genmodel, right-click on the top-most node in the editor and choose 'Generate All'
- Right-click on org.behaviorengineering.combe.graphical/model/ComBE.gmfgen and choose 'Generate diagram code'
- Go to 'Run -> Run Configurations' and double-click on 'Eclipse Application'. Then choose 'Run'. You can then use ComBE in the new Eclipse instance.

Notes:

- Changes made to the textual editor can directly be tested in the same Eclipse instance by building the project (Project -> Build Project). This is not the case for changes made to the graphical editor (a second Eclipse instance is needed).
