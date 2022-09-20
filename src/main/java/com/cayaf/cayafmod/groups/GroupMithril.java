package com.cayaf.cayafmod.groups;

import com.cayaf.cayafmod.items.ItemsInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

public class GroupMithril extends CreativeModeTab
{
    public GroupMithril()
    {
        super("mithril_group");
    }

    @Override
    public @NotNull ItemStack makeIcon()
    {
        return new ItemStack(ItemsInit.RAW_MITHRIL.get());
    }
}
