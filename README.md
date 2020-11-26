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
- Proper exception handling in mixins/transformers (**mandatory**, there will be an API)
- Coremod in separate jar from normal mods (**mandatory**)
- Jars must be signed before distributing (**mandatory**)<br/>
<br/>

# Loading class folders as ForgeGradle and MixinGradle plugins 
If you want to load class folders use the following arguments in gradle:
- Add the arguments -PmixinBinFolder "\<Mixin class folder path\>" to load Mixin from a class folder<br/>
- Add the arguments -PmixinGradleBinFolder "\<MixinGradle class folder path\>" to load MixinGradle from a class folder<br/>
- Add the arguments -PforgeGradleBinFolder "\<ForgeGradle class folder path\>" to load ForgeGradle from a class folder.<br/>
<br/>

# Generating eclipse project files
Run the command `gradlew.bat genEclipseRuns eclipse` (`./gradlew genEclipseRuns eclipse` on linux)

