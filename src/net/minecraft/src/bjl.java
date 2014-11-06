package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  4:   */ 
/*  5:   */ public class bjl
/*  6:   */   extends bmm
/*  7:   */ {
/*  8:15 */   private List<SpawnListEntry> d = Lists.newArrayList();
/*  9:   */   
/* 10:   */   public bjl()
/* 11:   */   {
/* 12:20 */     this.d.add(new SpawnListEntry(EntityBlaze.class, 10, 2, 3));
/* 13:21 */     this.d.add(new SpawnListEntry(EntityZombiePigman.class, 5, 4, 4));
/* 14:22 */     this.d.add(new SpawnListEntry(EntitySkeleton.class, 10, 4, 4));
/* 15:23 */     this.d.add(new SpawnListEntry(EntityLavaSlime.class, 3, 4, 4));
/* 16:   */   }
/* 17:   */   
/* 18:   */   public String a()
/* 19:   */   {
/* 20:28 */     return "Fortress";
/* 21:   */   }
/* 22:   */   
/* 23:   */   public List<SpawnListEntry> b()
/* 24:   */   {
/* 25:32 */     return this.d;
/* 26:   */   }
/* 27:   */   
/* 28:   */   protected boolean a(int paramInt1, int paramInt2)
/* 29:   */   {
/* 30:37 */     int i = paramInt1 >> 4;
/* 31:38 */     int j = paramInt2 >> 4;
/* 32:   */     
/* 33:40 */     this.b.setSeed(i ^ j << 4 ^ this.c.J());
/* 34:41 */     this.b.nextInt();
/* 35:43 */     if (this.b.nextInt(3) != 0) {
/* 36:44 */       return false;
/* 37:   */     }
/* 38:46 */     if (paramInt1 != (i << 4) + 4 + this.b.nextInt(8)) {
/* 39:47 */       return false;
/* 40:   */     }
/* 41:49 */     if (paramInt2 != (j << 4) + 4 + this.b.nextInt(8)) {
/* 42:50 */       return false;
/* 43:   */     }
/* 44:52 */     return true;
/* 45:   */   }
/* 46:   */   
/* 47:   */   protected bmv b(int paramInt1, int paramInt2)
/* 48:   */   {
/* 49:57 */     return new bjm(this.c, this.b, paramInt1, paramInt2);
/* 50:   */   }
/* 51:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bjl
 * JD-Core Version:    0.7.0.1
 */