/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

import java.util.HashMap;

/**
 *
 * @author reginald
 */
public class BlockColoredSandStone extends Block {

    public BlockColoredSandStone(int i, int j){
        super(i,j,Material.rock);
    }



    @Override
    public int getBlockTextureFromSideAndMetadata(int i, int j){
        HashMap<Integer,Integer> spriteIDs = null;
        if(i == 1) {
            spriteIDs = spriteIDs_top;
        } else if(i == 0) {
            spriteIDs = spriteIDs_bot;
        } else {
            spriteIDs = spriteIDs_side;
        }

        Integer a = spriteIDs.get(new Integer(j));
        if(a == null){
            return blockIndexInTexture;
        }else{
            return a.intValue();
        }
    }

    public static final HashMap<Integer,Integer> spriteIDs_side;
    public static final HashMap<Integer,Integer> spriteIDs_top;
    public static final HashMap<Integer,Integer> spriteIDs_bot;

    static {
        spriteIDs_bot = new java.util.HashMap<Integer, Integer>();
        spriteIDs_bot.put(new Integer(0x0),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_white.png"));
        spriteIDs_bot.put(new Integer(0x1),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_orange.png"));
        spriteIDs_bot.put(new Integer(0x2),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_magenta.png"));
        spriteIDs_bot.put(new Integer(0x3),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_ltBlue.png"));
        spriteIDs_bot.put(new Integer(0x4),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_yellow.png"));
        spriteIDs_bot.put(new Integer(0x5),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_lime.png"));
        spriteIDs_bot.put(new Integer(0x6),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_pink.png"));
        spriteIDs_bot.put(new Integer(0x7),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_gray.png"));
        spriteIDs_bot.put(new Integer(0x9),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_teal.png"));
        spriteIDs_bot.put(new Integer(0xa),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_purple.png"));
        spriteIDs_bot.put(new Integer(0xb),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_blue.png"));
        spriteIDs_bot.put(new Integer(0xc),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_brown.png"));
        spriteIDs_bot.put(new Integer(0xd),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_green.png"));
        spriteIDs_bot.put(new Integer(0xe),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_red.png"));
        spriteIDs_bot.put(new Integer(0xf),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssbot_black.png"));
        spriteIDs_top = new java.util.HashMap<Integer, Integer>();
        spriteIDs_top.put(new Integer(0x0),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_white.png"));
        spriteIDs_top.put(new Integer(0x1),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_orange.png"));
        spriteIDs_top.put(new Integer(0x2),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_magenta.png"));
        spriteIDs_top.put(new Integer(0x3),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_ltBlue.png"));
        spriteIDs_top.put(new Integer(0x4),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_yellow.png"));
        spriteIDs_top.put(new Integer(0x5),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_lime.png"));
        spriteIDs_top.put(new Integer(0x6),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_pink.png"));
        spriteIDs_top.put(new Integer(0x7),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_gray.png"));
        spriteIDs_top.put(new Integer(0x9),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_teal.png"));
        spriteIDs_top.put(new Integer(0xa),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_purple.png"));
        spriteIDs_top.put(new Integer(0xb),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_blue.png"));
        spriteIDs_top.put(new Integer(0xc),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_brown.png"));
        spriteIDs_top.put(new Integer(0xd),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_green.png"));
        spriteIDs_top.put(new Integer(0xe),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_red.png"));
        spriteIDs_top.put(new Integer(0xf),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sstop_black.png"));
        spriteIDs_side = new java.util.HashMap<Integer, Integer>();
        spriteIDs_side.put(new Integer(0x0),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_white.png"));
        spriteIDs_side.put(new Integer(0x1),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_orange.png"));
        spriteIDs_side.put(new Integer(0x2),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_magenta.png"));
        spriteIDs_side.put(new Integer(0x3),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_ltBlue.png"));
        spriteIDs_side.put(new Integer(0x4),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_yellow.png"));
        spriteIDs_side.put(new Integer(0x5),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_lime.png"));
        spriteIDs_side.put(new Integer(0x6),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_pink.png"));
        spriteIDs_side.put(new Integer(0x7),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_gray.png"));
        spriteIDs_side.put(new Integer(0x9),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_teal.png"));
        spriteIDs_side.put(new Integer(0xa),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_purple.png"));
        spriteIDs_side.put(new Integer(0xb),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_blue.png"));
        spriteIDs_side.put(new Integer(0xc),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_brown.png"));
        spriteIDs_side.put(new Integer(0xd),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_green.png"));
        spriteIDs_side.put(new Integer(0xe),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_red.png"));
        spriteIDs_side.put(new Integer(0xf),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"ssside_black.png"));
    }

}
