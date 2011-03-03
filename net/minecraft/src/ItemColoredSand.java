package net.minecraft.src;

public class ItemColoredSand extends ItemBlock
{

    public ItemColoredSand(int i)
    {
        super(i);
        setMaxDamage(0);
        setHasSubtypes(true);
    }

    @Override
    public int getIconIndex(ItemStack itemstack)
    {
        return StainedGlassConstants.redSand.getBlockTextureFromSideAndMetadata(2, BlockColoredSands.func_21034_c(itemstack.getItemDamage()));
    }

    public int func_21012_a(int i)
    {
        return i;
    }

    public String getItemNameIS(ItemStack itemstack)
    {
        return (new StringBuilder()).append(super.getItemName()).append(".").append(ItemDye.dyeColors[BlockCloth.func_21034_c(itemstack.getItemDamage())]).toString();
    }
}
