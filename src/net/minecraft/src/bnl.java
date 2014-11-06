package net.minecraft.src;
/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bnl
/*   5:    */   extends bno
/*   6:    */ {
/*   7:    */   private int a;
/*   8:    */   
/*   9:    */   public bnl() {}
/*  10:    */   
/*  11:    */   public bnl(bnk parambnk, int paramInt, Random paramRandom, bjb parambjb, EnumDirection paramej)
/*  12:    */   {
/*  13:530 */     super(parambnk, paramInt);
/*  14:    */     
/*  15:532 */     this.m = paramej;
/*  16:533 */     this.l = parambjb;
/*  17:534 */     this.a = Math.max(parambjb.c(), parambjb.e());
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected void a(NBTTagCompound paramfn)
/*  21:    */   {
/*  22:539 */     super.a(paramfn);
/*  23:540 */     paramfn.setInt("Length", this.a);
/*  24:    */   }
/*  25:    */   
/*  26:    */   protected void b(NBTTagCompound paramfn)
/*  27:    */   {
/*  28:545 */     super.b(paramfn);
/*  29:546 */     this.a = paramfn.getInteger("Length");
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void a(bms parambms, List paramList, Random paramRandom)
/*  33:    */   {
/*  34:551 */     int i = 0;
/*  35:    */     
/*  36:    */ 
/*  37:554 */     int j = paramRandom.nextInt(5);
/*  38:    */     bms localbms;
/*  39:555 */     while (j < this.a - 8)
/*  40:    */     {
/*  41:556 */       localbms = a((bnk)parambms, paramList, paramRandom, 0, j);
/*  42:557 */       if (localbms != null)
/*  43:    */       {
/*  44:558 */         j += Math.max(localbms.l.c(), localbms.l.e());
/*  45:559 */         i = 1;
/*  46:    */       }
/*  47:561 */       j += 2 + paramRandom.nextInt(5);
/*  48:    */     }
/*  49:565 */     j = paramRandom.nextInt(5);
/*  50:566 */     while (j < this.a - 8)
/*  51:    */     {
/*  52:567 */       localbms = b((bnk)parambms, paramList, paramRandom, 0, j);
/*  53:568 */       if (localbms != null)
/*  54:    */       {
/*  55:569 */         j += Math.max(localbms.l.c(), localbms.l.e());
/*  56:570 */         i = 1;
/*  57:    */       }
/*  58:572 */       j += 2 + paramRandom.nextInt(5);
/*  59:    */     }
/*  60:575 */     if ((i != 0) && (paramRandom.nextInt(3) > 0) && (this.m != null)) {
/*  61:576 */       switch (bmz.a[this.m.ordinal()])
/*  62:    */       {
/*  63:    */       case 1: 
/*  64:578 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.c, EnumDirection.WEST, d());
/*  65:579 */         break;
/*  66:    */       case 2: 
/*  67:581 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.a - 1, this.l.b, this.l.f - 2, EnumDirection.WEST, d());
/*  68:582 */         break;
/*  69:    */       case 4: 
/*  70:584 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.d - 2, this.l.b, this.l.c - 1, EnumDirection.NORTH, d());
/*  71:585 */         break;
/*  72:    */       case 3: 
/*  73:587 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.a, this.l.b, this.l.c - 1, EnumDirection.NORTH, d());
/*  74:    */       }
/*  75:    */     }
/*  76:591 */     if ((i != 0) && (paramRandom.nextInt(3) > 0) && (this.m != null)) {
/*  77:592 */       switch (bmz.a[this.m.ordinal()])
/*  78:    */       {
/*  79:    */       case 1: 
/*  80:594 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.c, EnumDirection.EAST, d());
/*  81:595 */         break;
/*  82:    */       case 2: 
/*  83:597 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.d + 1, this.l.b, this.l.f - 2, EnumDirection.EAST, d());
/*  84:598 */         break;
/*  85:    */       case 4: 
/*  86:600 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.d - 2, this.l.b, this.l.f + 1, EnumDirection.SOUTH, d());
/*  87:601 */         break;
/*  88:    */       case 3: 
/*  89:603 */         bmy.b((bnk)parambms, paramList, paramRandom, this.l.a, this.l.b, this.l.f + 1, EnumDirection.SOUTH, d());
/*  90:    */       }
/*  91:    */     }
/*  92:    */   }
/*  93:    */   
/*  94:    */   public static bjb a(bnk parambnk, List paramList, Random paramRandom, int paramInt1, int paramInt2, int paramInt3, EnumDirection paramej)
/*  95:    */   {
/*  96:610 */     int i = 7 * MathUtils.nextInt(paramRandom, 3, 5);
/*  97:612 */     while (i >= 7)
/*  98:    */     {
/*  99:613 */       bjb localbjb = bjb.a(paramInt1, paramInt2, paramInt3, 0, 0, 0, 3, 3, i, paramej);
/* 100:615 */       if (bms.a(paramList, localbjb) == null) {
/* 101:616 */         return localbjb;
/* 102:    */       }
/* 103:618 */       i -= 7;
/* 104:    */     }
/* 105:621 */     return null;
/* 106:    */   }
/* 107:    */   
/* 108:    */   public boolean a(World paramaqu, Random paramRandom, bjb parambjb)
/* 109:    */   {
/* 110:626 */     Block localbec1 = a(BlockList.gravel.instance());
/* 111:627 */     Block localbec2 = a(BlockList.cobblestone.instance());
/* 112:628 */     for (int i = this.l.a; i <= this.l.d; i++) {
/* 113:629 */       for (int j = this.l.c; j <= this.l.f; j++)
/* 114:    */       {
/* 115:630 */         BlockPosition localdt = new BlockPosition(i, 64, j);
/* 116:631 */         if (parambjb.b(localdt))
/* 117:    */         {
/* 118:632 */           localdt = paramaqu.r(localdt).down();
/* 119:633 */           paramaqu.setBlock(localdt, localbec1, 2);
/* 120:634 */           paramaqu.setBlock(localdt.down(), localbec2, 2);
/* 121:    */         }
/* 122:    */       }
/* 123:    */     }
/* 124:639 */     return true;
/* 125:    */   }
/* 126:    */ }


/* Location:           C:\Minecraft1.7.5\.minecraft\versions\1.8\1.8.jar
 * Qualified Name:     bnl
 * JD-Core Version:    0.7.0.1
 */