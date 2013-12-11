package Hardmode.WorldGen;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class HardmodeWorldGenHandler implements IWorldGenerator 
{
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
	{
		switch(world.provider.dimensionId)
		{
		case 0:
			generateShadowStructure(world, random, chunkX*16, chunkZ*16);
			break;
		}
	}

	private void generateShadowStructure(World world, Random rand, int BaseX, int BaseZ) 
	{
		if(rand.nextInt(10) == 1)
		{
			WorldGenEnderForgeDungeon enderGen = new WorldGenEnderForgeDungeon();
			int a = 0;
			for( a = 0; a < 1; a++)
			{
				int i = BaseX + rand.nextInt(4) - rand.nextInt(4);
				int l = BaseZ + rand.nextInt(4) - rand.nextInt(4);
				int k = 1+rand.nextInt(40);//world.getHeightValue(i, l) - rand.nextInt(30) - 20;
				if(k < 0)
				{
					k = rand.nextInt(30) + 5;
				}
				enderGen.generate(world, rand, i, k, l);
			}
		}
	}
}
