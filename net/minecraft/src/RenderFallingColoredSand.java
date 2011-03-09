/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

import org.lwjgl.opengl.GL11;

/**
 *
 * @author user
 */
public class RenderFallingColoredSand extends Render {
    private final RenderBlocks blockRenderer;

    public RenderFallingColoredSand(){
        shadowSize = 0.5F;
        blockRenderer = new RenderBlocks();
    }

    //adapted from RenderFallingSand.func_156_a

    @Override
    public void doRender(Entity entity, double d, double d1, double d2, float f, float f1) {
        EntityFallingColoredSand efcs = (EntityFallingColoredSand)entity;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)d, (float)d1, (float)d2);
        loadTexture("/terrain.png");
        Block block = Block.blocksList[efcs.blockID];
        World world = efcs.func_465_i();
        GL11.glDisable(2896 /*GL_LIGHTING*/);
        renderBlock(block, world, MathHelper.floor_double(efcs.posX),
                MathHelper.floor_double(efcs.posY), MathHelper.floor_double(efcs.posZ), efcs.damage);
        GL11.glEnable(2896 /*GL_LIGHTING*/);
        GL11.glPopMatrix();
    }

    //adapted from RenderBlocks.renderBlockFallingSand

    private void renderBlock(Block block, World world, int i, int j, int k, int damage) {
        float f = 0.5F;
        float f1 = 1.0F;
        float f2 = 0.8F;
        float f3 = 0.6F;
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        float f4 = block.getBlockBrightness(world, i, j, k);
        float f5 = block.getBlockBrightness(world, i, j - 1, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f * f5, f * f5, f * f5);
        blockRenderer.renderBottomFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        f5 = block.getBlockBrightness(world, i, j + 1, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f1 * f5, f1 * f5, f1 * f5);
        blockRenderer.renderTopFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        f5 = block.getBlockBrightness(world, i, j, k - 1);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
        blockRenderer.renderEastFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        f5 = block.getBlockBrightness(world, i, j, k + 1);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f2 * f5, f2 * f5, f2 * f5);
        blockRenderer.renderWestFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        f5 = block.getBlockBrightness(world, i - 1, j, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
        blockRenderer.renderNorthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        f5 = block.getBlockBrightness(world, i + 1, j, k);
        if(f5 < f4)
        {
            f5 = f4;
        }
        tessellator.setColorOpaque_F(f3 * f5, f3 * f5, f3 * f5);
        blockRenderer.renderSouthFace(block, -0.5D, -0.5D, -0.5D, block.getBlockTextureFromSideAndMetadata(0,damage));
        tessellator.draw();
    }

}
