package com.cayaf.cayafmod.group;



import com.cayaf.cayafmod.CayafMod;
import com.cayaf.cayafmod.items.ItemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GroupCayafMod extends CreativeModeTab
{
    public GroupCayafMod()
    {
        super("cayaf_mod");
    }

    @Override
    public @NotNull ItemStack makeIcon()
    {
        return new ItemStack(ItemsInit.BLOOD_LUST_REGISTRY_OBJECT.get());
    }
}
