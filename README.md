# LICENSE NOTE
This repository uses ForgeGradle, MixinGradle and Mixin.<br/>
Those projects belong to their rightful owners.<br/>
<br/>

# Project info
This is a simple template for forge mods with Mixin-support build-in.<br/>
<br/>

# Mod policy
For Mixin-enabled mods, you need Forge coremods and those must adhere to the following conditions:
- Disclose source (**mandatory**, keep it FOSS, Free Open Source Software)
- Proper exception handling in mixins/transformers (**mandatory**)
- Coremod in separate jar from normal mods (**mandatory**)
- Jars must be signed before distributing (**mandatory**)<br/>
<br/>

# Project setup
Here are the steps to creating a Mixin-enabled Forge mod:
1. Clone the git
2. Run the command: `cd ForgeMixinModTemplate`
3. If you are using Linux or MacOS, run: `chmod ug=rwx gradlew`<br/>

IDE Setup: If you are using Eclipse-JEE (fully functional):
4. Run the following commands depending on your OS:<br/>
5. Windows: `gradlew genEclipseRuns eclipse`<br/>
6. Linux/MacOS: `./gradlew genEclipseRuns eclipse`<br/>
<br/>
7. Open Eclipse-JEE and open your workspace<br/>
8. If you have the welcome page open, click 'Workbench' or 'Hide' in the top right corner.<br/>
9. TODO<br/>

IDE Setup: If you are using IntelliJ (not tested):
4. Run the following commands depending on your OS:<br/>
5. Windows: `gradlew genIntellijRuns`<br/>
6. Linux/MacOS: `./gradlew genIntellijRuns`<br/>
7. Search online for importing a Forge project in IntelliJ

Mod Setup:
7. 

# Mod template information:
- Mod loader: **Forge**
- Minecraft version: **1.16.4**
- Default Mixin target version: 0.8.2
- Default minimal Mixin version: 0.7.10
- Forge version: 1.16.4-35.1.3
- ForgeGradle version: 3+
- MixinGralde version: 0.7-SNAPSHOT
<br/><br/>

# Loading class folders as ForgeGradle and MixinGradle plugins 
If you want to load class folders use the following arguments in gradle:
- Add the arguments -PmixinBinFolder "\<Mixin class folder path\>" to load Mixin from a class folder<br/>
- Add the arguments -PmixinGradleBinFolder "\<MixinGradle class folder path\>" to load MixinGradle from a class folder<br/>
- Add the arguments -PforgeGradleBinFolder "\<ForgeGradle class folder path\>" to load ForgeGradle from a class folder.
