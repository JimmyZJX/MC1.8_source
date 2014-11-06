package net.minecraft.src;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class aal
/*  4:   */   extends aaw
/*  5:   */ {
/*  6:   */   private boolean a;
/*  7:   */   private int b;
/*  8:   */   private final Class[] c;
/*  9:   */   
/* 10:   */   public aal(EntityWalkingMob paramxu, boolean paramBoolean, Class... paramVarArgs)
/* 11:   */   {
/* 12:15 */     super(paramxu, false);
/* 13:16 */     this.a = paramBoolean;
/* 14:17 */     this.c = paramVarArgs;
/* 15:18 */     a(1);
/* 16:   */   }
/* 17:   */   
/* 18:   */   public boolean a()
/* 19:   */   {
/* 20:23 */     int i = this.e.bd();
/* 21:24 */     return (i != this.b) && (a(this.e.bc(), false));
/* 22:   */   }
/* 23:   */   
/* 24:   */   public void c()
/* 25:   */   {
/* 26:29 */     this.e.d(this.e.bc());
/* 27:30 */     this.b = this.e.bd();
/* 28:32 */     if (this.a)
/* 29:   */     {
/* 30:33 */       double d = f();
/* 31:34 */       List<? extends EntityWalkingMob> localList = this.e.world.a(this.e.getClass(), new AABB(this.e.xPos, this.e.yPos, this.e.zPos, this.e.xPos + 1.0D, this.e.yPos + 1.0D, this.e.zPos + 1.0D).expand(d, 10.0D, d));
/* 32:35 */       for (EntityWalkingMob localxu : localList) {
/* 33:36 */         if ((this.e != localxu) && 
/* 34:   */         
/* 35:   */ 
/* 36:39 */           (localxu.u() == null) && 
/* 37:   */           
/* 38:   */ 
/* 39:42 */           (!localxu.c(this.e.bc())))
/* 40:   */         {
/* 41:45 */           int i = 0;
/* 42:46 */           for (Class localClass : this.c) {
/* 43:47 */             if (localxu.getClass() == localClass)
/* 44:   */             {
/* 45:48 */               i = 1;
/* 46:49 */               break;
/* 47:   */             }
/* 48:   */           }
/* 49:52 */           if (i == 0) {
/* 50:56 */             a(localxu, this.e.bc());
/* 51:   */           }
/* 52:   */         }
/* 53:   */       }
/* 54:   */     }
/* 55:60 */     super.c();
/* 56:   */   }
/* 57:   */   
/* 58:   */   protected void a(EntityWalkingMob paramxu, EntityLiving paramxm)
/* 59:   */   {
/* 60:64 */     paramxu.d(paramxm);
/* 61:   */   }
/* 62:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aal
 * JD-Core Version:    0.7.0.1
 */