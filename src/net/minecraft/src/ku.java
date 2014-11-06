package net.minecraft.src;
/*  1:   */ public class ku
/*  2:   */   implements id<ik>
/*  3:   */ {
/*  4:   */   public int a;
/*  5:   */   
/*  6:   */   public ku() {}
/*  7:   */   
/*  8:   */   public ku(Entity paramwv)
/*  9:   */   {
/* 10:19 */     this.a = paramwv.getID();
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:24 */     this.a = paramhd.e();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:29 */     paramhd.b(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(ik paramik)
/* 24:   */   {
/* 25:34 */     paramik.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public Entity a(World paramaqu)
/* 29:   */   {
/* 30:39 */     return paramaqu.a(this.a);
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ku
 * JD-Core Version:    0.7.0.1
 */