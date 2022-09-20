package com.cayaf.cayafmod;

import com.cayaf.cayafmod.blocks.BlocksInit;
import com.cayaf.cayafmod.config.ModConfig;
import com.cayaf.cayafmod.enchantments.EnchantmentsInit;
import com.cayaf.cayafmod.groups.GroupMithril;
import com.cayaf.cayafmod.loot_modifiers.DataProvider;
import com.cayaf.cayafmod.groups.GroupCayafMod;
import com.cayaf.cayafmod.items.ItemsInit;
import com.cayaf.cayafmod.loot_modifiers.LootModifiersInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CayafMod.MODID)
public class CayafMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "cayafmod";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static final CreativeModeTab cayaf_mod_group = new GroupCayafMod();
    public static final CreativeModeTab mithril_group = new GroupMithril();


    public CayafMod()
    {
        ModConfig.loadConfig(ModConfig.CONFIG, FMLPaths.CONFIGDIR.get().resolve("cayafmod-general.toml"));
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlocksInit.BLOCKS.register(eventBus);
        EnchantmentsInit.ENCHANTMENTS.register(eventBus);
        ItemsInit.ITEMS.register(eventBus);
        LootModifiersInit.GLM.register(eventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public static void runData(GatherDataEvent event)
    {
        event.getGenerator().addProvider(event.includeServer(), new DataProvider(event.getGenerator(), MODID));
    }

}
