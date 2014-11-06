package net.minecraft.src;
/*  1:   */ public class vx
/*  2:   */ {
/*  3:10 */   public static final vx a = new vx("");
/*  4:   */   private final String b;
/*  5:   */   
/*  6:   */   public vx(String paramString)
/*  7:   */   {
/*  8:16 */     this.b = paramString;
/*  9:   */   }
/* 10:   */   
/* 11:   */   public boolean a()
/* 12:   */   {
/* 13:20 */     return (this.b == null) || (this.b.isEmpty());
/* 14:   */   }
/* 15:   */   
/* 16:   */   public String b()
/* 17:   */   {
/* 18:24 */     return this.b;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void a(NBTTagCompound paramfn)
/* 22:   */   {
/* 23:28 */     paramfn.setString("Lock", this.b);
/* 24:   */   }
/* 25:   */   
/* 26:   */   public static vx b(NBTTagCompound paramfn)
/* 27:   */   {
/* 28:32 */     if (paramfn.hasKey("Lock", 8))
/* 29:   */     {
/* 30:33 */       String str = paramfn.getString("Lock");
/* 31:34 */       return new vx(str);
/* 32:   */     }
/* 33:36 */     return a;
/* 34:   */   }
/* 35:   */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     vx
 * JD-Core Version:    0.7.0.1
 */