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
        tex = ModLoader.addOverride("/terrain.png", "/path/to/stainedglassfurnacefront.png");
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

}
