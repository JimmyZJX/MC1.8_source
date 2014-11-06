package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class abd
/*  5:   */ {
/*  6:   */   EntityMob a;
/*  7:11 */   List b = Lists.newArrayList();
/*  8:12 */   List c = Lists.newArrayList();
/*  9:   */   
/* 10:   */   public abd(EntityMob paramxn)
/* 11:   */   {
/* 12:15 */     this.a = paramxn;
/* 13:   */   }
/* 14:   */   
/* 15:   */   public void a()
/* 16:   */   {
/* 17:19 */     this.b.clear();
/* 18:20 */     this.c.clear();
/* 19:   */   }
/* 20:   */   
/* 21:   */   public boolean a(Entity paramwv)
/* 22:   */   {
/* 23:24 */     if (this.b.contains(paramwv)) {
/* 24:25 */       return true;
/* 25:   */     }
/* 26:27 */     if (this.c.contains(paramwv)) {
/* 27:28 */       return false;
/* 28:   */     }
/* 29:31 */     this.a.world.profiler.a("canSee");
/* 30:32 */     boolean bool = this.a.t(paramwv);
/* 31:33 */     this.a.world.profiler.b();
/* 32:34 */     if (bool) {
/* 33:35 */       this.b.add(paramwv);
/* 34:   */     } else {
/* 35:37 */       this.c.add(paramwv);
/* 36:   */     }
/* 37:39 */     return bool;
/* 38:   */   }
/* 39:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     abd
 * JD-Core Version:    0.7.0.1
 */