package com.imjustseiyin.item;

import com.imjustseiyin.util.BlueprintType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;

import java.util.List;

public class BlueprintItem extends Item {
    BlueprintType type;
    public BlueprintItem(Settings settings, BlueprintType type) {
        super(settings);
        this.type = type;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType tooltipType) {
        tooltip.add(Text.translatable(type == BlueprintType.GARDEN ? "tooltip.justoutdoorstuffs.garden" : "tooltip.justoutdoorstuffs.patio"));
        super.appendTooltip(stack, context, tooltip, tooltipType);
    }
}
