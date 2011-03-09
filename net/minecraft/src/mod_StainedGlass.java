package net.minecraft.src;

import java.util.Map;

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
        ModLoader.RegisterBlock(
                (new BlockImprovedFurnace(StainedGlassConstants.furnaceID, false)).setHardness(3.5F)
                        .setStepSound(Block.soundStoneFootstep).setBlockName("ImprovedFurnace"),
                ItemColoredSandStone.class);

        //Register tile entity for new furnace
        ModLoader.RegisterTileEntity(TileEntityImprovedFurnace.class, "ImprovedFurnace");

        //Regular furnaces produce regular glass
        ModLoader.AddSmelting(StainedGlassConstants.sandID, new ItemStack(Block.glass));
    }

    public String Version(){
        System.out.println("Starting up!");
        return "0.5"; }
  
    @Override
    public void AddRecipes(CraftingManager cm){
        /*
         * New type of Furnace
         */
        cm.addRecipe(new ItemStack(StainedGlassConstants.furnaceID,1,0),
                new Object[]{"###","#L#","###",
                        Character.valueOf('#'), new ItemStack(Block.cobblestone),
                        Character.valueOf('L'), new ItemStack(Block.planks)});
        /*
         * Colored Sand Section
         *
         * adapted from CraftingManager.java
         */
        for(int i = 0; i < 16; i++)
        {
            cm.addShapelessRecipe(new ItemStack(StainedGlassConstants.sandID, 1, BlockColoredSand.func_21035_d(i)), new Object[] {
                new ItemStack(Item.dyePowder, 1, i), new ItemStack(Block.sand)
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

    @Override
    public void AddRenderer(Map var1) {
        var1.put(EntityFallingColoredSand.class,new RenderFallingColoredSand());
    }

}
