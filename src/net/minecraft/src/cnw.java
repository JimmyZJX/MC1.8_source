package net.minecraft.src;
/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture;
/*   3:    */ import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
/*   4:    */ import java.util.Map;
/*   5:    */ import java.util.UUID;
/*   6:    */ 
/*   7:    */ public class cnw
/*   8:    */   extends cnp<bdm>
/*   9:    */ {
/*  10: 22 */   private static final oa d = new oa("textures/entity/skeleton/skeleton.png");
/*  11: 23 */   private static final oa e = new oa("textures/entity/skeleton/wither_skeleton.png");
/*  12: 24 */   private static final oa f = new oa("textures/entity/zombie/zombie.png");
/*  13: 25 */   private static final oa g = new oa("textures/entity/creeper/creeper.png");
/*  14:    */   public static cnw c;
/*  15: 30 */   private final cdb h = new cdb(0, 0, 64, 32);
/*  16: 31 */   private final cdb i = new cck();
/*  17:    */   
/*  18:    */   public void a(bdm parambdm, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat, int paramInt)
/*  19:    */   {
/*  20: 36 */     EnumDirection localej = EnumDirection.a(parambdm.u() & 0x7);
/*  21:    */     
/*  22: 38 */     a((float)paramDouble1, (float)paramDouble2, (float)paramDouble3, localej, parambdm.d() * 360 / 16.0F, parambdm.c(), parambdm.b(), paramInt);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(cno paramcno)
/*  26:    */   {
/*  27: 43 */     super.a(paramcno);
/*  28: 44 */     c = this;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void a(float paramFloat1, float paramFloat2, float paramFloat3, EnumDirection paramej, float paramFloat4, int paramInt1, GameProfile paramGameProfile, int paramInt2)
/*  32:    */   {
/*  33: 48 */     cdb localcdb = this.h;
/*  34: 50 */     if (paramInt2 >= 0)
/*  35:    */     {
/*  36: 51 */       a(a[paramInt2]);
/*  37: 52 */       cjm.glMatrixMode(5890);
/*  38: 53 */       cjm.glPushMatrix();
/*  39: 54 */       cjm.glScalef(4.0F, 2.0F, 1.0F);
/*  40: 55 */       cjm.glTranslatef(0.0625F, 0.0625F, 0.0625F);
/*  41: 56 */       cjm.glMatrixMode(5888);
/*  42:    */     }
/*  43:    */     else
/*  44:    */     {
/*  45: 58 */       switch (paramInt1)
/*  46:    */       {
/*  47:    */       case 0: 
/*  48:    */       default: 
/*  49: 61 */         a(d);
/*  50: 62 */         break;
/*  51:    */       case 1: 
/*  52: 64 */         a(e);
/*  53: 65 */         break;
/*  54:    */       case 2: 
/*  55: 67 */         a(f);
/*  56: 68 */         localcdb = this.i;
/*  57: 69 */         break;
/*  58:    */       case 3: 
/*  59: 71 */         localcdb = this.i;
/*  60: 72 */         oa localoa = cva.a();
/*  61: 74 */         if (paramGameProfile != null)
/*  62:    */         {
/*  63: 75 */           bsu localbsu = bsu.z();
/*  64: 76 */           Map localMap = localbsu.Z().a(paramGameProfile);
/*  65: 77 */           if (localMap.containsKey(MinecraftProfileTexture.Type.SKIN))
/*  66:    */           {
/*  67: 78 */             localoa = localbsu.Z().a((MinecraftProfileTexture)localMap.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
/*  68:    */           }
/*  69:    */           else
/*  70:    */           {
/*  71: 81 */             UUID localUUID = EntityPlayer.a(paramGameProfile);
/*  72: 82 */             localoa = cva.a(localUUID);
/*  73:    */           }
/*  74:    */         }
/*  75: 86 */         a(localoa);
/*  76: 87 */         break;
/*  77:    */       case 4: 
/*  78: 89 */         a(g);
/*  79:    */       }
/*  80:    */     }
/*  81: 94 */     cjm.glPushMatrix();
/*  82: 95 */     cjm.p();
/*  83: 97 */     if (paramej != EnumDirection.UP) {
/*  84: 98 */       switch (cnx.a[paramej.ordinal()])
/*  85:    */       {
/*  86:    */       case 1: 
/*  87:100 */         cjm.glTranslatef(paramFloat1 + 0.5F, paramFloat2 + 0.25F, paramFloat3 + 0.74F);
/*  88:101 */         break;
/*  89:    */       case 2: 
/*  90:103 */         cjm.glTranslatef(paramFloat1 + 0.5F, paramFloat2 + 0.25F, paramFloat3 + 0.26F);
/*  91:104 */         paramFloat4 = 180.0F;
/*  92:105 */         break;
/*  93:    */       case 3: 
/*  94:107 */         cjm.glTranslatef(paramFloat1 + 0.74F, paramFloat2 + 0.25F, paramFloat3 + 0.5F);
/*  95:108 */         paramFloat4 = 270.0F;
/*  96:109 */         break;
/*  97:    */       case 4: 
/*  98:    */       default: 
/*  99:112 */         cjm.glTranslatef(paramFloat1 + 0.26F, paramFloat2 + 0.25F, paramFloat3 + 0.5F);
/* 100:113 */         paramFloat4 = 90.0F;
/* 101:114 */         break;
/* 102:    */       }
/* 103:    */     } else {
/* 104:117 */       cjm.glTranslatef(paramFloat1 + 0.5F, paramFloat2, paramFloat3 + 0.5F);
/* 105:    */     }
/* 106:120 */     float f1 = 0.0625F;
/* 107:121 */     cjm.B();
/* 108:122 */     cjm.glScalef(-1.0F, -1.0F, 1.0F);
/* 109:    */     
/* 110:124 */     cjm.enableAlphaTest();
/* 111:    */     
/* 112:126 */     localcdb.a(null, 0.0F, 0.0F, 0.0F, paramFloat4, 0.0F, f1);
/* 113:    */     
/* 114:128 */     cjm.glPopMatrix();
/* 115:130 */     if (paramInt2 >= 0)
/* 116:    */     {
/* 117:131 */       cjm.glMatrixMode(5890);
/* 118:132 */       cjm.glPopMatrix();
/* 119:133 */       cjm.glMatrixMode(5888);
/* 120:    */     }
/* 121:    */   }
/* 122:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     cnw
 * JD-Core Version:    0.7.0.1
 */