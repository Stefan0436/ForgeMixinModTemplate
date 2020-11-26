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
3. If you are using Linux or MacOS, run: `chmod ug=rwx gradlew`

## IDE Setup: If you are using Eclipse-JEE (fully functional):
1. Run the following commands depending on your OS:<br/>
2. Windows: `gradlew genEclipseRuns eclipse`<br/>
3. Linux/MacOS: `./gradlew genEclipseRuns eclipse`<br/>
<br/>

4. Open Eclipse-JEE and open your workspace<br/>
5. If you have the welcome page open, click 'Workbench' or 'Hide' in the top right corner<br/>
6. Press the keys: ALT+F
7. Click Import
8. Open the category 'Gradle' and select 'Existing Gradle Project'
9. Click next until you get to the import page
10. Click browse (next to the 'Project root directory' box)
11. Select the mod development kit folder
12. Click Finish

## IDE Setup: If you are using IntelliJ (not tested):
1. Run the following commands depending on your OS:<br/>
2. Windows: `gradlew genIntellijRuns`<br/>
3. Linux/MacOS: `./gradlew genIntellijRuns`<br/>
4. Search online for importing a Forge project in IntelliJ

## Mod Setup:
1. Upcoming
<br/><br/>

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
