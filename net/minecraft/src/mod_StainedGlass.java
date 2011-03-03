package net.minecraft.src;

public class mod_StainedGlass extends BaseMod {

    public String Version(){ return "1.3"; }
  
    public void AddRecipe(CraftingManager cm){
        //colored sand
        cm.addRecipe(new ItemStack(ColoredSands.red),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(1),Character.valueOf('#'),Block.sand});
        cm.addRecipe(new ItemStack(ColoredSands.yellow),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(11),Character.valueOf('#'),Block.sand});
    }

}
