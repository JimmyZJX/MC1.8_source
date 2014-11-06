package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class asv
/*  4:   */   extends arm
/*  5:   */ {
/*  6:   */   public asv(int paramInt)
/*  7:   */   {
/*  8: 8 */     super(paramInt);
/*  9:   */     
/* 10:10 */     this.at.clear();
/* 11:11 */     this.au.clear();
/* 12:12 */     this.av.clear();
/* 13:13 */     this.aw.clear();
/* 14:   */     
/* 15:15 */     this.at.add(new SpawnListEntry(EntityEnderman.class, 10, 4, 4));
/* 16:16 */     this.ak = BlockList.dirt.instance();
/* 17:17 */     this.al = BlockList.dirt.instance();
/* 18:   */     
/* 19:19 */     this.as = new asw();
/* 20:   */   }
/* 21:   */   
/* 22:   */   public int a(float paramFloat)
/* 23:   */   {
/* 24:24 */     return 0;
/* 25:   */   }
/* 26:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asv
 * JD-Core Version:    0.7.0.1
 */