package com.jtrent238.moreaoa.dimension.slimetopia;

import javax.annotation.Nullable;

import com.jtrent238.moreaoa.ModDimensions;

import net.minecraft.client.audio.MusicTicker;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.tslat.aoa3.dimension.AoATeleporter;

public class WorldPoviderSlimetopia extends net.minecraft.world.WorldProvider implements net.tslat.aoa3.dimension.AoAWorldProvider
{
	  public WorldPoviderSlimetopia() {}
	  
		@Override
		public DimensionType getDimensionType() {
			return ModDimensions.dimensionSlimetopia;
		}
	  
	  protected void func_76572_b()
	  {
	    boolean field_191067_f = true;
	    BiomeProvider field_76578_c = ModDimensions.worldTypeSlimetopia.getBiomeProvider(world);
	  }
	  
	  public AoATeleporter getTeleporter(WorldServer fromWorld)
	  {
	    return new SlimetopiaTeleporter(fromWorld);
	  }
	  
	  public IChunkGenerator func_186060_c()
	  {
	    return ModDimensions.worldTypeSlimetopia.getChunkGenerator(world, null);
	  }
	  
	  public boolean canDoRainSnowIce(Chunk chunk)
	  {
	    return false;
	  }
	  
	  public boolean canSnowAt(BlockPos pos, boolean checkLight)
	  {
	    return false;
	  }
	  
	  @Nullable
	  public String getSaveFolder()
	  {
	    return "MoreAoA_Slimetopia";
	  }
	  
	  public boolean canDoLightning(Chunk chunk)
	  {
	    return false;
	  }
	  
	  public boolean func_76568_b(int x, int z)
	  {
	    return true;
	  }
	  
	  /*
	  @Nullable
	  public MusicTicker.MusicType getMusicType()
	  {
	    return Enums.NULL_MUSIC;
	  }
	  */
	  
	  public boolean func_76567_e()
	  {
	    return false;
	  }
	  
	  public float func_76571_f()
	  {
	    return 128.0F;
	  }
	  
	  @Nullable
	  public IRenderHandler getCloudRenderer()
	  {
	    return null;
	  }
	  
	  @SideOnly(Side.CLIENT)
	  public Vec3d func_76562_b(float x, float z)
	  {
	    float f2 = MathHelper.clamp(MathHelper.abs(x * 3.1415927F * 2.0F) * 2.0F + 0.5F, 1.5F, 5.0F);
	    float f3 = 0.0F * f2;
	    float f4 = 0.0F * f2;
	    float f5 = 0.0F * f2;
	    return new Vec3d(f3, f4, f5);
	  }
	  
	  public boolean func_76569_d()
	  {
	    return false;
	  }
	  
	  public float func_76563_a(long worldTime, float partialTicks)
	  {
	    return 0.0F;
	  }

	}