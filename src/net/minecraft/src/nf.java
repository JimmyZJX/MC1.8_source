package net.minecraft.src;
/*  1:   */ public class nf
/*  2:   */   implements id<nc>
/*  3:   */ {
/*  4:   */   private int a;
/*  5:   */   
/*  6:   */   public nf() {}
/*  7:   */   
/*  8:   */   public nf(int paramInt)
/*  9:   */   {
/* 10:16 */     this.a = paramInt;
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void fromBuffer(ByteBufWrapper paramhd)
/* 14:   */   {
/* 15:21 */     this.a = paramhd.e();
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 19:   */   {
/* 20:26 */     paramhd.b(this.a);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public void a(nc paramnc)
/* 24:   */   {
/* 25:31 */     paramnc.a(this);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public int a()
/* 29:   */   {
/* 30:35 */     return this.a;
/* 31:   */   }
/* 32:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     nf
 * JD-Core Version:    0.7.0.1
 */