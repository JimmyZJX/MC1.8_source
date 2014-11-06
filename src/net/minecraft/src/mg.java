package net.minecraft.src;
/*   1:    */ public class mg
/*   2:    */   implements id<ls>
/*   3:    */ {
/*   4:    */   protected double a;
/*   5:    */   protected double b;
/*   6:    */   protected double c;
/*   7:    */   protected float d;
/*   8:    */   protected float e;
/*   9:    */   protected boolean f;
/*  10:    */   protected boolean g;
/*  11:    */   protected boolean h;
/*  12:    */   
/*  13:    */   public mg() {}
/*  14:    */   
/*  15:    */   public mg(boolean paramBoolean)
/*  16:    */   {
/*  17:121 */     this.f = paramBoolean;
/*  18:    */   }
/*  19:    */   
/*  20:    */   public void a(ls paramls)
/*  21:    */   {
/*  22:126 */     paramls.a(this);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void fromBuffer(ByteBufWrapper paramhd)
/*  26:    */   {
/*  27:131 */     this.f = (paramhd.readUnsignedByte() != 0);
/*  28:    */   }
/*  29:    */   
/*  30:    */   public void toBuffer(ByteBufWrapper paramhd)
/*  31:    */   {
/*  32:136 */     paramhd.writeByte(this.f ? 1 : 0);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public double a()
/*  36:    */   {
/*  37:140 */     return this.a;
/*  38:    */   }
/*  39:    */   
/*  40:    */   public double b()
/*  41:    */   {
/*  42:144 */     return this.b;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public double c()
/*  46:    */   {
/*  47:148 */     return this.c;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public float d()
/*  51:    */   {
/*  52:152 */     return this.d;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public float e()
/*  56:    */   {
/*  57:156 */     return this.e;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public boolean f()
/*  61:    */   {
/*  62:160 */     return this.f;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public boolean g()
/*  66:    */   {
/*  67:164 */     return this.g;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public boolean h()
/*  71:    */   {
/*  72:168 */     return this.h;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(boolean paramBoolean)
/*  76:    */   {
/*  77:172 */     this.g = paramBoolean;
/*  78:    */   }
/*  79:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     mg
 * JD-Core Version:    0.7.0.1
 */