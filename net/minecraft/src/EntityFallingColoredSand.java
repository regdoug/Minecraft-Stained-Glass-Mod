/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package net.minecraft.src;

/**
 *
 * @author user
 */
public class EntityFallingColoredSand extends EntityFallingSand {

    protected int damage;

    public EntityFallingColoredSand(World world, double d, double d1, double d2,
            int i, int j){
        super(world,d,d1,d2,i);
        damage = j;
    }

    @Override
    public void onUpdate()
    {
        if(blockID == 0)
        {
            setEntityDead();
            return;
        }
        prevPosX = posX;
        prevPosY = posY;
        prevPosZ = posZ;
        fallTime++;
        motionY -= 0.039999999105930328D;
        moveEntity(motionX, motionY, motionZ);
        motionX *= 0.98000001907348633D;
        motionY *= 0.98000001907348633D;
        motionZ *= 0.98000001907348633D;
        int i = MathHelper.floor_double(posX);
        int j = MathHelper.floor_double(posY);
        int k = MathHelper.floor_double(posZ);
        if(worldObj.getBlockId(i, j, k) == blockID)
        {
            worldObj.setBlockWithNotify(i, j, k, 0);
        }
        if(onGround)
        {
            motionX *= 0.69999998807907104D;
            motionZ *= 0.69999998807907104D;
            motionY *= -0.5D;
            setEntityDead();
            if((!worldObj.canBlockBePlacedAt(blockID, i, j, k, true) || !worldObj.setBlockAndMetadataWithNotify(i, j, k, blockID,damage)) && !worldObj.multiplayerWorld)
            {
                entityDropItem(new ItemStack(StainedGlassConstants.sandID,1,damage), 0F);
            }
        } else
        if(fallTime > 100 && !worldObj.multiplayerWorld)
        {
            entityDropItem(new ItemStack(StainedGlassConstants.sandID,1,damage), 0F);
            setEntityDead();
        }
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound)
    {
        nbttagcompound.setByte("Tile", (byte)blockID);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound)
    {
        blockID = nbttagcompound.getByte("Tile") & 0xff;
    }

}
