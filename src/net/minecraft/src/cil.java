package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ 
/*   3:    */ public abstract class cil
/*   4:    */   extends EntityPlayer
/*   5:    */ {
/*   6:    */   private ces a;
/*   7:    */   
/*   8:    */   public cil(World world, GameProfile paramGameProfile)
/*   9:    */   {
/*  10: 40 */     super(world, paramGameProfile);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public boolean v()
/*  14:    */   {
/*  15: 45 */     ces localces = bsu.z().t().a(cc().getId());
/*  16: 46 */     return (localces != null) && (localces.b() == EnumGameType.e);
/*  17:    */   }
/*  18:    */   
/*  19:    */   public boolean a()
/*  20:    */   {
/*  21: 50 */     return b() != null;
/*  22:    */   }
/*  23:    */   
/*  24:    */   protected ces b()
/*  25:    */   {
/*  26: 55 */     if (this.a == null) {
/*  27: 56 */       this.a = bsu.z().t().a(getUUID());
/*  28:    */     }
/*  29: 58 */     return this.a;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean g()
/*  33:    */   {
/*  34: 62 */     ces localces = b();
/*  35: 63 */     return (localces != null) && (localces.e());
/*  36:    */   }
/*  37:    */   
/*  38:    */   public oa i()
/*  39:    */   {
/*  40: 67 */     ces localces = b();
/*  41: 68 */     return localces == null ? cva.a(getUUID()) : localces.g();
/*  42:    */   }
/*  43:    */   
/*  44:    */   public oa k()
/*  45:    */   {
/*  46: 73 */     ces localces = b();
/*  47: 74 */     return localces == null ? null : localces.h();
/*  48:    */   }
/*  49:    */   
/*  50:    */   public static ctq a(oa paramoa, String paramString)
/*  51:    */   {
/*  52: 78 */     cug localcug = bsu.z().N();
/*  53:    */     
/*  54: 80 */     Object localObject = localcug.b(paramoa);
/*  55: 81 */     if (localObject == null)
/*  56:    */     {
/*  57: 82 */       localObject = new ctq(null, String.format("http://skins.minecraft.net/MinecraftSkins/%s.png", new Object[] { vb.a(paramString) }), cva.a(b(paramString)), new ckr());
/*  58: 83 */       localcug.a(paramoa, (cui)localObject);
/*  59:    */     }
/*  60: 86 */     return (ctq)localObject;
/*  61:    */   }
/*  62:    */   
/*  63:    */   public static oa c(String paramString)
/*  64:    */   {
/*  65: 90 */     return new oa("skins/" + vb.a(paramString));
/*  66:    */   }
/*  67:    */   
/*  68:    */   public String l()
/*  69:    */   {
/*  70: 98 */     ces localces = b();
/*  71: 99 */     return localces == null ? cva.b(getUUID()) : localces.f();
/*  72:    */   }
/*  73:    */   
/*  74:    */   public float o()
/*  75:    */   {
/*  76:103 */     float f1 = 1.0F;
/*  77:106 */     if (this.by.b) {
/*  78:107 */       f1 *= 1.1F;
/*  79:    */     }
/*  80:109 */     xz localxz = a(afs.d);
/*  81:110 */     f1 = (float)(f1 * ((localxz.e() / this.by.b() + 1.0D) / 2.0D));
/*  82:112 */     if ((this.by.b() == 0.0F) || (Float.isNaN(f1)) || (Float.isInfinite(f1))) {
/*  83:113 */       f1 = 1.0F;
/*  84:    */     }
/*  85:117 */     if ((bR()) && (bP().getItem() == ItemList.f))
/*  86:    */     {
/*  87:118 */       int i = bS();
/*  88:119 */       float f2 = i / 20.0F;
/*  89:120 */       if (f2 > 1.0F) {
/*  90:121 */         f2 = 1.0F;
/*  91:    */       } else {
/*  92:123 */         f2 *= f2;
/*  93:    */       }
/*  94:125 */       f1 *= (1.0F - f2 * 0.15F);
/*  95:    */     }
/*  96:128 */     return f1;
/*  97:    */   }
/*  98:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cil
 * JD-Core Version:    0.7.0.1
 */