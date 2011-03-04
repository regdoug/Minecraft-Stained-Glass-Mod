package net.minecraft.src;

import java.util.HashMap;

public class BlockColoredSand extends BlockSand {

    public BlockColoredSand(int i, int j){
        super(i,j);
    }

    @Override
    public int getBlockTextureFromSideAndMetadata(int i, int j){
        Integer a = spriteIDs.get(new Integer(j));
        if(a == null){
            return Block.sand.blockIndexInTexture;
        }else{
            return a.intValue();
        }
    }
    
    //the following three methods were adapted from BlockCloth.java

    @Override
    protected int damageDropped(int i)
    {
        return i;
    }

    public static int func_21034_c(int i)
    {
        return ~i & 0xf;
    }

    public static int func_21035_d(int i)
    {
        return ~i & 0xf;
    }

    //The following method was adapted from Sand.java

    private void tryToFall(World world, int i, int j, int k)
    {
        int l = i;
        int i1 = j;
        int j1 = k;
        if(canFallBelow(world, l, i1 - 1, j1) && i1 >= 0)
        {
            byte byte0 = 32;
            if(fallInstantly || !world.checkChunksExist(i - byte0, j - byte0, k - byte0, i + byte0, j + byte0, k + byte0))
            {
                world.setBlockWithNotify(i, j, k, 0);
                for(; canFallBelow(world, i, j - 1, k) && j > 0; j--) { }
                if(j > 0)
                {
                    world.setBlockWithNotify(i, j, k, StainedGlassConstants.sandID);
                }
            } else
            {
                EntityFallingColoredSand entityfallingsand = new EntityFallingColoredSand(
                        world, (float)i + 0.5F, (float)j + 0.5F, (float)k + 0.5F,
                        StainedGlassConstants.sandID, blockIndexInTexture);
                world.entityJoinedWorld(entityfallingsand);
            }
        }
    }
    
    /*
     * white    - 0x0
     * orange   - 0x1
     * magenta  - 0x2
     * ltBlue   - 0x3
     * yellow   - 0x4
     * lime     - 0x5
     * pink     - 0x6
     * gray     - 0x7
     * 
     *   light gray (or silver) is the "color" of regular sand
     * 
     * teal     - 0x9
     * purple   - 0xa
     * blue     - 0xb
     * brown    - 0xc
     * green    - 0xd
     * red      - 0xe
     * black    - 0xf
     */

    public static final HashMap<Integer,Integer> spriteIDs;

    static {
        spriteIDs = new java.util.HashMap<Integer, Integer>();
        spriteIDs.put(new Integer(0x0),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_white.png"));
        spriteIDs.put(new Integer(0x1),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_orange.png"));
        spriteIDs.put(new Integer(0x2),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_magenta.png"));
        spriteIDs.put(new Integer(0x3),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_ltBlue.png"));
        spriteIDs.put(new Integer(0x4),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_yellow.png"));
        spriteIDs.put(new Integer(0x5),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_lime.png"));
        spriteIDs.put(new Integer(0x6),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_pink.png"));
        spriteIDs.put(new Integer(0x7),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_gray.png"));
        spriteIDs.put(new Integer(0x9),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_teal.png"));
        spriteIDs.put(new Integer(0xa),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_purple.png"));
        spriteIDs.put(new Integer(0xb),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_blue.png"));
        spriteIDs.put(new Integer(0xc),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_brown.png"));
        spriteIDs.put(new Integer(0xd),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_green.png"));
        spriteIDs.put(new Integer(0xe),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_red.png"));
        spriteIDs.put(new Integer(0xf),ModLoader.addOverride("/terrain.png",StainedGlassConstants.imgPath+"sand_black.png"));
    }

}
