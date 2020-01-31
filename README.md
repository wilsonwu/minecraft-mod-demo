# minecraft-mod-demo
A Minecraft mod demo based on Minecraft 1.12.2 and Java.

### Get code ready
Clone the repo:
```
git clone git@github.com:wilsonwu/minecraft-mod-demo.git
```
![Files ready](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/project-files-ready.png)

Open IntelliJ IDEA and choose "Import Project":
![Open IntelliJ IDEA](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/open-intellij-idea.png)

Then choose the build.gradle file from the demo source code 'src' folder:
![Import project](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/import-project-gradle.png)

After that the dependeces will be automatically downloaded:
![Project ready](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/gradle-ready.png)

### Build mod
If you want to redownload all of them, run:
For Windows:
```
gradlew genIntellijRuns
```

For Mac / Linux:
```
./gradlew genIntellijRuns
```
In IDEA right click the "build.gradle" file and choose "Build Module ...":
![Build Module](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/ready-to-build.png)

After build finished:
![Build finished](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/build-finished.png)

When all dependences downloaded, go to the Terminal area and run below command:
For Windows:
```
gradlew build
```

For Mac / Linux:
```
./gradlew build
```
![Go to terminal](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/go-to-terminal.png)
![Build in terminal](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/terminal-build-finished.png)

After that get your mod jar file from:
```
build/libs/modid-1.0.jar
```
![Mod file ready](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/get-jar-file.png)

### Run from TLauncher (Skip the "Install Forge" step)
If you have TLauncher to run Minecraft skip the Forge install, run the Forge 1.12.2 derictly.
TLauncher Home Page: https://tlauncher.org/

### Install Forge (If you don't run Minecraft with TLauncher)
Go to Forge 1.12.2 download page to get Forge 1.12.2:
Download Page: https://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.12.2.html
![Download Windows Installer of Forge](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/go-to-forge-1.12.2-download-page.png)

Install Forge client:
![Forge install file](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/get-forge-1.12.2-file.png)
![Install Forge client](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/install-forge-client.png)

### Let's play
Copy the "modid-1.0.jar" file into your Minecraft mods folder
![Install mod](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/paste-to-mods.png)

Run Minecraft 1.12.2:
![Run Minecraft](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/run-minecraft-1.12.2-with-forge.png)
![Run Minecraft](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/check-your-mod.png)

Check your mod status:
![Check mod](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/mod-here.png)

Start a world to play:
![Start to play](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/start-game.png)

Get your new sword:
![Get mod](https://github.com/wilsonwu/minecraft-mod-demo/raw/master/screenshots/get-your-sword.png)

Enjoy your game!