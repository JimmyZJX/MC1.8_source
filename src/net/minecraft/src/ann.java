package net.minecraft.src;
/*  1:   */ public class ann
/*  2:   */   extends aju
/*  3:   */ {
/*  4:   */   private final ProtoBlock b;
/*  5:   */   private String[] c;
/*  6:   */   
/*  7:   */   public ann(ProtoBlock paramatr, boolean paramBoolean)
/*  8:   */   {
/*  9:10 */     super(paramatr);
/* 10:11 */     this.b = paramatr;
/* 11:13 */     if (paramBoolean)
/* 12:   */     {
/* 13:14 */       setMaxDamage(0);
/* 14:15 */       a(true);
/* 15:   */     }
/* 16:   */   }
/* 17:   */   
/* 18:   */   public int a(ItemStack paramamj, int paramInt)
/* 19:   */   {
/* 20:21 */     return this.b.h(this.b.a(paramamj.i()));
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int a(int paramInt)
/* 24:   */   {
/* 25:26 */     return paramInt;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public ann a(String[] paramArrayOfString)
/* 29:   */   {
/* 30:30 */     this.c = paramArrayOfString;
/* 31:31 */     return this;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public String e_(ItemStack paramamj)
/* 35:   */   {
/* 36:36 */     if (this.c == null) {
/* 37:37 */       return super.e_(paramamj);
/* 38:   */     }
/* 39:39 */     int i = paramamj.i();
/* 40:40 */     if ((i >= 0) && (i < this.c.length)) {
/* 41:41 */       return super.e_(paramamj) + "." + this.c[i];
/* 42:   */     }
/* 43:43 */     return super.e_(paramamj);
/* 44:   */   }
/* 45:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     ann
 * JD-Core Version:    0.7.0.1
 */