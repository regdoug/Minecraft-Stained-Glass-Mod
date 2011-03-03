package net.minecraft.src;

public class mod_StainedGlass extends BaseMod {

    static{
        //Register Blocks
        ModLoader.RegisterBlock(
                (new BlockColoredSand(StainedGlassConstants.sandID, 0xf)).setHardness(0.5F)
                        .setStepSound(Block.soundSandFootstep).setBlockName("coloredsand"),
                ItemColoredSand.class);
        ModLoader.RegisterBlock(
                (new BlockColoredSandStone(StainedGlassConstants.sandstoneID, 0xf)).setHardness(1.5F).setResistance(10F)
                        .setStepSound(Block.soundStoneFootstep).setBlockName("coloredsandstone"),
                ItemColoredSandStone.class);
        ModLoader.RegisterBlock(
                (new BlockColoredGlass(StainedGlassConstants.glassID, 0xf)).setHardness(0.3F)
                        .setStepSound(Block.soundGlassFootstep).setBlockName("coloredglass"),
                ItemColoredGlass.class);

        //Smelting will need a new furnace block b/c it won't work any other way
    }

    public String Version(){ return "0.5"; }
  
    public void AddRecipe(CraftingManager cm){
        /*
         * Colored Sand Section
         *
         * adapted from CraftingManager.java
         */
        for(int i = 0; i < 16; i++)
        {
            cm.addShapelessRecipe(new ItemStack(StainedGlassConstants.sandID, 1, BlockColoredSand.func_21035_d(i)), new Object[] {
                new ItemStack(Item.dyePowder, 1, i), new ItemStack(Item.itemsList[StainedGlassConstants.sandID], 1, 0)
            });
        }

        /*
         * Colored Sandstone Section
         *
         * adapted from previous function and from RecipesCrafting.java
         */

        for(int i = 0; i < 16; i++)
        {
            cm.addRecipe(new ItemStack(StainedGlassConstants.sandstoneID,1,i), new Object[] {
                "##", "##", Character.valueOf('#'), new ItemStack(StainedGlassConstants.sandID,1,i)
            });
        }
    }

}
