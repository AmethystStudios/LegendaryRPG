package eddyhamilton.legendaryrpg.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import eddyhamilton.legendaryrpg.entity.TileEntityGiantCake;
import net.minecraft.block.BlockCake;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class GiantCake extends BlockCake implements ITileEntityProvider{
//Broken.
	public void setBlockBoundsBasedOnState(IBlockAccess world, int x, int y, int z){
    this.setBlockBounds(0.0F, 0.0F, 0.0F, 8.0F, 2.0F, 8.0F);
}
	//This will tell minecraft not to render any side of our cube.
	public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
	{
	   return false;
	}

	//And this tell it that you can see through this block, and neighbor blocks should be rendered.
	public boolean isOpaqueCube()
	{
	   return false;
	}
	   @SideOnly(Side.CLIENT)
	    public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int p_149633_2_, int p_149633_3_, int p_149633_4_)
	    {
	        int l = world.getBlockMetadata(8, 2, 8);
	        float f = 8.0625F;
	        float f1 = (float)( 8+ l * 2) / 8.0F;
	        float f2 = 1.0F;
	        return AxisAlignedBB.getBoundingBox((double)((float)p_149633_2_ + f1), (double)p_149633_3_, (double)((float)p_149633_4_ + f), (double)((float)(p_149633_2_ + 1) - f), (double)((float)p_149633_3_ + f2), (double)((float)(p_149633_4_ + 1) - f));
	    }
	
	@Override
	public boolean onBlockActivated(World p_149727_1_, int p_149727_2_, int p_149727_3_, int p_149727_4_, EntityPlayer player, int p_149727_6_, float p_149727_7_, float p_149727_8_, float p_149727_9_)
	{
	    this.func_150036_b(p_149727_1_, p_149727_2_, p_149727_3_, p_149727_4_, player);

	    
	    return true;
	}
	
    public void breakBlock(World world, int x, int y, int z, int i, int j)
    {
    	world.removeTileEntity(x, y, z);
    }

	
	private void func_150036_b(World world, int p_150036_2_, int p_150036_3_, int p_150036_4_, EntityPlayer player)
    {
        if (player.canEat(true))
        {
            player.getFoodStats().addStats(2, 0.1F);
    		player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 5000, 10));
    		player.addPotionEffect(new PotionEffect(Potion.regeneration.id, 5000, 10));
    		player.addPotionEffect(new PotionEffect(Potion.resistance.id, 5000, 10));
    		player.addPotionEffect(new PotionEffect(Potion.jump.id, 5000, 2));
            player.addPotionEffect(new PotionEffect(Potion.field_76444_x.id, 5000, 5));
            
            int l = world.getBlockMetadata(p_150036_2_, p_150036_3_, p_150036_4_) + 1;

            if (l >= 6)
            {
                world.setBlockToAir(p_150036_2_, p_150036_3_, p_150036_4_);
            }
            else
            {
                world.setBlockMetadataWithNotify(p_150036_2_, p_150036_3_, p_150036_4_, l, 2);
            }
        }
    }

	
	@Override
	public boolean hasTileEntity(){
		return true;
	}
	@Override
	public TileEntity createNewTileEntity(World world, int I) {
		return new TileEntityGiantCake();
	}
	
	
}

