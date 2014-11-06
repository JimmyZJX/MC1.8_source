package net.minecraft.src;
/*   1:    */ public class jy
/*   2:    */   implements id<ik>
/*   3:    */ {
/*   4:    */   protected int a;
/*   5:    */   protected byte b;
/*   6:    */   protected byte c;
/*   7:    */   protected byte d;
/*   8:    */   protected byte e;
/*   9:    */   protected byte f;
/*  10:    */   protected boolean g;
/*  11:    */   protected boolean h;
/*  12:    */   
/*  13:    */   public jy() {}
/*  14:    */   
/*  15:    */   public jy(int paramInt)
/*  16:    */   {
/*  17:129 */     this.a = paramInt;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  21:    */   {
/*  22:134 */     this.a = paramhd.e();
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  26:    */   {
/*  27:139 */     paramhd.b(this.a);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void a(ik paramik)
/*  31:    */   {
/*  32:144 */     paramik.a(this);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public String toString()
/*  36:    */   {
/*  37:149 */     return "Entity_" + super.toString();
/*  38:    */   }
/*  39:    */   
/*  40:    */   public Entity a(World paramaqu)
/*  41:    */   {
/*  42:153 */     return paramaqu.a(this.a);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public byte a()
/*  46:    */   {
/*  47:157 */     return this.b;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public byte b()
/*  51:    */   {
/*  52:161 */     return this.c;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public byte c()
/*  56:    */   {
/*  57:165 */     return this.d;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public byte d()
/*  61:    */   {
/*  62:169 */     return this.e;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public byte e()
/*  66:    */   {
/*  67:173 */     return this.f;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean f()
/*  71:    */   {
/*  72:177 */     return this.h;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public boolean g()
/*  76:    */   {
/*  77:181 */     return this.g;
/*  78:    */   }
/*  79:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     jy
 * JD-Core Version:    0.7.0.1
 */