package net.minecraft.src;
/*   1:    */ public class SpawnListEntry
/*   2:    */   extends WeightedRandomItem
/*   3:    */ {
/*   4:    */   public Class<? extends EntityMob> mob;
/*   5:    */   public int c;
/*   6:    */   public int d;
/*   7:    */   
/*   8:    */   public SpawnListEntry(Class<? extends EntityMob> paramClass, int paramInt1, int paramInt2, int paramInt3)
/*   9:    */   {
/*  10:341 */     super(paramInt1);
/*  11:342 */     this.mob = paramClass;
/*  12:343 */     this.c = paramInt2;
/*  13:344 */     this.d = paramInt3;
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String toString()
/*  17:    */   {
/*  18:349 */     return this.mob.getSimpleName() + "*(" + this.c + "-" + this.d + "):" + this.weight;
/*  19:    */   }
/*  20:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     arq
 * JD-Core Version:    0.7.0.1
 */