package net.minecraft.src;

public class mod_StainedGlass extends BaseMod {

    static{
        //Register Blocks
        ModLoader.RegisterBlock(
                (new BlockColoredSands(671, 0xf)).setHardness(0.5F)
                        .setStepSound(Block.soundSandFootstep).setBlockName("coloredsand"),
                ItemColoredSand.class);
    }

    public String Version(){ return "0.5"; }
  
    public void AddRecipe(CraftingManager cm){
        /*
         * Colored Sand Section  (item ID: 671)
         */
        for(int i = 0; i < 16; i++){
            cm.addRecipe(new ItemStack(new BlockColoredSands(671, 15-i )),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(i),Character.valueOf('#'),Block.sand});
        }
    }

}
