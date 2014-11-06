package net.minecraft.src;
/*  1:   */ import com.google.common.collect.Lists;
/*  2:   */ import java.util.List;
/*  3:   */ 
/*  4:   */ public class cbb
/*  5:   */   implements cav, caw
/*  6:   */ {
/*  7:27 */   private final List<caw> a = Lists.newArrayList();
/*  8:   */   
/*  9:   */   public cbb()
/* 10:   */   {
/* 11:30 */     bsu localbsu = bsu.z();
/* 12:31 */     for (brz localbrz : localbsu.f.Z().g()) {
/* 13:32 */       this.a.add(new cbc(this, localbrz));
/* 14:   */     }
/* 15:   */   }
/* 16:   */   
/* 17:   */   public List<caw> a()
/* 18:   */   {
/* 19:38 */     return this.a;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public ho b()
/* 23:   */   {
/* 24:43 */     return new hy("Select a team to teleport to");
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void a(car paramcar)
/* 28:   */   {
/* 29:48 */     paramcar.a(this);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public ho z_()
/* 33:   */   {
/* 34:53 */     return new hy("Teleport to team member");
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void a(float paramFloat, int paramInt)
/* 38:   */   {
/* 39:58 */     bsu.z().N().a(bvo.a);
/* 40:59 */     bub.a(0, 0, 16.0F, 0.0F, 16, 16, 256.0F, 256.0F);
/* 41:   */   }
/* 42:   */   
/* 43:   */   public boolean A_()
/* 44:   */   {
/* 45:64 */     for (caw localcaw : this.a) {
/* 46:65 */       if (localcaw.A_()) {
/* 47:66 */         return true;
/* 48:   */       }
/* 49:   */     }
/* 50:69 */     return false;
/* 51:   */   }
/* 52:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cbb
 * JD-Core Version:    0.7.0.1
 */