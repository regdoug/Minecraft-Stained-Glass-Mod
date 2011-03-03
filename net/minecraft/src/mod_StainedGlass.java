package net.minecraft.src;

public class mod_StainedGlass extends BaseMod {

    public String Version(){ return "0.5"; }
  
    public void AddRecipe(CraftingManager cm){
        /*
         * Colored Sand Section  (item ID: 671)
         */
        //black
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xf)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(0),Character.valueOf('#'),Block.sand});
        //red
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xe)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(1),Character.valueOf('#'),Block.sand});
        //green
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xd)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(2),Character.valueOf('#'),Block.sand});
        //brown
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xc)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(3),Character.valueOf('#'),Block.sand});
        //blue
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xb)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(4),Character.valueOf('#'),Block.sand});
        //purple
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0xa)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(5),Character.valueOf('#'),Block.sand});
        //cyan
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x9)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(6),Character.valueOf('#'),Block.sand});
        //gray
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x7)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(8),Character.valueOf('#'),Block.sand});
        //pink
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x6)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(9),Character.valueOf('#'),Block.sand});
        //lime
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x5)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(10),Character.valueOf('#'),Block.sand});
        //yellow
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x4)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(11),Character.valueOf('#'),Block.sand});
        //ltBlue
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x3)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(12),Character.valueOf('#'),Block.sand});
        //magenta
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x2)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(13),Character.valueOf('#'),Block.sand});
        //orange
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x1)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(14),Character.valueOf('#'),Block.sand});
        //white
        cm.addRecipe(new ItemStack(new BlockColoredSands(671,0x0)),
                new Object[]{"d","#",Character.valueOf('d'),new ItemDye(15),Character.valueOf('#'),Block.sand});
    }

}
