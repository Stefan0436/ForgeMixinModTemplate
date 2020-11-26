package com.example.examplemod.mixins;

import org.spongepowered.asm.mixin.injection.At;

import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.chunk.listener.IChunkStatusListener;
import net.minecraft.world.server.ServerWorld;

@Mixin(MinecraftServer.class) // Create a mixin for MinecraftServer

// Lets create a mixin class, class names don't matter but it is recommended to create a clear one
// For injections, you should use an abstract class
// When you have added one, remember to specify the class name in the mixins section of the mixins.<modid>.json file
public abstract class ExampleMixin {

	@Shadow
	@Final
	private static Logger LOGGER; // Get the server logger

	@Shadow
	@Final
	public abstract ServerWorld func_241755_D_(); // Get the func_241755_D_ method

	
	
	// Lets inject code at the end (RETURN) of the loadInitialChunks method
	//
	// First you create a method with the same modifiers, then you name it to something like:
	// loadInitialChunksReturn (don't name it loadInitialChunks or the method you are trying to inject code in)
	// 
	// Then you add the original method parameters, note: naming does not matter
	// After which, in all injections, you need to add a CallbackInfo parameter at the end (mandatory)
	//
	// Okay, then you add the @Inject() annotation with the information:
	// @Inject(method = "theMethodName", at = @At("RETURN")) - Inject at end of method
	// @Inject(method = "theMethodName", at = @At("HEAD")) - Inject at beginning of method
	//
	// Then in the new method, you can write the code you want to inject.
	//
	// Refer to https://github.com/SpongePowered/Mixin/wiki/ for more information
	// Take a look at the example below:
	@Inject(method = "loadInitialChunks", at = @At("RETURN"))
	private void loadInitialChunksReturn(IChunkStatusListener listener, CallbackInfo ci) {

		ServerWorld world = this.func_241755_D_(); // See MinecraftServer#loadInitialChunks (second line)
		BlockPos spawn = world.getSpawnPoint(); // Get the world spawn
		String loc = world.getDimensionKey().getLocation().toString(); // Get the dimension name

		// Lets print the world and spawn to the console:
		LOGGER.info("loadInitialChunks finished, World: " + loc + ", SPAWN: " + spawn.getX() + ":" + spawn.getY());
	}

}