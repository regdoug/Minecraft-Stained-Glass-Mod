/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

public class ItemColoredSandStone extends ItemBlock
{

    public ItemColoredSandStone(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getIconIndex(ItemStack itemstack)
    {
        return StainedGlassConstants.sandstoneExample.getBlockTextureFromSideAndMetadata(2, BlockColoredSand.func_21034_c(itemstack.getItemDamage()));
    }

    @Override
    public int func_21012_a(int i)
    {
        return i;
    }

    @Override
    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(super.getItemName()).append(".").append(ItemDye.dyeColors[BlockCloth.func_21034_c(itemstack.getItemDamage())]).toString();
    }
}
