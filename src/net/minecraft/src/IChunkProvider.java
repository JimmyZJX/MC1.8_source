package net.minecraft.src;
import java.util.List;

public abstract interface IChunkProvider
{
  public abstract boolean a(int paramInt1, int paramInt2);
  
  public abstract Chunk getChunk(int paramInt1, int paramInt2);
  
  public abstract Chunk a(BlockPosition paramdt);
  
  public abstract void a(IChunkProvider parambfe, int paramInt1, int paramInt2);
  
  public abstract boolean a(IChunkProvider parambfe, Chunk parambfh, int paramInt1, int paramInt2);
  
  public abstract boolean a(boolean paramBoolean, uy paramuy);
  
  public abstract boolean d();
  
  public abstract boolean e();
  
  public abstract String getName();
  
  public abstract List<SpawnListEntry> getSpawnList(EnumCreatureType paramxp, BlockPosition paramdt);
  
  public abstract BlockPosition a(World paramaqu, String paramString, BlockPosition paramdt);
  
  public abstract int g();
  
  public abstract void a(Chunk parambfh, int paramInt1, int paramInt2);
  
  public abstract void c();
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bfe
 * JD-Core Version:    0.7.0.1
 */