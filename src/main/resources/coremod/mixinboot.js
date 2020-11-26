function initializeCoreMod() {
    InsnList = Java.type("org.objectweb.asm.tree.InsnList");
    MethodInsnNode = Java.type("org.objectweb.asm.tree.MethodInsnNode");
    AbstractInsnNode = Java.type("org.objectweb.asm.tree.AbstractInsnNode");
    
    return {
        // Injection method of choice: net.minecraft.util.registry.Bootstrap.register
        'Mixin Bootstrap': {
            'target': {
                'type': 'CLASS',
                'name': 'net.minecraft.util.registry.Bootstrap'
            },
            'transformer': function(classNode) {
                print("[Mixin Bootstrap Wrapper] Hello from Mixin Bootstrap Wrapper! Loading ASMAPI and Opcodes...");
                
                var Opcodes = Java.type('org.objectweb.asm.Opcodes');
                
                print("[Mixin Bootstrap Wrapper] Hold Tight! Searching for register method...");
                var methods = classNode.methods;
                for (var i in methods) {
                    var method = methods[i];
                    if (method.name == "register") {
                        print("[Mixin Bootstrap Wrapper] Found method register! Injecting coremod loading method...");
                        
                        var instructions = method.instructions;
                        var newinstruct = new InsnList();
                        
                        var injectLabel = null;
                        for (var i2 = 0; i2 < instructions.size(); i2++) {
                            var inst = instructions.get(i2);
                            if (inst.getType() == AbstractInsnNode.LABEL) {
                                injectLabel = inst;
                                print("[Mixin Bootstrap Wrapper] Found usable injection label: "+inst.toString())
                                break;
                            }
                        }
                        if (injectLabel == null)
                        {
                            print("[Mixin Bootstrap Wrapper] Could not find a usable injection label, coremod unavailable.");
                            return classNode;
                        }
                        newinstruct.add(new MethodInsnNode(Opcodes.INVOKESTATIC, "${groupslashed}/${classname}", "InitCoreMod", "()V", false));
                        instructions.insertBefore(injectLabel, newinstruct);
                        
                        print("[Mixin Bootstrap Wrapper] Injected coremod init method!");
                        method.instructions = instructions;
                        return classNode;
                    }
                }
                
                print("[Mixin Bootstrap Wrapper] Could not find register method, mixin unavailable.");
                return classNode;
            }
        }
    }
}
