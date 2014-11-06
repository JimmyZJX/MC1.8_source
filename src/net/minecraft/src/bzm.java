package net.minecraft.src;
/*   2:    */ import org.lwjgl.input.Keyboard;
/*   3:    */ 
/*   4:    */ public class bzm
/*   5:    */   extends bxf
/*   6:    */ {
/*   7:    */   private bdj a;
/*   8:    */   private int f;
/*   9:    */   private int g;
/*  10:    */   private bug h;
/*  11:    */   
/*  12:    */   public bzm(bdj parambdj)
/*  13:    */   {
/*  14: 26 */     this.a = parambdj;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void b()
/*  18:    */   {
/*  19: 31 */     this.n.clear();
/*  20: 32 */     Keyboard.enableRepeatEvents(true);
/*  21: 33 */     this.n.add(this.h = new bug(0, this.l / 2 - 100, this.m / 4 + 120, cwc.a("gui.done", new Object[0])));
/*  22: 34 */     this.a.a(false);
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void m()
/*  26:    */   {
/*  27: 39 */     Keyboard.enableRepeatEvents(false);
/*  28: 40 */     cee localcee = this.j.t();
/*  29: 41 */     if (localcee != null) {
/*  30: 42 */       localcee.a(new mu(this.a.v(), this.a.a));
/*  31:    */     }
/*  32: 44 */     this.a.a(true);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public void e()
/*  36:    */   {
/*  37: 49 */     this.f += 1;
/*  38:    */   }
/*  39:    */   
/*  40:    */   protected void a(bug parambug)
/*  41:    */   {
/*  42: 54 */     if (!parambug.l) {
/*  43: 55 */       return;
/*  44:    */     }
/*  45: 58 */     if (parambug.k == 0)
/*  46:    */     {
/*  47: 59 */       this.a.o_();
/*  48: 60 */       this.j.a((bxf)null);
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void a(char paramChar, int paramInt)
/*  53:    */   {
/*  54: 66 */     if (paramInt == 200) {
/*  55: 67 */       this.g = (this.g - 1 & 0x3);
/*  56:    */     }
/*  57: 69 */     if ((paramInt == 208) || (paramInt == 28) || (paramInt == 156)) {
/*  58: 70 */       this.g = (this.g + 1 & 0x3);
/*  59:    */     }
/*  60: 72 */     String str = this.a.a[this.g].c();
/*  61: 73 */     if ((paramInt == 14) && (str.length() > 0)) {
/*  62: 74 */       str = str.substring(0, str.length() - 1);
/*  63:    */     }
/*  64: 76 */     if ((v.a(paramChar)) && (this.q.a(str + paramChar) <= 90)) {
/*  65: 77 */       str = str + paramChar;
/*  66:    */     }
/*  67: 79 */     this.a.a[this.g] = new hy(str);
/*  68: 80 */     if (paramInt == 1) {
/*  69: 81 */       a(this.h);
/*  70:    */     }
/*  71:    */   }
/*  72:    */   
/*  73:    */   public void a(int paramInt1, int paramInt2, float paramFloat)
/*  74:    */   {
/*  75: 87 */     c();
/*  76:    */     
/*  77: 89 */     a(this.q, cwc.a("sign.edit", new Object[0]), this.l / 2, 40, 16777215);
/*  78: 90 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/*  79:    */     
/*  80: 92 */     cjm.glPushMatrix();
/*  81: 93 */     cjm.glTranslatef(this.l / 2, 0.0F, 50.0F);
/*  82: 94 */     float f1 = 93.75F;
/*  83: 95 */     cjm.glScalef(-f1, -f1, -f1);
/*  84: 96 */     cjm.glRotatef(180.0F, 0.0F, 1.0F, 0.0F);
/*  85:    */     
/*  86: 98 */     ProtoBlock localatr = this.a.w();
/*  87:100 */     if (localatr == BlockList.an)
/*  88:    */     {
/*  89:101 */       float f2 = this.a.u() * 360 / 16.0F;
/*  90:102 */       cjm.glRotatef(f2, 0.0F, 1.0F, 0.0F);
/*  91:    */       
/*  92:104 */       cjm.glTranslatef(0.0F, -1.0625F, 0.0F);
/*  93:    */     }
/*  94:    */     else
/*  95:    */     {
/*  96:106 */       int i = this.a.u();
/*  97:107 */       float f3 = 0.0F;
/*  98:109 */       if (i == 2) {
/*  99:110 */         f3 = 180.0F;
/* 100:    */       }
/* 101:112 */       if (i == 4) {
/* 102:113 */         f3 = 90.0F;
/* 103:    */       }
/* 104:115 */       if (i == 5) {
/* 105:116 */         f3 = -90.0F;
/* 106:    */       }
/* 107:118 */       cjm.glRotatef(f3, 0.0F, 1.0F, 0.0F);
/* 108:119 */       cjm.glTranslatef(0.0F, -1.0625F, 0.0F);
/* 109:    */     }
/* 110:122 */     if (this.f / 6 % 2 == 0) {
/* 111:123 */       this.a.f = this.g;
/* 112:    */     }
/* 113:126 */     cno.a.a(this.a, -0.5D, -0.75D, -0.5D, 0.0F);
/* 114:127 */     this.a.f = -1;
/* 115:    */     
/* 116:129 */     cjm.glPopMatrix();
/* 117:    */     
/* 118:131 */     super.a(paramInt1, paramInt2, paramFloat);
/* 119:    */   }
/* 120:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bzm
 * JD-Core Version:    0.7.0.1
 */