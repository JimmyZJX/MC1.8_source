package net.minecraft.src;
/*   1:    */ public class aeb
/*   2:    */   extends adx
/*   3:    */ {
/*   4: 20 */   private final aqf a = new aec(this);
/*   5: 59 */   private int b = 0;
/*   6:    */   
/*   7:    */   public aeb(World paramaqu)
/*   8:    */   {
/*   9: 62 */     super(paramaqu);
/*  10:    */   }
/*  11:    */   
/*  12:    */   public aeb(World paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  13:    */   {
/*  14: 66 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  15:    */   }
/*  16:    */   
/*  17:    */   protected void h()
/*  18:    */   {
/*  19: 71 */     super.h();
/*  20: 72 */     H().a(23, "");
/*  21: 73 */     H().a(24, "");
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected void readEntityFromNBT(NBTTagCompound paramfn)
/*  25:    */   {
/*  26: 78 */     super.readEntityFromNBT(paramfn);
/*  27: 79 */     this.a.b(paramfn);
/*  28: 80 */     H().b(23, j().l());
/*  29: 81 */     H().b(24, hp.a(j().k()));
/*  30:    */   }
/*  31:    */   
/*  32:    */   protected void writeEntityToNBT(NBTTagCompound paramfn)
/*  33:    */   {
/*  34: 86 */     super.writeEntityToNBT(paramfn);
/*  35: 87 */     this.a.a(paramfn);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public EnumMinecartVariant s()
/*  39:    */   {
/*  40: 92 */     return EnumMinecartVariant.g;
/*  41:    */   }
/*  42:    */   
/*  43:    */   public Block u()
/*  44:    */   {
/*  45: 97 */     return BlockList.bX.instance();
/*  46:    */   }
/*  47:    */   
/*  48:    */   public aqf j()
/*  49:    */   {
/*  50:101 */     return this.a;
/*  51:    */   }
/*  52:    */   
/*  53:    */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  54:    */   {
/*  55:106 */     if ((paramBoolean) && 
/*  56:107 */       (this.W - this.b >= 4))
/*  57:    */     {
/*  58:108 */       j().a(this.world);
/*  59:109 */       this.b = this.W;
/*  60:    */     }
/*  61:    */   }
/*  62:    */   
/*  63:    */   public boolean e(EntityPlayer paramahd)
/*  64:    */   {
/*  65:116 */     this.a.a(paramahd);
/*  66:117 */     return false;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void i(int paramInt)
/*  70:    */   {
/*  71:122 */     super.i(paramInt);
/*  72:124 */     if (paramInt == 24) {
/*  73:    */       try
/*  74:    */       {
/*  75:126 */         this.a.b(hp.a(H().e(24)));
/*  76:    */       }
/*  77:    */       catch (Throwable localThrowable) {}
/*  78:128 */     } else if (paramInt == 23) {
/*  79:129 */       this.a.a(H().e(23));
/*  80:    */     }
/*  81:    */   }
/*  82:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     aeb
 * JD-Core Version:    0.7.0.1
 */