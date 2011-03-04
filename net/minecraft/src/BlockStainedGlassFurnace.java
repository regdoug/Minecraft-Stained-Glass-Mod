/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

/**
 *
 * @author reginald
 */
public class BlockStainedGlassFurnace extends BlockFurnace {

    public final int tex;

    public BlockStainedGlassFurnace(int i, boolean flag){
        super(i,flag);
        tex = ModLoader.addOverride("/terrain.png", StainedGlassConstants.imgPath + "stainedglassfurnacefront.png");
    }

    @Override
    protected TileEntity getBlockEntity()
    {
        return new TileEntityStainedGlassFurnace();
    }

    @Override
    public int getBlockTextureFromSide(int i){
        if(i == 3){
            return tex;
        }else{
            return super.getBlockTextureFromSide(i);
        }
    }

	public static void updateFurnaceBlockState(boolean flag, World world, int i, int j, int k)
    {
        int l = world.getBlockMetadata(i, j, k);
        TileEntity tileentity = world.getBlockTileEntity(i, j, k);
        if(flag)
        {
            world.setBlockWithNotify(i, j, k, StainedGlassConstants.furnaceID);
        } else
        {
            world.setBlockWithNotify(i, j, k, StainedGlassConstants.furnaceID);
        }
        world.setBlockMetadataWithNotify(i, j, k, l);
        world.setBlockTileEntity(i, j, k, tileentity);
    }
	
}
