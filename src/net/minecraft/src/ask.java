package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class ask
/*  4:   */   extends arm
/*  5:   */ {
/*  6:   */   public ask(int paramInt)
/*  7:   */   {
/*  8: 8 */     super(paramInt);
/*  9:   */     
/* 10:10 */     this.as.A = -100;
/* 11:11 */     this.as.B = -100;
/* 12:12 */     this.as.C = -100;
/* 13:   */     
/* 14:14 */     this.as.E = 1;
/* 15:15 */     this.as.K = 1;
/* 16:   */     
/* 17:17 */     this.ak = BlockList.bw.instance();
/* 18:   */     
/* 19:19 */     this.at.clear();
/* 20:20 */     this.au.clear();
/* 21:21 */     this.av.clear();
/* 22:   */     
/* 23:23 */     this.au.add(new SpawnListEntry(EntityMooshroom.class, 8, 4, 8));
/* 24:   */   }
/* 25:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ask
 * JD-Core Version:    0.7.0.1
 */