package net.minecraft.src;

public class ItemColoredGlass extends ItemBlock
{

    public ItemColoredGlass(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getIconIndex(ItemStack itemstack)
    {
        return StainedGlassConstants.glassExample.getBlockTextureFromSideAndMetadata(2, BlockColoredSand.func_21034_c(itemstack.getItemDamage()));
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