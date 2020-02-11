# minecraft-mod-demo
A Minecraft mod demo based on Minecraft 1.12.2 and Java.

### Issues
Minecraft 1.12.2 mod development can't with IntelliJ IDEA, when you debug your mod with IntelliJ IDEA, it will show ERRORs about some resource files could not be found, I tried a lot of mod source code, all the same problems.
So for developers, go back to Eclipse IDE...

### Get code ready
Clone the repo:
```
git clone git@github.com:wilsonwu/minecraft-mod-demo.git
```
![Files ready](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/1-project-files-ready.png)

Download and Install Eclipse from: https://www.eclipse.org/downloads/

Open Eclipse IDE and select a workspace for your projects:
![Open Eclipse IDE](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/2-open-eclipse-select-workspace.png)

For Windows open PowerShell and for MacOS open default terminal:
For Windows run:
```
./gradlew setupDevWorkspace eclipse
```
```
./gradlew setupDecompWorkspace eclipse
```
```
./gradlew build
```
For MacOS run:
```
gradlew setupDevWorkspace eclipse
```
```
gradlew setupDecompWorkspace eclipse
```
```
gradlew build
```
After you see BUILD SUCCESSFUL, that you can go ahead.

If obscure Gradle issues are found try running:
```
gradlew clean
```
```
gradlew cleanCache
```

Go to Eclipse IDE and open your project:
![Open project](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/3-open-project.png)
![Choose folder](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/4-choose-folder.png)

### Run Minecraft from TLauncher (Skip the "Install Forge" step if you use TLauncher)
If you have TLauncher to run Minecraft skip the Forge install, install and run the Forge 1.12.2 derictly.
TLauncher Home Page: https://tlauncher.org/

### Install Forge (If you don't run Minecraft with TLauncher)
Go to Forge 1.12.2 download page to get Forge 1.12.2:
Download Page: https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html
![Download Windows Installer of Forge](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/5-go-to-forge-1.12.2-download-page.png)

Install Forge client:
![Forge install file](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/6-get-forge-1.12.2-file.png)
![Install Forge client](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/7-install-forge-client.png)

### Debug mod
Go back to Eclipse IDE again, now you can see a file named "minecraft-mod-demo_Client.launch", right click it and select "Run As" -> "1 minecraft-mod-demo_Client":
![Start debug](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/8-start-debug.png)

Now you can see the Minecraft 1.12.2 started:
![Start play](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/9-start-play.png)

Then start a new single player game:
![Start new game](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/10-start-new-game.png)

You can find your mod works:
![Get sword](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/11-get-your-mod-works.png)

Enjoy your game!