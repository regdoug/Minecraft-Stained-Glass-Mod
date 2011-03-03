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
    
    //the following three methods were copied from BlockCloth.java

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
     * cyan     - 0x9
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
        spriteIDs.put(new Integer(0x0),ModLoader.addOverride("/terrain.png","/path/to/sand_white.png"));
        spriteIDs.put(new Integer(0x1),ModLoader.addOverride("/terrain.png","/path/to/sand_orange.png"));
        spriteIDs.put(new Integer(0x2),ModLoader.addOverride("/terrain.png","/path/to/sand_magenta.png"));
        spriteIDs.put(new Integer(0x3),ModLoader.addOverride("/terrain.png","/path/to/sand_ltBlue.png"));
        spriteIDs.put(new Integer(0x4),ModLoader.addOverride("/terrain.png","/path/to/sand_yellow.png"));
        spriteIDs.put(new Integer(0x5),ModLoader.addOverride("/terrain.png","/path/to/sand_lime.png"));
        spriteIDs.put(new Integer(0x6),ModLoader.addOverride("/terrain.png","/path/to/sand_pink.png"));
        spriteIDs.put(new Integer(0x7),ModLoader.addOverride("/terrain.png","/path/to/sand_gray.png"));
        spriteIDs.put(new Integer(0x9),ModLoader.addOverride("/terrain.png","/path/to/sand_cyan.png"));
        spriteIDs.put(new Integer(0xa),ModLoader.addOverride("/terrain.png","/path/to/sand_purple.png"));
        spriteIDs.put(new Integer(0xb),ModLoader.addOverride("/terrain.png","/path/to/sand_blue.png"));
        spriteIDs.put(new Integer(0xc),ModLoader.addOverride("/terrain.png","/path/to/sand_brown.png"));
        spriteIDs.put(new Integer(0xd),ModLoader.addOverride("/terrain.png","/path/to/sand_green.png"));
        spriteIDs.put(new Integer(0xe),ModLoader.addOverride("/terrain.png","/path/to/sand_red.png"));
        spriteIDs.put(new Integer(0xf),ModLoader.addOverride("/terrain.png","/path/to/sand_black.png"));
    }

}
