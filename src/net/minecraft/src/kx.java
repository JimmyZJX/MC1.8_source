package net.minecraft.src;
import java.io.IOException;
/*  1:   */ import java.util.List;
/*  2:   */ 
/*  3:   */ public class kx
/*  4:   */   implements id<ik>
/*  5:   */ {
/*  6:   */   private int a;
/*  7:   */   private List b;
/*  8:   */   
/*  9:   */   public kx() {}
/* 10:   */   
/* 11:   */   public kx(int paramInt, EntityData paramxv, boolean paramBoolean)
/* 12:   */   {
/* 13:19 */     this.a = paramInt;
/* 14:20 */     if (paramBoolean) {
/* 15:21 */       this.b = paramxv.c();
/* 16:   */     } else {
/* 17:23 */       this.b = paramxv.b();
/* 18:   */     }
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void fromBuffer(ByteBufWrapper paramhd) throws IOException
/* 22:   */   {
/* 23:29 */     this.a = paramhd.e();
/* 24:30 */     this.b = EntityData.readEntries(paramhd);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void toBuffer(ByteBufWrapper paramhd)
/* 28:   */   {
/* 29:35 */     paramhd.b(this.a);
/* 30:36 */     EntityData.a(this.b, paramhd);
/* 31:   */   }
/* 32:   */   
/* 33:   */   public void a(ik paramik)
/* 34:   */   {
/* 35:41 */     paramik.a(this);
/* 36:   */   }
/* 37:   */   
/* 38:   */   public List a()
/* 39:   */   {
/* 40:45 */     return this.b;
/* 41:   */   }
/* 42:   */   
/* 43:   */   public int b()
/* 44:   */   {
/* 45:49 */     return this.a;
/* 46:   */   }
/* 47:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     kx
 * JD-Core Version:    0.7.0.1
 */