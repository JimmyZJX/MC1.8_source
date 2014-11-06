package net.minecraft.src;
public abstract interface IWorldAccess
{
  public abstract void a(BlockPosition paramdt);
  
  public abstract void b(BlockPosition paramdt);
  
  public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public abstract void a(String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
  
  public abstract void a(EntityPlayer paramahd, String paramString, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2);
  
  public abstract void a(int paramInt, boolean paramBoolean, double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5, double paramDouble6, int... paramVarArgs);
  
  public abstract void obtainEntitySkin(Entity paramwv);
  
  public abstract void releaseEntitySkin(Entity paramwv);
  
  public abstract void a(String paramString, BlockPosition paramdt);
  
  public abstract void a(int paramInt1, BlockPosition paramdt, int paramInt2);
  
  public abstract void playLevelEvent(EntityPlayer paramahd, int paramInt1, BlockPosition paramdt, int paramInt2);
  
  public abstract void b(int paramInt1, BlockPosition paramdt, int paramInt2);
}


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ara
 * JD-Core Version:    0.7.0.1
 */