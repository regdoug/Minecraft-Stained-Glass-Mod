package net.minecraft.src;

public class mod_StainedGlass extends BaseMod {

    static{
        //Register Blocks
        ModLoader.RegisterBlock(
                (new BlockColoredSand(671, 0xf)).setHardness(0.5F)
                        .setStepSound(Block.soundSandFootstep).setBlockName("coloredsand"),
                ItemColoredSand.class);
    }

    public String Version(){ return "0.5"; }
  
    public void AddRecipe(CraftingManager cm){
        /*
         * Colored Sand Section  (item ID: 671)
         */

        //adapted from CraftingManager.java
        for(int i = 0; i < 16; i++)
        {
            cm.addShapelessRecipe(new ItemStack(StainedGlassConstants.sandID, 1, BlockColoredSand.func_21035_d(i)), new Object[] {
                new ItemStack(Item.dyePowder, 1, i), new ItemStack(Item.itemsList[StainedGlassConstants.sandID], 1, 0)
            });
        }

        for(int i = 0; i < 16; i++)
        {
            cm.addRecipe(new ItemStack(StainedGlassConstants.sandstoneID,1,i), new Object[] {
                "##", "##", Character.valueOf('#'), new ItemStack(StainedGlassConstants.sandID,1,i)
            });
        }
    }

}
