/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author reginald
 */
public class FurnaceRecipesImproved {

    public static FurnaceRecipesImproved smelting()
    {
        return smeltingBase;
    }

    private FurnaceRecipesImproved()
    {
        smeltingList = new HashMap<Integer,Object>();
        HashMap<Integer,ItemStack> entry;
        entry = new HashMap<Integer,ItemStack>();
        entry.put(0, new ItemStack(StainedGlassConstants.glassID,1,0));
        entry.put(1, new ItemStack(StainedGlassConstants.glassID,1,1));
        entry.put(2, new ItemStack(StainedGlassConstants.glassID,1,2));
        entry.put(3, new ItemStack(StainedGlassConstants.glassID,1,3));
        entry.put(4, new ItemStack(StainedGlassConstants.glassID,1,4));
        entry.put(5, new ItemStack(StainedGlassConstants.glassID,1,5));
        entry.put(6, new ItemStack(StainedGlassConstants.glassID,1,6));
        entry.put(7, new ItemStack(StainedGlassConstants.glassID,1,7));
        entry.put(8, new ItemStack(StainedGlassConstants.glassID,1,8));
        entry.put(9, new ItemStack(StainedGlassConstants.glassID,1,9));
        entry.put(10, new ItemStack(StainedGlassConstants.glassID,1,10));
        entry.put(11, new ItemStack(StainedGlassConstants.glassID,1,11));
        entry.put(12, new ItemStack(StainedGlassConstants.glassID,1,12));
        entry.put(13, new ItemStack(StainedGlassConstants.glassID,1,13));
        entry.put(14, new ItemStack(StainedGlassConstants.glassID,1,14));
        entry.put(15, new ItemStack(StainedGlassConstants.glassID,1,15));
        smeltingList.put(StainedGlassConstants.glassID, entry);
    }

    public void addSmelting(ItemStack i, ItemStack itemstack)
    {
        int id = i.itemID;
        smeltingList.put(id, itemstack);
    }

    public ItemStack getSmeltingResult(ItemStack i)
    {
        Object o = smeltingList.get(Integer.valueOf(i.itemID));
        if(o instanceof ItemStack){
            return (ItemStack)o;
        }else if(o instanceof Map){
            Object o2 = ((Map)o).get(i.getItemDamage());
            if(o2 instanceof ItemStack){
                return (ItemStack)o2;
            }
        }
        return null;
    }

    protected static final FurnaceRecipesImproved smeltingBase = new FurnaceRecipesImproved();
    protected Map<Integer,Object> smeltingList;

}
