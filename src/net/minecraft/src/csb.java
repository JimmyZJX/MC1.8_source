package net.minecraft.src;
/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import java.util.Map;
/*   3:    */ 
/*   4:    */ public abstract class csb<T extends ccq>
/*   5:    */   implements csq<EntityLiving>
/*   6:    */ {
/*   7: 18 */   protected static final oa b = new oa("textures/misc/enchanted_item_glint.png");
/*   8:    */   protected T c;
/*   9:    */   protected T d;
/*  10:    */   private final cqv a;
/*  11: 24 */   private float e = 1.0F;
/*  12: 25 */   private float f = 1.0F;
/*  13: 26 */   private float g = 1.0F;
/*  14: 27 */   private float h = 1.0F;
/*  15:    */   private boolean i;
/*  16:    */   
/*  17:    */   public csb(cqv paramcqv)
/*  18:    */   {
/*  19: 32 */     this.a = paramcqv;
/*  20:    */     
/*  21: 34 */     a();
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/*  25:    */   {
/*  26: 39 */     a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, 4);
/*  27: 40 */     a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, 3);
/*  28: 41 */     a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, 2);
/*  29: 42 */     a(paramxm, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7, 1);
/*  30:    */   }
/*  31:    */   
/*  32:    */   public boolean b()
/*  33:    */   {
/*  34: 47 */     return false;
/*  35:    */   }
/*  36:    */   
/*  37:    */   private void a(EntityLiving paramxm, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, int paramInt)
/*  38:    */   {
/*  39: 64 */     ItemStack localamj = a(paramxm, paramInt);
/*  40: 65 */     if ((localamj == null) || (!(localamj.getItem() instanceof ItemArmor))) {
/*  41: 66 */       return;
/*  42:    */     }
/*  43: 69 */     ItemArmor localajn = (ItemArmor)localamj.getItem();
/*  44:    */     
/*  45: 71 */     T localccq = a(paramInt);
/*  46:    */     
/*  47: 73 */     localccq.a(this.a.b());
/*  48: 74 */     localccq.a(paramxm, paramFloat1, paramFloat2, paramFloat3);
/*  49:    */     
/*  50: 76 */     a(localccq, paramInt);
/*  51:    */     
/*  52: 78 */     boolean bool = b(paramInt);
/*  53: 79 */     this.a.a(a(localajn, bool));
/*  54: 81 */     switch (csc.a[localajn.w_().ordinal()])
/*  55:    */     {
/*  56:    */     case 1: 
/*  57: 84 */       int k = localajn.b(localamj);
/*  58: 85 */       float f1 = (k >> 16 & 0xFF) / 255.0F;
/*  59: 86 */       float f2 = (k >> 8 & 0xFF) / 255.0F;
/*  60: 87 */       float f3 = (k & 0xFF) / 255.0F;
/*  61:    */       
/*  62: 89 */       cjm.c(this.f * f1, this.g * f2, this.h * f3, this.e);
/*  63: 90 */       localccq.a(paramxm, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/*  64:    */       
/*  65:    */ 
/*  66: 93 */       this.a.a(a(localajn, bool, "overlay"));
/*  67:    */     case 2: 
/*  68:    */     case 3: 
/*  69:    */     case 4: 
/*  70:    */     case 5: 
/*  71:100 */       cjm.c(this.f, this.g, this.h, this.e);
/*  72:101 */       localccq.a(paramxm, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/*  73:    */     }
/*  74:106 */     if ((!this.i) && (localamj.hasEnchantment())) {
/*  75:107 */       a(paramxm, localccq, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/*  76:    */     }
/*  77:    */   }
/*  78:    */   
/*  79:    */   public ItemStack a(EntityLiving paramxm, int paramInt)
/*  80:    */   {
/*  81:113 */     return paramxm.getArmor(paramInt - 1);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public T a(int paramInt)
/*  85:    */   {
/*  86:117 */     return b(paramInt) ? this.c : this.d;
/*  87:    */   }
/*  88:    */   
/*  89:    */   private boolean b(int paramInt)
/*  90:    */   {
/*  91:121 */     return paramInt == 2;
/*  92:    */   }
/*  93:    */   
/*  94:    */   private void a(EntityLiving paramxm, T paramccq, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7)
/*  95:    */   {
/*  96:125 */     float f1 = paramxm.W + paramFloat3;
/*  97:126 */     this.a.a(b);
/*  98:    */     
/*  99:128 */     cjm.enableBlend();
/* 100:129 */     cjm.c(514);
/* 101:130 */     cjm.a(false);
/* 102:    */     
/* 103:132 */     float f2 = 0.5F;
/* 104:133 */     cjm.c(f2, f2, f2, 1.0F);
/* 105:135 */     for (int k = 0; k < 2; k++)
/* 106:    */     {
/* 107:136 */       cjm.disableLighting();
/* 108:137 */       cjm.glBlendFunc(768, 1);
/* 109:    */       
/* 110:139 */       float f3 = 0.76F;
/* 111:140 */       cjm.c(0.5F * f3, 0.25F * f3, 0.8F * f3, 1.0F);
/* 112:    */       
/* 113:142 */       cjm.glMatrixMode(5890);
/* 114:143 */       cjm.glLoadIdentity();
/* 115:    */       
/* 116:145 */       float f4 = 0.3333333F;
/* 117:146 */       cjm.glScalef(f4, f4, f4);
/* 118:    */       
/* 119:148 */       cjm.glRotatef(30.0F - k * 60.0F, 0.0F, 0.0F, 1.0F);
/* 120:149 */       cjm.glTranslatef(0.0F, f1 * (0.001F + k * 0.003F) * 20.0F, 0.0F);
/* 121:150 */       cjm.glMatrixMode(5888);
/* 122:    */       
/* 123:152 */       paramccq.a(paramxm, paramFloat1, paramFloat2, paramFloat4, paramFloat5, paramFloat6, paramFloat7);
/* 124:    */     }
/* 125:155 */     cjm.glMatrixMode(5890);
/* 126:156 */     cjm.glLoadIdentity();
/* 127:157 */     cjm.glMatrixMode(5888);
/* 128:    */     
/* 129:159 */     cjm.enableLighting();
/* 130:    */     
/* 131:161 */     cjm.a(true);
/* 132:162 */     cjm.c(515);
/* 133:163 */     cjm.disableBlend();
/* 134:    */   }
/* 135:    */   
/* 136:166 */   private static final Map<String,oa> j = Maps.newHashMap();
/* 137:    */   
/* 138:    */   private oa a(ItemArmor paramajn, boolean paramBoolean)
/* 139:    */   {
/* 140:169 */     return a(paramajn, paramBoolean, null);
/* 141:    */   }
/* 142:    */   
/* 143:    */   private oa a(ItemArmor paramajn, boolean paramBoolean, String paramString)
/* 144:    */   {
/* 145:173 */     String str = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[] { paramajn.w_().getName(), Integer.valueOf(paramBoolean ? 2 : 1), paramString == null ? "" : String.format("_%s", new Object[] { paramString }) });
/* 146:    */     
/* 147:175 */     oa localoa = (oa)j.get(str);
/* 148:176 */     if (localoa == null)
/* 149:    */     {
/* 150:177 */       localoa = new oa(str);
/* 151:178 */       j.put(str, localoa);
/* 152:    */     }
/* 153:181 */     return localoa;
/* 154:    */   }
/* 155:    */   
/* 156:    */   protected abstract void a();
/* 157:    */   
/* 158:    */   protected abstract void a(T paramccq, int paramInt);
/* 159:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     csb
 * JD-Core Version:    0.7.0.1
 */