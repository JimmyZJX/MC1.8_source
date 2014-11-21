package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class Sensor
/*  5:   */ {
/*  6:   */   EntityMob mob;
/*  7:11 */   List<Entity> visibleList = Lists.newArrayList();
/*  8:12 */   List<Entity> invisibleList = Lists.newArrayList();
/*  9:   */   
/* 10:   */   public Sensor(EntityMob paramxn)
/* 11:   */   {
/* 12:15 */     this.mob = paramxn;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void refresh()
/* 16:   */   {
/* 17:19 */     this.visibleList.clear();
/* 18:20 */     this.invisibleList.clear();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean canSee(Entity paramwv)
/* 22:   */   {
/* 23:24 */     if (this.visibleList.contains(paramwv)) {
/* 24:25 */       return true;
/* 25:   */     }
/* 26:27 */     if (this.invisibleList.contains(paramwv)) {
/* 27:28 */       return false;
/* 28:   */     }
/* 29:31 */     this.mob.world.profiler.a("canSee");
/* 30:32 */     boolean bool = this.mob.canSee(paramwv);
/* 31:33 */     this.mob.world.profiler.b();
/* 32:34 */     if (bool) {
/* 33:35 */       this.visibleList.add(paramwv);
/* 34:   */     } else {
/* 35:37 */       this.invisibleList.add(paramwv);
/* 36:   */     }
/* 37:39 */     return bool;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abd
 * JD-Core Version:    0.7.0.1
 */