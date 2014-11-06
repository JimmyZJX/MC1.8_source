package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class asg
/*  4:   */   extends arm
/*  5:   */ {
/*  6:   */   public asg(int paramInt)
/*  7:   */   {
/*  8: 9 */     super(paramInt);
/*  9:   */     
/* 10:11 */     this.at.clear();
/* 11:12 */     this.au.clear();
/* 12:13 */     this.av.clear();
/* 13:14 */     this.aw.clear();
/* 14:   */     
/* 15:16 */     this.at.add(new SpawnListEntry(EntityGhast.class, 50, 4, 4));
/* 16:17 */     this.at.add(new SpawnListEntry(EntityZombiePigman.class, 100, 4, 4));
/* 17:18 */     this.at.add(new SpawnListEntry(EntityLavaSlime.class, 1, 4, 4));
/* 18:   */   }
/* 19:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     asg
 * JD-Core Version:    0.7.0.1
 */