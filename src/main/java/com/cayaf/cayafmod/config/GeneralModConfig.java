package com.cayaf.cayafmod.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class GeneralModConfig
{   
	public static ForgeConfigSpec.IntValue RING_VEINER_COOLDOWN;
    public static ForgeConfigSpec.BooleanValue REVERSE_RING_VEINER;
    public static ForgeConfigSpec.BooleanValue DELAY_BREAK_MODE_VEINER;
    
    public static void init(ForgeConfigSpec.Builder SERVER_BUILDER)
    {      
        SERVER_BUILDER.comment("Misc Ring Settings").push("misc_ring_settings");

        RING_VEINER_COOLDOWN = SERVER_BUILDER.comment("Number of ticks duration for the Ring of the Veiner cooldown [0-240, default: 80]").defineInRange("ringVeinerCooldown", 80, 0, 120);
        REVERSE_RING_VEINER = SERVER_BUILDER.comment("Reverse the drop/no drops feature on Ring of Veiner [true / false]").define("reverseRingVeiner", true);
        DELAY_BREAK_MODE_VEINER = SERVER_BUILDER.comment("Uses a delayed break mode to reduce stutter and potential lag [true / false]").define("delayedBreakMode", true);
        
        SERVER_BUILDER.pop();
    }
}